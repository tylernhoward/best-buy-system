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

    public String addElectronicItem(ElectronicItem item) {
        AbstractItem electronicItem = invoker.addItem(item);
        return electronicItem.toString();
    }

    public void setInvoker(Invoker invoker) {
        this.invoker = invoker;
    }

    public Invoker getInvoker() {
        return invoker;
    }
}
