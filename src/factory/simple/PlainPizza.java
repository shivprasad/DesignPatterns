package factory.simple;

import factory.simple.AbstractPizza;

/**
 * Created by IntelliJ IDEA.
 * User: shiv
 * Date: Dec 27, 2009
 * Time: 2:51:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class PlainPizza extends AbstractPizza {
    public String getType() {
        return "plain";
    }
}
