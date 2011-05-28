package observers;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: shiv
 * Date: Dec 27, 2009
 * Time: 8:27:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class ObservableTest {

    @Test
    public void shouldBeAbleToAddRemoveObservables(){

        ObservableList list = new ArrayListObservable();

        ObserverItem item1 = new ArrayListObserver("item1");
        ObserverItem item2 = new ArrayListObserver("item2");
        ObserverItem item3 = new ArrayListObserver("item3");

        list.addObserver(item1);
        list.addObserver(item2);
        list.addObserver(item3);

        list.add(1);

        list.removeObserver(item1);

        list.add(2);
    }

}
