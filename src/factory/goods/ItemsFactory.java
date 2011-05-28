package factory.goods;

/**
 * User: shiv
 * Date: 13/04/2011
 * Time: 21:36
 */
public interface ItemsFactory {

    Item getItem(factory.goods.ItemType itemType);
}
