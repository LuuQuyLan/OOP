public class ExpressionTest {
    /**
     * test.
     */
    public static void main(String[] args) {
        Expression test = new Square(
                new Addition(
                        new Subtraction(
                            new Square(new Numeral(10)),
                                new Numeral(3)),
                        new Multiplication(new Numeral(4), new Numeral(3))));
        System.out.println("Expression: " + test.toString());
        System.out.println("Result: " + test.evaluate());
    }
}
