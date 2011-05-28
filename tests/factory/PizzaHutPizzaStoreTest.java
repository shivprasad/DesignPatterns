package factory;

import factory.ingredient.LondonIngredientsPizzaStore;
import factory.ingredient.NYIngredientsPizzaStore;
import factory.method.london.LondonPizzaHutPizzaStore;
import factory.method.ny.NYPizzaHutPizzaStore;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: shiv
 * Date: Dec 27, 2009
 * Time: 2:41:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class PizzaHutPizzaStoreTest {

    @Test
    public void shouldBeAbleToOrderPizzaFrmNY(){
        PizzaStore pizzaStore = new NYPizzaHutPizzaStore();
        Pizza pizza = pizzaStore.orderPizza(PizzaType.PLAIN);
        assertEquals("ny plain",pizza.getType());
        pizza = pizzaStore.orderPizza(PizzaType.CHEESE);
        assertEquals("ny cheese",pizza.getType());
        pizza = pizzaStore.orderPizza(PizzaType.STUFFED_CRUST);
        assertEquals("ny stuffed-crust",pizza.getType());
        pizza = pizzaStore.orderPizza(PizzaType.VEGGIE);
        assertEquals("ny veggie",pizza.getType());
    }

    @Test
    public void shouldBeAbleToOrderPizzaFrmNYWithIngredients(){
        PizzaStore pizzaStore = new NYIngredientsPizzaStore();
        Pizza pizza = pizzaStore.orderPizza(PizzaType.CHEESE);
        assertEquals("thin crust yellow cheese cheese",pizza.toString());
        pizza = pizzaStore.orderPizza(PizzaType.VEGGIE);
        assertEquals("thin crust yellow cheese veggie",pizza.toString());
    }

    @Test
    public void shouldBeAbleToOrderPizzaFrmLondonWithIngredients(){
        PizzaStore pizzaStore = new LondonIngredientsPizzaStore();
        Pizza pizza = pizzaStore.orderPizza(PizzaType.CHEESE);
        assertEquals("stuffed crust feta cheese cheese",pizza.toString());
        pizza = pizzaStore.orderPizza(PizzaType.VEGGIE);
        assertEquals("stuffed crust feta cheese veggie",pizza.toString());
    }

    @Test
    public void shouldBeAbleToOrderPizzaFrmLondon(){
        PizzaStore pizzaStore = new LondonPizzaHutPizzaStore();
        Pizza pizza = pizzaStore.orderPizza(PizzaType.PLAIN);
        assertEquals("london plain",pizza.getType());
        pizza = pizzaStore.orderPizza(PizzaType.CHEESE);
        assertEquals("london cheese",pizza.getType());
        pizza = pizzaStore.orderPizza(PizzaType.STUFFED_CRUST);
        assertEquals("london stuffed-crust",pizza.getType());
        pizza = pizzaStore.orderPizza(PizzaType.VEGGIE);
        assertEquals("london veggie",pizza.getType());
    }
}