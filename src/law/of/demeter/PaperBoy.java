package law.of.demeter;

public class PaperBoy {
    private int bill;
    private Customer customer;

    public PaperBoy(int bill, Customer customer) {
        this.bill = bill;
        this.customer = customer;
    }

    public int chargeCustomer() {
        return customer.getPayment(bill);
    }


    public static void main(String[] args) {
        Customer customer = new Customer("Shiv", "Bade", new Wallet(100));
        PaperBoy paperBoy = new PaperBoy(100, customer);
        int chargedAmt = paperBoy.chargeCustomer();
        System.out.println("Paperboy charged - " + chargedAmt);

    }
}
