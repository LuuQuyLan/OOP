import java.util.ArrayList;
import java.util.List;

public class Customer {
    private long idNumber;
    private String fullName;
    private List<Account> accountList = new ArrayList<>();

    public Customer() {}

    public Customer(long idNumber, String fullName) {
        this.idNumber = idNumber;
        this.fullName = fullName;
    }

    /**
     * LuuQuyLan 22024513.
     */
    public String getCustomerInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Số CMND: ").append(idNumber)
                .append(". Họ tên: ").append(fullName).append(".\n");
        return info.toString();
    }

    /**
     * LuuQuyLan 22024513.
     */
    public void addAccount(Account account) {
        for (Account acc : accountList) {
            if (acc.equals(account)) {
                return;
            }
        }
        accountList.add(account);
    }

    /**
     * LuuQuyLan 22024513.
     */
    public void removeAccount(Account account) {
        for (int i = 0; i < accountList.size(); i++) {
            Account acc = accountList.get(i);
            if (acc.equals(account)) {
                accountList.remove(i);
                i--;
            }
        }
    }

    public long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    @Override
    public String toString() {
        return String.format("Số CMND: %d. Họ tên: %s.", idNumber, fullName);
    }
}
