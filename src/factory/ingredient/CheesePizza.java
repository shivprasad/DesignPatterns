package factory.ingredient;

/**
 * Created by IntelliJ IDEA.
 * User: shiv
 * Date: Jan 1, 2010
 * Time: 1:38:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class CheesePizza extends AbstractIngredientPizza {

    IngredientFactory ingredientFactory;

    public CheesePizza(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public String getType() {
        return "cheese";  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void prepare() {
        dough = ingredientFactory.createDough();
        cheese = ingredientFactory.createCheese();
    }


}
