import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Bank {
    private List<Customer> customerList = new ArrayList<>();

    /**
     * LuuQuyLan 22024513.
     */
    public void readCustomerList(InputStream inputStream) {
        Scanner scanner = new Scanner(inputStream, "utf-8");
        List<String> lines = new ArrayList<>();
        String line = "";
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            lines.add(line);
        }
        scanner.close();
        for (int i = 0; i < lines.size(); i++) {
            if (Character.isLetter(lines.get(i).charAt(0))) {
                Customer customer = new Customer();
                String[] items = lines.get(i).split(" ");
                long idNumber = Long.parseLong(items[items.length - 1]);
                String fullName = lines.get(i).replace(" " + items[items.length - 1], "");
                customer.setIdNumber(idNumber);
                customer.setFullName(fullName);
                customerList.add(customer);
            } else {
                String[] items = lines.get(i).split(" ");
                if (items[1].equals(Account.CHECKING)) {
                    customerList.get(customerList.size() - 1).addAccount(
                            new CheckingAccount(
                                    Long.parseLong(items[0]),
                                    Double.parseDouble(items[2])));
                } else {
                    customerList.get(customerList.size() - 1).addAccount(
                            new SavingsAccount(
                                    Long.parseLong(items[0]),
                                    Double.parseDouble(items[2])));
                }

            }
        }
    }

    /**
     * LuuQuyLan 22024513.
     */
    public String getCustomersInfoByNameOrder() {
        Collections.sort(customerList, Comparator.comparing(Customer::getFullName));
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < customerList.size(); i++) {
            s.append((i != customerList.size() - 1)
                    ? customerList.get(i).toString() + "\n" : customerList.get(i).toString());
        }
        return s.toString();
    }

    /**
     * LuuQuyLan 22024513.
     */
    public String getCustomersInfoByIdOrder() {
        Collections.sort(customerList, (o1, o2) -> (int) (o1.getIdNumber() - o2.getIdNumber()));
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < customerList.size(); i++) {
            s.append((i != customerList.size() - 1)
                    ? customerList.get(i).toString() + "\n" : customerList.get(i).toString());
        }
        return s.toString();
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }
}
