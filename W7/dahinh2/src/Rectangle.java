import java.util.Objects;

public class Rectangle extends Shape {
    protected Point topLeft;
    protected double width;
    protected double length;

    /**
     * plz.
     */
    public Rectangle() {
    }

    /**
     * plz.
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * constructor.
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * constructor with full elements.
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
    }

    /**
     * plz.
     */
    public Point getTopLeft() {
        return topLeft;
    }

    /**
     * plz.
     */
    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /**
     * plz.
     */
    public double getWidth() {
        return width;
    }

    /**
     * plz.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * plz.
     */
    public double getLength() {
        return length;
    }

    /**
     * plz.
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * plz.
     */
    @Override
    public double getArea() {
        return width * length;
    }

    /**
     * plz.
     */
    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    /**
     * check equal.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(width, rectangle.width) == 0
                && Double.compare(length, rectangle.length) == 0
                && Objects.equals(topLeft, rectangle.topLeft);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topLeft, width, length);
    }

    @Override
    public String toString() {
        String s = "Rectangle[topLeft=" + topLeft + ",width=" + width + ",length=" + length
                + ",color=" + color + ",filled=" + filled + "]";
        return s;
    }
}
