package law.of.demeter;

public class Customer {
    private String firstName;
    private String lastName;
    private Wallet wallet;

    public Customer(String fName, String lName, Wallet wallet) {
        firstName = fName;
        lastName = lName;
        this.wallet = wallet;
    }

    public int getPayment(int bill) {
        if (wallet.hasMoney(bill)) {
            return wallet.takeOut(bill);
        }
        return 0;
    }
}
