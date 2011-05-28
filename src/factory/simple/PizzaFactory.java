package factory.simple;

import factory.Pizza;
import factory.PizzaType;

/**
 * Created by IntelliJ IDEA.
 * User: shiv
 * Date: Dec 27, 2009
 * Time: 3:14:15 PM
 * To change this template use File | Settings | File Templates.
 */
public interface PizzaFactory {
    Pizza createPizza(PizzaType pizzaType);
}
