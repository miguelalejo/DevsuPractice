package ec.devsu.code.jam;

import java.util.ArrayList;
import java.util.List;

import ec.devsu.code.api.LinePosition;
import ec.devsu.code.api.LineType;
import ec.devsu.code.api.Point;

/**
 * Octagon
 */
public class Octagon {

    public String[][] createOctaton(int dimension) {
        if(dimension<2 || dimension>255){
            throw new RuntimeException("Not valid parameter");
        }
        int dimesionTotal = calculateSize(dimension);
        String[][] octatonMatrix = new String[dimesionTotal][dimesionTotal];
        List<Point> listPoint = createPoints(dimension);
        for (int i = 0; i < listPoint.size(); i++) {
            Point point = listPoint.get(i);
            octatonMatrix[point.getX()][point.getY()] = "*";
        }
        return octatonMatrix;

    }

    public int calculateSize(int dimension) {
        int dimesionTotal = (2 * (dimension - 1)) + dimension;
        return dimesionTotal;
    }

    public List<Point> createPoints(int dimension) {

        List<Point> pointsHorizontalUp = createPointsHorizontalUp(dimension);

        List<Point> pointsHorizontalDown = createPointsHorizontalDown(dimension);

        List<Point> pointsVerticalLeft = createPointsVerticalLeft(dimension);

        List<Point> pointsVerticalRight = createPointsVerticalRight(dimension);

        List<Point> pointsDiagonalUpLeft = createPointsDiagonalUpLeft(dimension);

        List<Point> pointsDiagonalUpRight = createPointsDiagonalUpRight(dimension);

        List<Point> pointsDiagonalDownLeft = createPointsDiagonalDownLeft(dimension);

        List<Point> pointsDiagonalDownRight = createPointsDiagonalDownRight(dimension);
        List<Point> listPointsMatrix = new ArrayList<Point>();
        listPointsMatrix.addAll(pointsHorizontalUp);
        listPointsMatrix.addAll(pointsHorizontalDown);
        listPointsMatrix.addAll(pointsVerticalLeft);
        listPointsMatrix.addAll(pointsVerticalRight);
        listPointsMatrix.addAll(pointsDiagonalUpLeft);
        listPointsMatrix.addAll(pointsDiagonalUpRight);
        listPointsMatrix.addAll(pointsDiagonalDownLeft);
        listPointsMatrix.addAll(pointsDiagonalDownRight);
        return listPointsMatrix;
    }

    public List<Point> createPointsDiagonalDownRight(int dimension) {
        List<Point> pointsDiagonalDownRight = new ArrayList<Point>();
        int startXPointDDR = startXPoint(LineType.Diagonal, LinePosition.DownRight, dimension);
        int startYPointDDR = startYPoint(LineType.Diagonal, LinePosition.DownRight, dimension);
        for (int i = 0; i < dimension; i++) {
            pointsDiagonalDownRight.add(new Point(startXPointDDR - i, startYPointDDR + i));
        }
        return pointsDiagonalDownRight;
    }

    public List<Point> createPointsDiagonalDownLeft(int dimension) {
        List<Point> pointsDiagonalDownLeft = new ArrayList<Point>();
        int startXPointDDL = startXPoint(LineType.Diagonal, LinePosition.DownLeft, dimension);
        int startYPointDDL = startYPoint(LineType.Diagonal, LinePosition.DownLeft, dimension);
        for (int i = 0; i < dimension; i++) {
            pointsDiagonalDownLeft.add(new Point(startXPointDDL - i, startYPointDDL - i));
        }
        return pointsDiagonalDownLeft;
    }

    public List<Point> createPointsDiagonalUpRight(int dimension) {
        List<Point> pointsDiagonalUpRight = new ArrayList<Point>();
        int startXPointDUR = startXPoint(LineType.Diagonal, LinePosition.UpRight, dimension);
        int startYPointDUR = startYPoint(LineType.Diagonal, LinePosition.UpRight, dimension);
        for (int i = 0; i < dimension; i++) {
            pointsDiagonalUpRight.add(new Point(startXPointDUR + i, startYPointDUR + i));
        }
        return pointsDiagonalUpRight;
    }

    public List<Point> createPointsDiagonalUpLeft(int dimension) {
        List<Point> pointsDiagonalUpLeft = new ArrayList<Point>();
        int startXPointDUL = startXPoint(LineType.Diagonal, LinePosition.UpLeft, dimension);
        int startYPointDUL = startYPoint(LineType.Diagonal, LinePosition.UpLeft, dimension);
        for (int i = 0; i < dimension; i++) {
            pointsDiagonalUpLeft.add(new Point(startXPointDUL + i, startYPointDUL - i));
        }
        return pointsDiagonalUpLeft;
    }

