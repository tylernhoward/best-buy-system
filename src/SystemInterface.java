import command.Invoker;
import model.ElectronicItem;
import model.ElectronicItemType;
import model.AbstractItem;

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

    private static Invoker invoker;

    public static String addItem(AbstractItem item) {
        AbstractItem abstractItem = invoker.addItem(item);
        return abstractItem.toString();
    }

    public static String removeItem(AbstractItem item) {
        AbstractItem abstractItem = invoker.removeItem(item);
        return abstractItem.toString();
    }

    public static void setInvoker(Invoker invoker) {
        SystemInterface.invoker = invoker;
    }

    public static Invoker getInvoker() {
        return invoker;
    }
}
