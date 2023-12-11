public class Subtraction extends BinaryExpression {
    public Subtraction(Expression left, Expression right) {
        super(left, right);
    }

    public String toString() {
        return left.toString() + " - " + right.toString();
    }

    @Override
    public double evaluate() {
        return left.evaluate() - right.evaluate();
    }
}