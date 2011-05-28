package factory.ingredient;

/**
 * Created by IntelliJ IDEA.
 * User: shiv
 * Date: Jan 1, 2010
 * Time: 1:33:21 PM
 * To change this template use File | Settings | File Templates.
 */
public interface IngredientFactory {
    Dough createDough();

    Cheese createCheese();
}
