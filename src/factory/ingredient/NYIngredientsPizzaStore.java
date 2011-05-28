package factory.ingredient;

import factory.Pizza;
import factory.PizzaStore;
import factory.PizzaType;
import factory.method.ny.NYCheesePizza;
import factory.method.ny.NYPlainPizza;
import factory.method.ny.NYStuffedCrustPizza;
import factory.method.ny.NYVeggiePizza;

/**
 * Created by IntelliJ IDEA.
 * User: shiv
 * Date: Jan 1, 2010
 * Time: 1:43:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class NYIngredientsPizzaStore extends IngredientPizzaStore {

    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza = null;
        IngredientFactory ingredientFactory = new NYIngredientFactory();
        switch (pizzaType) {
            case CHEESE:
                pizza = new CheesePizza(ingredientFactory);
                break;
            case VEGGIE:
                pizza = new VeggiePizza(ingredientFactory);
                break;
            default:
                pizza = new CheesePizza(ingredientFactory);
                break;
        }
        return pizza;
    }
}
