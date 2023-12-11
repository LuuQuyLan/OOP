import java.io.FileNotFoundException;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Week8Task2 {
    /**
     * NullPointerException.
     */
    public void nullPointerEx() {
        throw new NullPointerException("Lỗi Null Pointer");
    }

    /**
     * NullPointerException.
     */
    public String nullPointerExTest() {
        try {
            nullPointerEx();
        } catch (NullPointerException e) {
            return e.getMessage();
        }
        return "Không có lỗi";
    }

    /**
     * ArrayIndexOutOfBoundsException.
     */
    public void arrayIndexOutOfBoundsEx() {
        throw new ArrayIndexOutOfBoundsException("Lỗi Array Index Out of Bounds");
    }

    /**
     * ArrayIndexOutOfBoundsException.
     */
    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
        } catch (ArrayIndexOutOfBoundsException e) {
            return e.getMessage();
        }
        return "Không có lỗi";
    }

    /**
     * ArithmeticException.
     */
    public void arithmeticEx() {
        throw new ArithmeticException("Lỗi Arithmetic");
    }

    /**
     * ArithmeticException.
     */
    public String arithmeticExTest() {
        try {
            arithmeticEx();
        } catch (ArithmeticException e) {
            return e.getMessage();
        }
        return "Không có lỗi";
    }

    /**
     * FileNotFoundException.
     */
    public void fileNotFoundEx() throws FileNotFoundException {
        throw new FileNotFoundException("Lỗi File Not Found");
    }

    /**
     * FileNotFoundException.
     */
    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
        } catch (FileNotFoundException e) {
            return e.getMessage();
        }
        return "Không có lỗi";
    }

    /**
     * IOException.
     */
    public void ioEx() throws IOException {
        throw new IOException("Lỗi IO");
    }

    /**
     * IOException.
     */
    public String ioExTest() {
        try {
            ioEx();
        } catch (IOException e) {
            return e.getMessage();
        }
        return "Không có lỗi";
    }
}