public class InsufficientFundsException extends BankException {
    /**
     * LuuQuyLan 22024513.
     */
    public InsufficientFundsException(double amount) {
        super("Số dư tài khoản không đủ $"
                + String.format("%.2f", amount)
                + " để thực hiện giao dịch");
    }
}
