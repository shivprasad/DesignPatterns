package gof.structural.proxy;

public class BankAccountListProxy implements AccountsList {

    private BankAccountsList list;


    @Override
    public void displayAccounts() {
        if (list == null) {
            list = new BankAccountsList();
        }
        list.displayAccounts();
    }

}
