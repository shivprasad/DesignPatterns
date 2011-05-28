package observers;

/**
 * Created by IntelliJ IDEA.
 * User: shiv
 * Date: Dec 27, 2009
 * Time: 8:30:36 AM
 * To change this template use File | Settings | File Templates.
 */
public class ArrayListObserver implements ObserverItem {
    private String name;

    public ArrayListObserver(String name) {

        this.name = name;
    }

    public void update(int i) {
        System.out.println("[" + name + "]" + i + " number added");
    }
}
