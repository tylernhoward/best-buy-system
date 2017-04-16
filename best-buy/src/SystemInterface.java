/**
 * Created by ehaywo1 on 3/30/2017.
 */
public class SystemInterface {

    private static Invoker invoker;

    public static String addItem(String name, boolean isVegetarian) {
        MenuItem item = invoker.addItem(new MenuItem(name, isVegetarian));
        return item.toString();
    }

    public static void setInvoker(Invoker invoker) {
        SystemInterface.invoker = invoker;
    }

    public static Invoker getInvoker() {
        return invoker;
    }
}
