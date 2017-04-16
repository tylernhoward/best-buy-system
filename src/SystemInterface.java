import command.Invoker;
import model.MenuItem;

/**
 * Created by ealexhaywood on 4/15/17.
 */
public class SystemInterface {
    private static SystemInterface systemInterface = new SystemInterface();

    public static SystemInterface getInstance() {
        return systemInterface;
    }

    private SystemInterface() {
    }

    private Invoker invoker;

    public String addItem(String name, boolean isVegetarian) {
        MenuItem item = invoker.addItem(new MenuItem(name, isVegetarian));
        return item.toString();
    }

    public void setInvoker(Invoker invoker) {
        this.invoker = invoker;
    }

    public Invoker getInvoker() {
        return invoker;
    }
}
