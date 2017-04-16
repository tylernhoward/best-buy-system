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

    private Invoker invoker;

    public String addElectronicItem(String name, double price, ElectronicItemType type, String displayQuality, double screenSize) {
        AbstractItem electronicItem = invoker.addItem(new ElectronicItem(name, price, type, displayQuality, screenSize));
        return electronicItem.toString();
    }

    public void setInvoker(Invoker invoker) {
        this.invoker = invoker;
    }

    public Invoker getInvoker() {
        return invoker;
    }
}
