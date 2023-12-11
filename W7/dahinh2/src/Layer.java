import java.util.ArrayList;
import java.util.List;

public class Layer {
    private List<Shape> shapes = new ArrayList<>();

    /**
     * plz.
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * plz.
     */
    public void removeCircles() {
        shapes.removeIf(shape -> shape instanceof Circle);
    }

    /**
     * return info.
     */
    public String getInfo() {
        StringBuilder info = new StringBuilder("Layer of crazy shapes:\n");

        for (Shape shape : shapes) {
            info.append(shape).append("\n");
        }
        return info.toString();
    }

    /**
     * remove Duplicates.
     */
    public void removeDuplicates() {
        for (int i = 0; i < shapes.size(); i++) {
            Shape newShape = shapes.get(i);
            for (int j = 0; j < shapes.size(); j++) {
                if (shapes.get(j).equals(newShape)) {
                    shapes.remove(j);
                }
            }
            shapes.add(i, newShape);
        }
    }
}
