package factory.goods;

/**
 * User: shiv
 * Date: 13/04/2011
 * Time: 21:37
 */
public class ItemsFactorySelector {
    public static ItemsFactory getItemsFactory() {
        return new GoodsItemsFactory();
    }
}
