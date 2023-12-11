public class Division extends BinaryExpression {
    public Division(Expression left, Expression right) {
        super(left, right);
    }

    public String toString() {
        return left.toString() + " / " + right.toString();
    }

    @Override
    public double evaluate() {
        double rightValue = right.evaluate();
        if (rightValue == 0.0) {
            throw new ArithmeticException("Lỗi chia cho 0");
        }
        double leftValue = left.evaluate();
        return leftValue / rightValue;
    }
}
