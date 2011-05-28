package observers;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: shiv
 * Date: Dec 27, 2009
 * Time: 8:29:35 AM
 * To change this template use File | Settings | File Templates.
 */
public class ArrayListObservable implements ObservableList {
    private List observers = new ArrayList();

    public void addObserver(ObserverItem item) {
        this.observers.add(item);
    }

    public void removeObserver(ObserverItem item) {
        this.observers.remove(item);
    }

    public void add(int i) {
        for (Iterator iterator = observers.iterator(); iterator.hasNext(); ) {
            ObserverItem observerItem = (ObserverItem) iterator.next();
            observerItem.update(i);
        }
    }
}
