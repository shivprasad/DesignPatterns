package factory.goods;

import org.junit.Test;


import static org.junit.Assert.assertTrue;

/**
 * User: shiv
 * Date: 13/04/2011
 * Time: 21:31
 */
public class GoodsFactoryTest {


    @Test
    public void shouldCreateFactoryInstance(){
        ItemsFactory factory = ItemsFactorySelector.getItemsFactory();
        assertTrue(factory instanceof GoodsItemsFactory);
    }

    @Test
    public void shouldCreateItem(){
        ItemsFactory factory = ItemsFactorySelector.getItemsFactory();
        Item book = factory.getItem(ItemType.BOOK);
        Item cd = factory.getItem(ItemType.CD);
        assertTrue(book instanceof Book);
        assertTrue(cd instanceof CD);
    }




}
