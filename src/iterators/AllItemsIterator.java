package iterators;

import model.AbstractItem;

import java.util.List;

/**
 * Created by ealexhaywood on 5/1/17.
 */
public class AllItemsIterator implements OnlineStoreIterator {

    public AllItemsIterator(List<AbstractItem> items) {

    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public AbstractItem next() {
        return null;
    }
}
