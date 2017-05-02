package iterators;

import model.AbstractItem;

/**
 * Created by ealexhaywood on 5/1/17.
 */
public class GenericItemsIterator implements OnlineStoreIterator {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public AbstractItem next() {
        return null;
    }
}
