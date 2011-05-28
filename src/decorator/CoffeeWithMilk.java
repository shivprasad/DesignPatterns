package decorator;

/**
 * Created by IntelliJ IDEA.
 * User: shiv
 * Date: Dec 27, 2009
 * Time: 2:11:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class CoffeeWithMilk implements Beverage {
    private Beverage beverage;

    public CoffeeWithMilk(Beverage beverage) {
        super();
        this.beverage = beverage;
    }

    public int cost() {
        return 5 + beverage.cost();
    }
}
