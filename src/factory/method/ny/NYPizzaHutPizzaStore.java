package factory.method.ny;

import factory.Pizza;
import factory.method.PizzaHutPizzaStore;
import factory.PizzaType;
import factory.method.ny.NYCheesePizza;
import factory.method.ny.NYPlainPizza;
import factory.method.ny.NYStuffedCrustPizza;
import factory.method.ny.NYVeggiePizza;

/**
 * Created by IntelliJ IDEA.
 * User: shiv
 * Date: Jan 1, 2010
 * Time: 12:21:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class NYPizzaHutPizzaStore extends PizzaHutPizzaStore {
    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza = null;
        switch (pizzaType) {
            case PLAIN:
                pizza = new NYPlainPizza();
                break;
            case CHEESE:
                pizza = new NYCheesePizza();
                break;
            case STUFFED_CRUST:
                pizza = new NYStuffedCrustPizza();
                break;
            case VEGGIE:
                pizza = new NYVeggiePizza();
                break;
            default:
                pizza = new NYPlainPizza();
                break;
        }
        return pizza;
    }
}
