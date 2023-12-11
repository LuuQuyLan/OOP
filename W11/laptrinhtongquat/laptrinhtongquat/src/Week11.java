import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Week11<T extends Comparable<T>> {
    private List<T> list = new ArrayList<>();

    /**
     * sort generic.
     */
    public static <T extends Comparable<T>> List<T> sortGeneric(List<T> list) {
        if (list.isEmpty() || !(list.get(0) instanceof Comparable)) {
            System.out.println("Invalid or empty list.");
            return list;
        }
        Collections.sort(list);
        return list;
    }
}