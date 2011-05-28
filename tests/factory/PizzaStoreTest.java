package factory;

import factory.simple.SimplePizzaFactory;
import factory.simple.SimplePizzaHutPizzaStore;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: shiv
 * Date: Dec 27, 2009
 * Time: 2:41:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class PizzaStoreTest {

    @Test
    public void shouldBeAbleToOrderPizza(){
        PizzaStore pizzaStore = new SimplePizzaHutPizzaStore(new SimplePizzaFactory());
        Pizza pizza = pizzaStore.orderPizza(PizzaType.PLAIN);
        assertEquals("plain",pizza.getType());
        pizza = pizzaStore.orderPizza(PizzaType.CHEESE);
        assertEquals("cheese",pizza.getType());
        pizza = pizzaStore.orderPizza(PizzaType.STUFFED_CRUST);
        assertEquals("stuffed-crust",pizza.getType());
        pizza = pizzaStore.orderPizza(PizzaType.VEGGIE);
        assertEquals("veggie",pizza.getType());
    }
}
