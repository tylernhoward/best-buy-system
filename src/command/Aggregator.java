package command;

import model.AbstractItem;
import model.ShoppingCart;

/**
 * Created by ehaywo1 on 3/30/2017.
 */
public class Aggregator {
    private ShoppingCart shoppingCart;

    public Aggregator() {
        shoppingCart = new ShoppingCart();
    }

    public void add(AbstractItem abstractItem) {
        shoppingCart.add(abstractItem);
    }

    public void remove(AbstractItem abstractItem) {
    }

}
