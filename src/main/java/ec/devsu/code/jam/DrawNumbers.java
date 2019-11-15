package ec.devsu.code.jam;

/**
 * DrawNumbers
 */
public class DrawNumbers {
    private int dimension = 3;
    String[][] numberOne = new String[][] { new String[] { " ", " ", "*" }, new String[] { " ", " ", "*" },
            new String[] { " ", " ", "*" }, new String[] { " ", " ", "*" }, new String[] { " ", " ", "*" } };
    String[][] numberTwo = new String[][] { new String[] { "*", "*", "*" }, new String[] { " ", " ", "*" },
            new String[] { "*", "*", "*" }, new String[] { "*", " ", " " }, new String[] { "*", "*", "*" } };
    String[][] numberThree = new String[][] { new String[] { "*", "*", "*" }, new String[] { " ", " ", "*" },
            new String[] { " ", "*", "*" }, new String[] { " ", " ", "*" }, new String[] { "*", "*", "*" } };
    String[][] numberFour = new String[][] { new String[] { "*", " ", "*" }, new String[] { "*", " ", "*" },
            new String[] { "*", "*", "*" }, new String[] { " ", " ", "*" }, new String[] { " ", " ", "*" } };
    String[][] numberFive = new String[][] { new String[] { "*", "*", "*" }, new String[] { "*", " ", " " },
            new String[] { "*", "*", "*" }, new String[] { " ", " ", "*" }, new String[] { "*", "*", "*" } };
    String[][] numberSix = new String[][] { new String[] { "*", "*", "*" }, new String[] { "*", " ", " " },
            new String[] { "*", "*", "*" }, new String[] { "*", " ", "*" }, new String[] { "*", "*", "*" } };
    String[][] numberSeven = new String[][] { new String[] { "*", "*", "*" }, new String[] { "*", " ", "*" },
            new String[] { " ", " ", "*" }, new String[] { " ", " ", "*" }, new String[] { " ", " ", "*" } };
    String[][] numberEight = new String[][] { new String[] { "*", "*", "*" }, new String[] { "*", " ", "*" },
            new String[] { "*", "*", "*" }, new String[] { "*", " ", "*" }, new String[] { "*", "*", "*" } };
    String[][] numberNine = new String[][] { new String[] { "*", "*", "*" }, new String[] { "*", " ", "*" },
            new String[] { "*", "*", "*" }, new String[] { " ", " ", "*" }, new String[] { " ", " ", "*" } };
    String[][] numberZero = new String[][] { new String[] { "*", "*", "*" }, new String[] { "*", " ", "*" },
            new String[] { "*", " ", "*" }, new String[] { "*", " ", "*" }, new String[] { "*", "*", "*" } };
    String[][] space = new String[][] { new String[] { " " }, new String[] { " " }, new String[] { " " },
            new String[] { " " }, new String[] { " " } };
    String[][] letterE = new String[][] { new String[] { "*", "*", "*" }, new String[] { "*", " ", " " },
            new String[] { "*", "*", " " }, new String[] { "*", " ", " " }, new String[] { "*", "*", "*" } };
    String[][] letterR = new String[][] { new String[] { "*", "*", "*" }, new String[] { "*", " ", "*" },
            new String[] { "*", "*", " " }, new String[] { "*", "*", " " }, new String[] { "*", " ", "*" } };

    public String[][] printNumber(int number) {
        if (number < 0 || number > 99) {
            return concatMatrixes(letterE, letterR);
        }
        int numberDec=number/10;
        int numberInt=number%10;
        String[][]matrixNumberDec=findMatrixNumber(numberDec);
        String[][]matrixNumberInt=findMatrixNumber(numberInt);
        return concatMatrixes(matrixNumberDec, matrixNumberInt);
    }

    private String[][] concatMatrixes(String[][] a, String[][] b) {
        String[][] temp = new String[5][7];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                temp[i][j] = a[i][j];
            }
        }
        String[][] space = this.space;
        int k=3;

        for (int i = 0; i < space.length; i++) {
            for (int j = 0; j < space[i].length; j++) {
                temp[i][j+k] = space[i][j];
            }            
        }
        int m=4;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                temp[i][j+m] = b[i][j];
            }            
        }
        return temp;       

    }

    private String[][] findMatrixNumber(int number) {
        switch (number) {
        case 1:
            return this.numberOne;
        case 2:
            return this.numberTwo;
        case 3:
            return this.numberThree;
        case 4:
            return this.numberFour;
        case 5:
            return this.numberFive;
        case 6:
            return this.numberSix;
        case 7:
            return this.numberSeven;
        case 8:
            return this.numberEight;
        case 9:
            return this.numberNine;
        case 0:
            return this.numberZero;
        }
        throw new RuntimeException("Error number not registred");

    }

}