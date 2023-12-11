public class Square extends Rectangle {
    public Square() {
    }

    public Square(double size) {
        super(size, size);
    }

    /**
     * constructor.
     */
    public Square(double size, String color, boolean filled) {
        super(size, size, color, filled);
    }

    public double getSize() {
        return width;
    }

    public void setSize(double size) {
        this.width = size;
        this.length = size;
    }

    public void setWidth(double size) {
        super.setWidth(size);
        super.setLength(size);
    }

    @Override
    public void setLength(double size) {
        super.setWidth(size);
        super.setLength(size);
    }

    @Override
    public String toString() {
        String s = "Square[size=" + length + ",color=" + color + ",filled=" + filled + "]";
        return s;
    }
}
