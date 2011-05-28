package factory.method;

import factory.Pizza;
import factory.PizzaStore;
import factory.PizzaType;

/**
 * Created by IntelliJ IDEA.
 * User: shiv
 * Date: Dec 27, 2009
 * Time: 2:48:33 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class PizzaHutPizzaStore implements PizzaStore {

    public Pizza orderPizza(PizzaType pizzaType) {
        Pizza pizza = createPizza(pizzaType);
        System.out.printf("[%s] created [%s] pizza\n", getClass().getName(), pizza.getType());
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println("-----------------out for delivery-------------------");
        return pizza;
    }

    public abstract Pizza createPizza(PizzaType pizzaType);

}