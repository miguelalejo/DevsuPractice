package ec.devsu.code.jam;

import java.util.ArrayList;
import java.util.List;

/**
 * MixName
 */
public class MixName {

    public String[] generateFullNames(String[] pivote, String[] nombres) {
        if (nombres.length == 0) {
            return pivote;
        }
        List<String[]> listaNombresNuevo = new ArrayList<String[]>();
        for (int i = 0; i < nombres.length; i++) {
            String[] nombresTemp = crearArregloNombreSinIndice(nombres, i);
            listaNombresNuevo.add(generateFullNames(combinarNombres(pivote, nombres[i]), nombresTemp));
        }

        List<String> listaNombresFinal = new ArrayList<String>();
        for (String[] nombresRes : listaNombresNuevo) {
            for (String nombre : nombresRes) {
                if (nombre != null) {
                    listaNombresFinal.add(nombre);
                }

            }
        }

        return listaNombresFinal.toArray(new String[listaNombresFinal.size()]);
    }

    private String[] combinarNombres(String[] listaNombresPivote, String nombre) {
        List<String> listaNombresNuevo = new ArrayList<>();
        String nombreCombibados = "";
        for (int i = 0; i < listaNombresPivote.length; i++) {
            if (listaNombresPivote[i] != null) {
                nombreCombibados += listaNombresPivote[i] + " ";
            }

        }
        if (nombre == null) {
            listaNombresNuevo.add(nombreCombibados);
        } else {
            listaNombresNuevo.add(nombreCombibados + nombre);
        }

        return listaNombresNuevo.toArray(new String[listaNombresNuevo.size()]);

    }

    public String[] crearArregloNombreSinIndice(String[] nombres, int inidce) {
        List<String> cadena = new ArrayList<>();
        for (int i = 0; i < nombres.length; i++) {
            if (i != inidce) {
                cadena.add(nombres[i]);
            }
        }
        return cadena.toArray(new String[cadena.size()]);
    }

    public String concatenarCadenas(String cadena, int index) {
        if (cadena.length() == 1) {
            return String.valueOf(cadena.charAt(0));
        }
        String cadenaTemp = cadena.substring(index + 1);
        return String.valueOf(cadena.charAt(index)) + concatenarCadenas(cadenaTemp, index++);
    }
    // ABC //ABC //
    // BC -> //CB
    // C -> //B

    public String concatenar(String pivote, String cadena) {
        if (cadena.length() == 0) {
            return pivote + "-";
        }
        String cadenaTem = "";
        for (int i = 0; i < cadena.length(); i++) {
            String cadenaCabecera = cadena.substring(0, i);
            String cadenaFinal = cadena.substring(i + 1, cadena.length());
            cadenaTem += concatenar(pivote + String.valueOf(cadena.charAt(i)), cadenaCabecera + cadenaFinal);

        }
        return cadenaTem;

    }

    public String concatenarS(String pivote, String cadena) {
        if (cadena.length() == 0) {
            return pivote + "-";
        }
        String cadenaTem = "";
        for (int i = 0; i < cadena.length(); i++) {
            String cadenaCabecera = crearSubCadenaSinIndice(cadena, i);
            cadenaTem += concatenar(pivote + String.valueOf(cadena.charAt(i)), cadenaCabecera);
        }
        return cadenaTem;
    }

    public String concatenarCab(String pivote, String cadena) {
        if (cadena.length() == 0) {
            return pivote + "-";
        }
        String cadenaTem = "";
        for (int i = 0; i < cadena.length(); i++) {
            String cadenaCabecera = crearSubCadenaSinIndice(cadena, i);
            cadenaTem += concatenar(pivote + String.valueOf(cadena.charAt(i)), cadenaCabecera);
        }
        return cadenaTem;
    }

    public String crearSubCadenaSinIndice(String cadena, int indice) {
        String cadenaSinIndice = "";
        for (int i = 0; i < cadena.length(); i++) {
            if (i != indice) {
                cadenaSinIndice += String.valueOf(cadena.charAt(i));
            }
        }
        return cadenaSinIndice;
    }

    public String combinar(String pivote, String cadena, String cadenaOri) {
        if (cadena.length() == 0) {
            return pivote + "-";
        } else {
            String cadenaRes = "";
            for (int c = 0; c < cadena.length(); c++) {
                String cadenaTemp = cadena.substring(0, cadena.length() - 1);
                cadenaRes += combinar(pivote + String.valueOf(cadena.charAt(c)), cadenaTemp, cadenaOri);
                for (int k = 0; k < cadena.length();) {
                    if (k != c) {
                        String cadenaTempB = cadena.substring(0, cadenaTemp.length() - 1);
                        cadenaRes += combinar(String.valueOf(cadenaOri.charAt(k)), cadenaTempB, cadenaOri);
                        
                    }
                    k++;

                }

            }
            return cadenaRes + "/";
        }

    }

}