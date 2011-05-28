package gof.structural.proxy;

import java.util.Date;


public class ProxyTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Current Time - " + new Date());
        AccountsList list = new BankAccountsList();
        System.out.println("Current Time - " + new Date());
        list = new BankAccountListProxy();
        System.out.println("Current Time - " + new Date());
    }

}
