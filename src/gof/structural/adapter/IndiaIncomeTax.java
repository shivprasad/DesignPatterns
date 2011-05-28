package gof.structural.adapter;

public class IndiaIncomeTax implements IncomeTax {

    @Override
    public String calculate(int i) {
        return String.valueOf(i * 0.30);
    }

}
