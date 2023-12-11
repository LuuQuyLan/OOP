public class Square extends Rectangle {
    /**
     * plz.
     */
    public Square() {
    }

    /**
     * plz.
     */
    public Square(double side) {
        super(side, side);
    }

    /**
     * constructor.
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * plz.
     */
    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    /**
     * plz.
     */
    public double getSide() {
        return width;
    }

    /**
     * plz.
     */
    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    /**
     * plz.
     */
    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    /**
     * plz.
     */
    @Override
    public void setLength(double side) {
        this.width = side;
        this.length = side;
    }

    /**
     * check equal.
     */
    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    /**
     * plz.
     */
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * plz.
     */
    @Override
    public String toString() {
        String s = "Square[topLeft=" + topLeft + ",side=" + length
                + ",color=" + color + ",filled=" + filled + "]";
        return s;
    }
}
