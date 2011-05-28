package observers;

/**
 * Created by IntelliJ IDEA.
 * User: shiv
 * Date: Dec 27, 2009
 * Time: 8:29:28 AM
 * To change this template use File | Settings | File Templates.
 */
public interface ObservableList {
    void addObserver(ObserverItem item);

    void removeObserver(ObserverItem item);

    void add(int i);
}
