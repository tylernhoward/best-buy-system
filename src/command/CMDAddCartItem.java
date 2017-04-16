package command;

import model.AbstractItem;

/**
 * Created by ehaywo1 on 3/30/2017.
 */
public class CMDAddCartItem implements CommandInterface {

    private AbstractItem abstractItem;
    private Aggregator aggregator;

    public CMDAddCartItem(Aggregator aggregator, AbstractItem abstractItem) {
        this.abstractItem = abstractItem;
        this.aggregator = aggregator;
    }

    @Override
    public AbstractItem execute() {
        aggregator.add(abstractItem);
        return abstractItem;
    }
}
