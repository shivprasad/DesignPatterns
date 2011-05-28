package factory.ingredient;

import factory.ingredient.Cheese;
import factory.ingredient.Dough;
import factory.Pizza;

/**
 * Created by IntelliJ IDEA.
 * User: shiv
 * Date: Dec 27, 2009
 * Time: 3:03:32 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractIngredientPizza implements Pizza {

    protected Dough dough;
    protected Cheese cheese;

    public abstract void prepare();

    public void bake() {
        System.out.printf("[%s-%s-%s] pizza baking\n", dough, cheese, getType());
    }

    public void cut() {
        System.out.printf("[%s-%s-%s] pizza cutting\n", dough, cheese, getType());
    }

    public void box() {
        System.out.printf("[%s-%s-%s] pizza boxing\n", dough, cheese, getType());
    }

    @Override
    public String toString() {
        return dough + " " + cheese + " " + getType();
    }
}