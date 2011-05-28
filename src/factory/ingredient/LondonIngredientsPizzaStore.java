package factory.ingredient;

import factory.Pizza;
import factory.PizzaType;

/**
 * Created by IntelliJ IDEA.
 * User: shiv
 * Date: Jan 1, 2010
 * Time: 1:43:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class LondonIngredientsPizzaStore extends IngredientPizzaStore {

    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza = null;
        IngredientFactory ingredientFactory = new LondonIngredientFactory();
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