package model;

/**
 * Created by ehaywo1 on 3/30/2017.
 */
public abstract class AbstractItem {

    protected String name;
    protected double price;
    protected int inStock;

    public AbstractItem(String name, double price, int inStock) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return "[name = " + name + ", price = $" + price + "]";
    }
}
