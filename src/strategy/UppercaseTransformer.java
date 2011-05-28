package strategy;

/**
 * Created by IntelliJ IDEA.
 * User: shiv
 * Date: Dec 27, 2009
 * Time: 6:45:06 AM
 * To change this template use File | Settings | File Templates.
 */
public class UppercaseTransformer implements TransformerStrategy {
    public String transform(String text) {
        return text.toUpperCase();
    }
}
