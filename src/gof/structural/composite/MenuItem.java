package gof.structural.composite;

public class MenuItem implements Menu {

    private String name;

    public MenuItem(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("\\-----" + name);
    }

}
