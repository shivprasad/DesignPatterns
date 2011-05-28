package decorator;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: shiv
 * Date: Dec 27, 2009
 * Time: 2:07:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class CoffeeMakerTest {

    @Test
    public void shouldBeAbleToOrderCoffee(){
        Beverage beverage = new Coffee();

        assertEquals(10, beverage.cost());
    }

    @Test
    public void shouldBeAbleToOrderCoffeeWithMilk(){
        Beverage beverage = new Coffee();
        beverage = new CoffeeWithMilk(beverage);
        assertEquals(15, beverage.cost());
    }

    @Test
    public void shouldBeAbleToOrderCoffeeWithMilkAndMockaHazelnut(){
        Beverage beverage = new Coffee();
        beverage = new CoffeeWithMilk(beverage);
        beverage = new Mocha(beverage);
        beverage = new Hazelnul(beverage);
        assertEquals(25, beverage.cost());
    }

}
