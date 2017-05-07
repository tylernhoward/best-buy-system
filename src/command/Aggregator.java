package command;

import model.AbstractItem;
import model.ShoppingCart;

import java.util.List;

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
        shoppingCart.remove(abstractItem);
    }

    public List<AbstractItem> getAll() {
        return shoppingCart.getAll();
    }

}
