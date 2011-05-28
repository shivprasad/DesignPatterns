package factory.simple;

import factory.Pizza;
import factory.simple.PizzaFactory;
import factory.PizzaStore;
import factory.PizzaType;

/**
 * Created by IntelliJ IDEA.
 * User: shiv
 * Date: Dec 27, 2009
 * Time: 2:48:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class SimplePizzaHutPizzaStore implements PizzaStore {
    private PizzaFactory pizzaFactory;

    public SimplePizzaHutPizzaStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(PizzaType pizzaType) {
        Pizza pizza = pizzaFactory.createPizza(pizzaType);
        System.out.printf("[%s] created [%s] pizza\n", pizzaFactory.getClass().getName(), pizza.getType());
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println("-----------------out for delivery-------------------");
        return pizza;
    }

}
