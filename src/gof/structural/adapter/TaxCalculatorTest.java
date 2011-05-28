package gof.structural.adapter;

public class TaxCalculatorTest {

    static class IncomeTaxAdapter implements IncomeTax {
        private OldIndiaIncomeTaxCalculator old = new OldIndiaIncomeTaxCalculator();

        @Override
        public String calculate(int i) {
            return String.valueOf(old.taxOn(i));
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Tax tax = new Tax(new IndiaIncomeTax());
        Tax tax2 = new Tax(new IncomeTaxAdapter());
        System.out.println(tax.calculate(10000));
        System.out.println(tax2.calculate(10000));
    }


}
