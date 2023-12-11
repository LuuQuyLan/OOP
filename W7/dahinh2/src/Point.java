import java.util.Objects;

public class Point {
    private double pointX;
    private double pointY;

    /**
     * plz.
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    /**
     * plz.
     */
    public double getPointX() {
        return pointX;
    }

    /**
     * plz.
     */
    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /**
     * plz.
     */
    public double getPointY() {
        return pointY;
    }

    /**
     * plz.
     */
    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * plz.
     */
    public double distance(Point newPoint) {
        return Math.sqrt(Math.pow(pointX - newPoint.pointX, 2)
                + Math.pow(pointY - newPoint.pointY, 2));
    }

    /**
     * plz.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Point point = (Point) o;
        return Double.compare(pointX, point.pointX) == 0
                && Double.compare(pointY, point.pointY) == 0;
    }

    /**
     * plz.
     */
    @Override
    public int hashCode() {
        return Objects.hash(pointX, pointY);
    }

    /**
     * plz.
     */
    public String toString() {
        return "(" + pointX + "," + pointY + ")";
    }


}
