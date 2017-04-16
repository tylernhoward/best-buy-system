package command;

import model.MenuItem;

/**
 * Created by ehaywo1 on 3/30/2017.
 */
public class CMDAddItem implements CommandInterface {

    private MenuItem menuItem;
    private Aggregator aggregator;

    public CMDAddItem(Aggregator aggregator, MenuItem menuItem) {
        this.menuItem = menuItem;
        this.aggregator = aggregator;
    }

    public void create(Aggregator aggregator, MenuItem menuItem) {
        aggregator.add(menuItem);
    }

    @Override
    public MenuItem execute() {
        return menuItem;
    }
}
