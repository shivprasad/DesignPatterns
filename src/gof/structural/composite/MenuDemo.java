package gof.structural.composite;

public class MenuDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {

        MenuComposite fileMenu = new MenuComposite("File");
        fileMenu.addMenuItem(new MenuItem("New"));
        fileMenu.addMenuItem(new MenuItem("Open"));
        fileMenu.addMenuItem(new MenuItem("Save"));

        MenuComposite editMenu = new MenuComposite("Edit");
        editMenu.addMenuItem(new MenuItem("Cut"));
        editMenu.addMenuItem(new MenuItem("Copy"));
        editMenu.addMenuItem(new MenuItem("Paste"));

        MenuComposite menus = new MenuComposite("Menus");
        menus.addMenuItem(fileMenu);
        menus.addMenuItem(editMenu);

        menus.draw();
    }

}
