package gof.structural.decorator;

public class BoldTextWriter implements TextWriter {

    private final TextWriter writer;


    public BoldTextWriter(TextWriter writer) {
        this.writer = writer;
    }

    @Override
    public void writeText() {
        System.out.println("<b>");
        writer.writeText();
        System.out.println("</b>");
    }

}
