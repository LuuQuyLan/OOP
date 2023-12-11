import java.util.List;

public class ShapeUtil {
    /**
     * print info.
     */
    public String printInfo(List<GeometricObject> shapes) {
        String s = "Circle:\n";
        for (GeometricObject shape : shapes) {
            if (shape instanceof Circle) {
                s = s + shape.getInfo() + "\n";
            }
        }
        s = s + "Triangle:\n";
        for (GeometricObject shape : shapes) {
            if (shape instanceof Triangle) {
                s = s + shape.getInfo() + "\n";
            }
        }
        return s;
    }
}
