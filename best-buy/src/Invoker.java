import java.util.Objects;

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

    public MenuItem addItem(MenuItem menuItem) {
        CommandInterface command = new CMDAddItem(aggregator, menuItem);
        // instanceof
        Object item = command.execute();
        if (item instanceof MenuItem) {
            return (MenuItem) item;
        } else {
            throw new RuntimeException("problem");
        }
    }
}
