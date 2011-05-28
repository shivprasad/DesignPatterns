package observers.java;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by IntelliJ IDEA.
 * User: shiv
 * Date: Dec 27, 2009
 * Time: 8:45:43 AM
 * To change this template use File | Settings | File Templates.
 */
public class ItemObserver implements Observer {
    public void update(Observable o, Object arg) {

        System.out.println("I am called by - " + o.getClass() + " with object " + arg);

    }
}
