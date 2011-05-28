package gof.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class MenuComposite implements Menu {

    private final String name;
    private List<Menu> items = new ArrayList<Menu>();

    public MenuComposite(String name) {
        this.name = name;
    }

    public void addMenuItem(Menu menu) {
        items.add(menu);
    }

    @Override
    public void draw() {
        System.out.println(name);
        for (Menu menu : items) {
            menu.draw();
        }
    }

}
