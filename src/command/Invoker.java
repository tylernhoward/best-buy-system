package command;

import exceptions.CommandInterfaceException;
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

    public AbstractItem addItem(AbstractItem item) {
        command = new CMDAddCartItem(item, aggregator);

        Object addedItem = command.execute();
        if (addedItem instanceof AbstractItem) {
            return (AbstractItem) addedItem;
        } else {
            throw new CommandInterfaceException("Unable to determine returned object type after executing command.");
        }
    }

    public AbstractItem removeItem(AbstractItem item) {
        command = new CMDRemoveCartItem(item, aggregator);

        Object removedItem = command.execute();
        if (removedItem instanceof AbstractItem) {
            return (AbstractItem) removedItem;
        } else {
            throw new CommandInterfaceException("Unable to determine returned object type after executing command.");
        }
    }

    public List<AbstractItem> getItems() {
        command = new CMDGetCartItems(aggregator);

        Object items = command.execute();
        if (items instanceof List) {
            return (List<AbstractItem>) items;
        } else {
            throw new CommandInterfaceException("Unable to determine returned object type after executing command.");
        }
    }

    public Aggregator getAggregator() {
        return aggregator;
    }

    public void setAggregator(Aggregator aggregator) {
        this.aggregator = aggregator;
    }
}