    public List<Point> createPointsVerticalRight(int dimension) {
        List<Point> pointsVerticalRight = new ArrayList<Point>();
        int startXPointVR = startXPoint(LineType.Vertical, LinePosition.Right, dimension);
        int startYPointVR = startYPoint(LineType.Vertical, LinePosition.Right, dimension);
        for (int i = 0; i < dimension; i++) {
            pointsVerticalRight.add(new Point(startXPointVR + i, startYPointVR));
        }
        return pointsVerticalRight;
    }

    public List<Point> createPointsVerticalLeft(int dimension) {
        List<Point> pointsVeritalLeft = new ArrayList<Point>();
        int startXPointVL = startXPoint(LineType.Vertical, LinePosition.Leff, dimension);
        int startYPointVL = startYPoint(LineType.Vertical, LinePosition.Leff, dimension);
        for (int i = 0; i < dimension; i++) {
            pointsVeritalLeft.add(new Point(startXPointVL + i, startYPointVL));
        }
        return pointsVeritalLeft;
    }

    public List<Point> createPointsHorizontalDown(int dimension) {
        List<Point> pointsHorizontalDown = new ArrayList<Point>();
        int startXPointHD = startXPoint(LineType.Horizontal, LinePosition.Down, dimension);
        int startYPointHD = startYPoint(LineType.Horizontal, LinePosition.Down, dimension);
        for (int i = 0; i < dimension; i++) {
            pointsHorizontalDown.add(new Point(startXPointHD, startYPointHD + i));
        }
        return pointsHorizontalDown;
    }

    public List<Point> createPointsHorizontalUp(int dimension) {
        List<Point> pointsHorizontalUp = new ArrayList<Point>();
        int startXPointHU = startXPoint(LineType.Horizontal, LinePosition.Up, dimension);
        int startYPointHU = startYPoint(LineType.Horizontal, LinePosition.Up, dimension);
        for (int i = 0; i < dimension; i++) {
            pointsHorizontalUp.add(new Point(startXPointHU, startYPointHU + i));
        }
        return pointsHorizontalUp;
    }

    // X row
    // Y cols

    public int startXPoint(LineType lineType, LinePosition linePosition, int dimension) {
        if (LineType.Horizontal.equals(lineType)) {
            if (LinePosition.Up.equals(linePosition)) {
                return 0;
            }
            if (LinePosition.Down.equals(linePosition)) {
                return (2 * (dimension - 1)) + (dimension - 1);
            }
        }
        if (LineType.Vertical.equals(lineType)) {
            if (LinePosition.Leff.equals(linePosition)) {
                return dimension - 1;
            }
            if (LinePosition.Right.equals(linePosition)) {
                return dimension - 1;
            }
        }
        if (LineType.Diagonal.equals(lineType)) {
            if (LinePosition.UpLeft.equals(linePosition)) {
                return 0;
            }
            if (LinePosition.UpRight.equals(linePosition)) {
                return 0;
            }
            if (LinePosition.DownLeft.equals(linePosition)) {
                return (2 * (dimension - 1)) + (dimension - 1);
            }
            if (LinePosition.DownRight.equals(linePosition)) {
                return (2 * (dimension - 1)) + (dimension - 1);
            }
        }
        throw new RuntimeException("Not valid path");

    }

    public int startYPoint(LineType lineType, LinePosition linePosition, int dimension) {
        if (LineType.Horizontal.equals(lineType)) {
            if (LinePosition.Up.equals(linePosition)) {
                return dimension - 1;
            }
            if (LinePosition.Down.equals(linePosition)) {
                return dimension - 1;
            }
        }
        if (LineType.Vertical.equals(lineType)) {
            if (LinePosition.Leff.equals(linePosition)) {
                return 0;
            }
            if (LinePosition.Right.equals(linePosition)) {
                return (2 * (dimension - 1)) + (dimension - 1);
            }
        }
        if (LineType.Diagonal.equals(lineType)) {
            if (LinePosition.UpLeft.equals(linePosition)) {
                return dimension - 1;
            }
            if (LinePosition.UpRight.equals(linePosition)) {
                return (dimension - 1) + (dimension - 1);
            }
            if (LinePosition.DownLeft.equals(linePosition)) {
                return dimension - 1;
            }
            if (LinePosition.DownRight.equals(linePosition)) {
                return (dimension - 1) + (dimension - 1);
            }
        }
        throw new RuntimeException("Not valid path");

    }
}