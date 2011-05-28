package strategy;

/**
 * Created by IntelliJ IDEA.
 * User: shiv
 * Date: Dec 27, 2009
 * Time: 6:37:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class LowercaseTransformer implements TransformerStrategy {
    public String transform(String text) {
        return text.toLowerCase();
    }
}
