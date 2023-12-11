import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList;

    public Account() {
        balance = 0.00;
        transitionList = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
    * deposit.
    */
    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
            return;
        }
        balance += amount;
    }

    /**
    * withdraw.
    */
    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
            return;
        } 
        if (amount > this.balance) {
            System.out.println("So tien ban rut vuot qua so du!");
            return;
        }
        balance -= amount;
    }

    /**
    * add transaction.
    */
    public void addTransaction(double amount, String operation) {
        if (operation != Transaction.DEPOSIT && operation != Transaction.WITHDRAW) {
            System.out.println("Yeu cau khong hop le!");
        } else {
            if (operation == Transaction.DEPOSIT) {
                deposit(amount);
                Transaction t = new Transaction(operation, amount, balance);
                transitionList.add(t);  
                return;
            } 
            if (operation == Transaction.WITHDRAW) {
                withdraw(amount);
                Transaction t = new Transaction(operation, amount, balance);
                transitionList.add(t);  
                return;
            } 
        }
    }

    /**
    * print transasction. 
    */
    public void printTransaction() {
        for (int i = 0; i < transitionList.size(); i++) {
            String operation = "";
            if (transitionList.get(i).getOperation() == Transaction.DEPOSIT) {
                operation = "Nap tien";
            }
            if (transitionList.get(i).getOperation() == Transaction.WITHDRAW) {
                operation = "Rut tien";
            }
            Double amount = transitionList.get(i).getAmount();
            Double balance = transitionList.get(i).getBalance();
            System.out.print("Giao dich " + (i + 1) + ": " + operation + " $");
            System.out.printf("%.2f", amount);
            System.out.print(". So du luc nay: $");
            System.out.printf("%.2f", balance);
            System.out.println(".");
        }
    }
}