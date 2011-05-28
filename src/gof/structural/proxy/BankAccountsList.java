package gof.structural.proxy;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class BankAccountsList implements AccountsList {

    public BankAccountsList() {
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void displayAccounts() {
        System.out.println(Arrays.asList(1, 2, 3, 4));
    }

}
