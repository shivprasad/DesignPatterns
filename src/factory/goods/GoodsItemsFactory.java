package factory.goods;

/**
 * User: shiv
 * Date: 13/04/2011
 * Time: 21:37
 */
public class GoodsItemsFactory implements ItemsFactory {
    public Item getItem(ItemType itemType) {
        if (ItemType.BOOK.equals(itemType))
            return new Book();
        if (ItemType.CD.equals(itemType))
            return new CD();
        return null;
    }
}
