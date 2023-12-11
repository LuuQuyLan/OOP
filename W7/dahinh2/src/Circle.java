import java.util.Objects;

public class Circle extends Shape {
    protected Point center;
    protected double radius;

    /**
     * plz.
     */
    public Circle() {
    }

    /**
     * plz.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * plz.
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * constructor with full elements.
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.center = center;
        this.radius = radius;
    }

    /**
     * plz.
     */
    public Point getCenter() {
        return center;
    }

    /**
     * plz.
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * plz.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * plz.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * plz.
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * plz.
     */
    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    /**
     * plz.
     */
    @Override
    public String toString() {
        String s = "Circle[center=" + center + ",radius=" + radius
                + ",color=" + color + ",filled=" + filled + "]";
        return s;
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
        Circle circle = (Circle) o;
        return Double.compare(radius, circle.radius) == 0 && Objects.equals(center, circle.center);
    }

    /**
     * plz.
     */
    @Override
    public int hashCode() {
        return Objects.hash(center, radius);
    }
}
