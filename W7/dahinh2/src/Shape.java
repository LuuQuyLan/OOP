// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public abstract class Shape {
    protected String color;
    protected boolean filled;

    /**
     * plz.
     */
    public Shape() {
    }

    /**
     * plz.
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * plz.
     */
    public String getColor() {
        return color;
    }

    /**
     * plz.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * plz.
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * plz.
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * plz.
     */
    public abstract double getArea();

    /**
     * plz.
     */
    public abstract double getPerimeter();

    /**
     * plz.
     */
    @Override
    public String toString() {
        String s = "Shape[color=" + color + ",filled=" + filled + "]";
        return s;
    }
}
