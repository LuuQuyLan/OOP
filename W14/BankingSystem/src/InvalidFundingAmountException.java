public class InvalidFundingAmountException extends BankException {
    /**
     * LuuQuyLan 22024513.
     */
    public InvalidFundingAmountException(double amount) {
        super("Số tiền không hợp lệ: $" + String.format("%.2f", amount));
    }
}
