package gof.structural.decorator;

public class ItalicTextWriter implements TextWriter {

    private final TextWriter writer;


    public ItalicTextWriter(TextWriter writer) {
        this.writer = writer;
    }

    @Override
    public void writeText() {
        System.out.println("<i>");
        writer.writeText();
        System.out.println("</i>");
    }

}
