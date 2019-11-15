package ec.devsu.code.jam;

/**
 * MixName
 */
public class PeasentMultiply {
    public int multiply(int x, int y) {
        if (x == 0) {
            return 0;
        }
        int x1 = (x / 2);
        int y1 = (y + y);
        int prod = multiply(x1, y1);
        if (x % 2 != 0) {
            prod = prod + y;
        }
        return prod;

    }
}