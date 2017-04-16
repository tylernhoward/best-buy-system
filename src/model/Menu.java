package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ehaywo1 on 3/30/2017.
 */
public class Menu {

    private List<MenuItem> menuItems;

    public Menu() {
        menuItems = new ArrayList<>();
    }

    public Menu(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void add(MenuItem menuItem) {
        menuItems.add(menuItem);
    }
}
