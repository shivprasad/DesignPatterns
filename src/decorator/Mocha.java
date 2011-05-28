package decorator;

/**
 * Created by IntelliJ IDEA.
 * User: shiv
 * Date: Dec 27, 2009
 * Time: 2:25:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class Mocha implements Beverage {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public int cost() {
        return 5 + beverage.cost();
    }
}
