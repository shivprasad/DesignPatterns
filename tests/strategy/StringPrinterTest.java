package strategy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: shiv
 * Date: Dec 27, 2009
 * Time: 6:35:10 AM
 * To change this template use File | Settings | File Templates.
 */
public class StringPrinterTest {
    private LowercaseTransformer lowercaseTransformer;

    @Test
    public void ShouldReturnStringToPrint(){
        StringTransformer stringTransformer = new StringTransformer(lowercaseTransformer);
        assertEquals("abcd", stringTransformer.transform("ABCD"));
        stringTransformer.setTransformer(new UppercaseTransformer());
        assertEquals("ABCD", stringTransformer.transform("abcd"));
    }

    @Before
    public void setUp() throws Exception {
        lowercaseTransformer = new LowercaseTransformer();
    }
}