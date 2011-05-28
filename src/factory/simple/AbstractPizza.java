package factory.simple;

import factory.Pizza;

/**
 * Created by IntelliJ IDEA.
 * User: shiv
 * Date: Dec 27, 2009
 * Time: 3:03:32 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractPizza implements Pizza {

    public void prepare() {
        System.out.printf("[%s] pizza preparing\n", getType());
    }

    public void bake() {
        System.out.printf("[%s] pizza baking\n", getType());
    }

    public void cut() {
        System.out.printf("[%s] pizza cutting slices\n", getType());
    }

    public void box() {
        System.out.printf("[%s] pizza now boxing\n", getType());
    }
}
