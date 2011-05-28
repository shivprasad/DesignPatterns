package gof.structural.decorator;

public class PlainTextWriter implements TextWriter {
    @Override
    public void writeText() {
        System.out.println("simple text");
    }
}
