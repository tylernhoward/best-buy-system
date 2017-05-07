package command;

import decorator.Receipt;
import decorator.SimpleReceipt;
import model.AbstractItem;
import model.ShoppingCart;

import java.util.List;

/**
 * Created by ehaywo1 on 3/30/2017.
 */
public class Aggregator {
    private ShoppingCart shoppingCart;
    private Receipt receipt;

    public Aggregator() {
        shoppingCart = new ShoppingCart();
        receipt = new SimpleReceipt();
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

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    public Receipt getReceipt() {
        return receipt;
    }
}
