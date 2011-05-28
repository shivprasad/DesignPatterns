package gof.structural.adapter;

public class Tax {

    private final IncomeTax incomeTax;

    public Tax(IncomeTax incomeTax) {
        this.incomeTax = incomeTax;
    }

    public String calculate(int i) {
        return incomeTax.calculate(i);
    }

}
