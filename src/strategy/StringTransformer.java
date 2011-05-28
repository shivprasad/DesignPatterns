package strategy;

/**
 * Created by IntelliJ IDEA.
 * User: shiv
 * Date: Dec 27, 2009
 * Time: 6:37:41 AM
 * To change this template use File | Settings | File Templates.
 */
public class StringTransformer {
    private TransformerStrategy transformer;

    public StringTransformer(TransformerStrategy transformer) {
        //To change body of created methods use File | Settings | File Templates.
        this.transformer = transformer;
    }

    public String transform(String text) {
        return transformer.transform(text);  //To change body of created methods use File | Settings | File Templates.
    }

    public void setTransformer(TransformerStrategy transformer) {
        this.transformer = transformer;
    }
}
