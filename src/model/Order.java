package model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by ealexhaywood on 5/1/17.
 */
public class Order {
    private List<AbstractItem> orderedItems;
    private UUID orderNumber;
    private String date;
    private double orderTotal;

    private final SimpleDateFormat mdyFormat = new SimpleDateFormat("MM-dd-yyyy");

    public Order(List<AbstractItem> orderedItems) {
        this.orderedItems = orderedItems;
        this.orderNumber = UUID.randomUUID();
        this.date = mdyFormat.format(new Date());
        this.orderTotal = calculateTotal(orderedItems);
    }

    private double calculateTotal(List<AbstractItem> orderedItems) {
        double total = 0;

        for (AbstractItem item : orderedItems) {
            total += item.getPrice();
        }

        // Round to two decimal places
        return Math.round(total * 100.0) / 100.0;
    }

    public List<AbstractItem> getOrderedItems() {
        return orderedItems;
    }

    public void setOrderedItems(List<AbstractItem> orderedItems) {
        this.orderedItems = orderedItems;
    }

    public UUID getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(UUID orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }
}