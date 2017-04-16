/**
 * Created by ehaywo1 on 3/30/2017.
 */
public class MenuItem {

    private String name;
    private boolean isVegetarian;

    public MenuItem(String name, boolean isVegetarian) {
        this.name = name;
        this.isVegetarian = isVegetarian;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "[name = " + name + ", vegetarian = " + isVegetarian + "]";
    }
}
