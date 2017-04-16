/**
 * Created by ehaywo1 on 3/30/2017.
 */
public class Aggregator {
    private Menu menu;

    public Aggregator() {
        menu = new Menu();
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public void add(MenuItem menuItem) {
        menu.add(menuItem);
    }

    public void remove(MenuItem menuItem) {
    }
}
