package command;

import model.AbstractItem;
import model.ElectronicItem;
import model.ElectronicItemType;
import model.OnlineStore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ehaywo1 on 3/30/2017.
 */
public class Invoker {

    private Aggregator aggregator;

    private CommandInterface command;

    public Invoker(Aggregator aggregator) {
        this.aggregator = aggregator;
    }

    public Aggregator getAggregator() {
        return aggregator;
    }

    public void setAggregator(Aggregator aggregator) {
        this.aggregator = aggregator;
    }

    public AbstractItem addItem(AbstractItem menuAbstractItem) {
        command = new CMDAddCartItem(aggregator, menuAbstractItem);
        // instanceof
        Object item = command.execute();
        if (item instanceof AbstractItem) {
            return (AbstractItem) item;
        } else {
            throw new RuntimeException("problem");
        }
    }

    public void initializeOnlineStore() {
        OnlineStore onlineStore = new OnlineStore();

        List<AbstractItem> inventory = new ArrayList<>();
        // example: Add iphone7 item, 6 in stock
        inventory.add(new ElectronicItem("iPhone 7", 699.00, ElectronicItemType.CELL_PHONE, "720p", 5.0));
        // more items here





        onlineStore.setInventory(inventory);
    }
}
