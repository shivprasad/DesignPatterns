package factory.ingredient;

/**
 * Created by IntelliJ IDEA.
 * User: shiv
 * Date: Jan 1, 2010
 * Time: 1:34:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class LondonIngredientFactory implements IngredientFactory {
    public Dough createDough() {
        return new StuffedCrustDough();
    }

    public Cheese createCheese() {
        return new FetaCheese();  //To change body of implemented methods use File | Settings | File Templates.
    }
}