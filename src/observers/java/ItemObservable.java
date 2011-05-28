package observers.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Created by IntelliJ IDEA.
 * User: shiv
 * Date: Dec 27, 2009
 * Time: 8:38:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class ItemObservable extends Observable {
    private List<Integer> items = new ArrayList<Integer>();

    public void addWithoutPassingParams(int i) {
        this.items.add(i);
        setChanged();
        notifyObservers();
    }

    public void addWithPassingParams(int i) {
        this.items.add(i);
        setChanged();
        notifyObservers(items);
    }
}
