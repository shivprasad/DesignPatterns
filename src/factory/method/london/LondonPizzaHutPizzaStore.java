package factory.method.london;

import factory.Pizza;
import factory.method.PizzaHutPizzaStore;
import factory.PizzaType;

/**
 * Created by IntelliJ IDEA.
 * User: shiv
 * Date: Jan 1, 2010
 * Time: 12:30:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class LondonPizzaHutPizzaStore extends PizzaHutPizzaStore {
    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza = null;
        switch (pizzaType) {
            case PLAIN:
                pizza = new LondonPlainPizza();
                break;
            case CHEESE:
                pizza = new LondonCheesePizza();
                break;
            case STUFFED_CRUST:
                pizza = new LondonStuffedCrustPizza();
                break;
            case VEGGIE:
                pizza = new LondonVeggiePizza();
                break;
            default:
                pizza = new LondonPlainPizza();
                break;
        }
        return pizza;

    }
}
