package law.of.demeter;

public class Wallet {
    private int money;

    public Wallet(int money) {
        this.money = money;
    }

    public void addMoney(int inMoney) {
        money += inMoney;
    }

    public int takeOut(int outMoney) {
        if (outMoney < money) {
            money -= outMoney;
            return outMoney;
        } else {
            return 0;
        }

    }


    public boolean hasMoney(int bill) {
        return bill < money;
    }
}
