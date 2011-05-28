package factory.ingredient;

/**
 * Created by IntelliJ IDEA.
 * User: shiv
 * Date: Jan 1, 2010
 * Time: 1:34:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class NYIngredientFactory implements IngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Cheese createCheese() {
        return new YellowCheese();  //To change body of implemented methods use File | Settings | File Templates.
    }
}
