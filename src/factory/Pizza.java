package factory;

/**
 * Created by IntelliJ IDEA.
 * User: shiv
 * Date: Dec 27, 2009
 * Time: 2:48:46 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Pizza {
    String getType();

    void prepare();

    void bake();

    void cut();

    void box();
}
