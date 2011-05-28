package observers.java;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: shiv
 * Date: Dec 27, 2009
 * Time: 8:41:41 AM
 * To change this template use File | Settings | File Templates.
 */
public class ItemObservableTest {

    @Test
    public void shouldBeAbleToAddItem(){
        ItemObservable observable = new ItemObservable();
        ItemObserver observer = new ItemObserver();

        observable.addObserver(observer);

        observable.addWithoutPassingParams(1);
        observable.addWithPassingParams(1);
    }

}
