package ec.devsu.code.jam;

/**
 * ColorFinder
 */
public class ColorFinder {
    private enum Color {
        BLACK("black"), WHITE("white");

        private String description = "";

        Color(String description) {
            this.description = description;
        }

    }

    public String findColor(int x, int y) {
        double radious = Math.sqrt(x * x + y * y);
        if (x == 0 && y == 0) {
            return Color.BLACK.description;
        }
        if (x * y > 0) {
            Color color = findColorByRadious(Color.BLACK, radious, 0d, 1d);
            return color.description;
        } else {
            Color color = findColorByRadious(Color.WHITE, radious, 0d, 1d);
            return color.description;
        }

    }

    private Color findColorByRadious(Color color, double radious, double rpreviuos, double ractual) {

        if (rpreviuos < radious && radious < ractual) {
            return color;
        }
        if (radious == ractual) {
            return Color.BLACK;
        }
        return findColorByRadious(color == Color.BLACK ? Color.WHITE : Color.BLACK, radious, rpreviuos + 1d,
                ractual + 1d);

    }

}