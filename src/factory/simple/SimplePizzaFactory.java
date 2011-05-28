package factory.simple;

import factory.Pizza;
import factory.simple.PizzaFactory;
import factory.PizzaType;
import factory.simple.CheesePizza;
import factory.simple.PlainPizza;
import factory.simple.StuffedCrustPizza;
import factory.simple.VeggiePizza;

/**
 * Created by IntelliJ IDEA.
 * User: shiv
 * Date: Dec 27, 2009
 * Time: 3:11:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class SimplePizzaFactory implements PizzaFactory {
    public Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza = null;
        switch (pizzaType) {
            case PLAIN:
                pizza = new PlainPizza();
                break;
            case CHEESE:
                pizza = new CheesePizza();
                break;
            case STUFFED_CRUST:
                pizza = new StuffedCrustPizza();
                break;
            case VEGGIE:
                pizza = new VeggiePizza();
                break;
            default:
                pizza = new PlainPizza();
                break;
        }
        return pizza;
    }
}
