package gof.structural.decorator;

public class DecoratorTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        TextWriter writer = new ItalicTextWriter(new BoldTextWriter(new PlainTextWriter()));
        writer.writeText();
    }

}
