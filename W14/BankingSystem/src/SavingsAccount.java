public class SavingsAccount extends Account {

    private static final double MIN_BALANCE = 5000.0;
    private static final double MAX_WITHDRAWAL = 1000.0;

    public SavingsAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        try {
            if (amount > MAX_WITHDRAWAL || balance - amount < MIN_BALANCE) {
                throw new IllegalArgumentException(
                        "Số tiền rút vượt quá giới hạn hoặc số dư không đủ.");
            }
            doWithdrawing(amount);
            addTransaction(new Transaction(Transaction.TYPE_WITHDRAW_SAVINGS,
                    amount, balance + amount, balance));
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    @Override
    public void deposit(double amount) {
        try {
            doDepositing(amount);
            addTransaction(new Transaction(Transaction.TYPE_DEPOSIT_SAVINGS,
                    amount, balance - amount, balance));
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

}