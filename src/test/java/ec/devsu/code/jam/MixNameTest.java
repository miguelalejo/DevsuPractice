package ec.devsu.code.jam;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * MixNameTest
 */
public class MixNameTest {

    MixName mixName = new MixName();

    @Test
    void shouldBeMixTwoNames() {
        String[] firstNames = new String[] { "Miguel", "Alejandro" };
        String[] lastNames = new String[] {};
        assertArrayEquals(new String[] { "Miguel Alejandro", "Alejandro Miguel" },
                mixName.generateFullNames(new String[] {}, firstNames));
    }

    @Test
    void shouldBeMixThreeNames() {
        String[] firstNames = new String[] { "Miguel", "Alejandro", "Jose" };
        String[] lastNames = new String[] {};
        assertArrayEquals(
                new String[] { "Miguel Alejandro Jose", "Miguel Jose Alejandro", "Alejandro Miguel Jose",
                        "Alejandro Jose Miguel", "Jose Miguel Alejandro", "Jose Alejandro Miguel" },
                mixName.generateFullNames(new String[] {}, firstNames));
    }

    @Test
    void shouldBeMixFourNames() {
        String[] firstNames = new String[] { "MIGUEL", "MANUEL", "JOSE", "ALEJANDRO" };
        String[] lastNames = new String[] {};
        assertArrayEquals(new String[] { "MIGUEL MANUEL JOSE ALEJANDRO", "MIGUEL MANUEL ALEJANDRO JOSE",
                "MIGUEL JOSE MANUEL ALEJANDRO", "MIGUEL JOSE ALEJANDRO MANUEL", "MIGUEL ALEJANDRO MANUEL JOSE",
                "MIGUEL ALEJANDRO JOSE MANUEL", "MANUEL MIGUEL JOSE ALEJANDRO", "MANUEL MIGUEL ALEJANDRO JOSE",
                "MANUEL JOSE MIGUEL ALEJANDRO", "MANUEL JOSE ALEJANDRO MIGUEL", "MANUEL ALEJANDRO MIGUEL JOSE",
                "MANUEL ALEJANDRO JOSE MIGUEL", "JOSE MIGUEL MANUEL ALEJANDRO", "JOSE MIGUEL ALEJANDRO MANUEL",
                "JOSE MANUEL MIGUEL ALEJANDRO", "JOSE MANUEL ALEJANDRO MIGUEL", "JOSE ALEJANDRO MIGUEL MANUEL",
                "JOSE ALEJANDRO MANUEL MIGUEL", "ALEJANDRO MIGUEL MANUEL JOSE", "ALEJANDRO MIGUEL JOSE MANUEL",
                "ALEJANDRO MANUEL MIGUEL JOSE", "ALEJANDRO MANUEL JOSE MIGUEL", "ALEJANDRO JOSE MIGUEL MANUEL",
                "ALEJANDRO JOSE MANUEL MIGUEL" }, mixName.generateFullNames(new String[] {}, firstNames));
    }

    @Test
    void shouldBeA() {
        assertEquals("A", mixName.concatenarCadenas("A", 0));
    }

    @Test
    void shouldBeAB() {
        assertEquals("AB", mixName.concatenarCadenas("AB", 0));
    }

}