package decorator;

/**
 * Created by IntelliJ IDEA.
 * User: shiv
 * Date: Dec 27, 2009
 * Time: 2:26:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class Hazelnul implements Beverage {
    private Beverage beverage;

    public Hazelnul(Beverage beverage) {
        this.beverage = beverage;
    }

    public int cost() {
        return 5 + beverage.cost();
    }
}
