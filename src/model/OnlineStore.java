package model;

import iterators.AllItemsIterator;
import iterators.OnlineStoreIterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ehaywo1 on 3/30/2017.
 */
public class OnlineStore {

    private List<AbstractItem> inventory;

    public OnlineStore() {
    }

    public OnlineStore(List<AbstractItem> inventory) {
        this.inventory = inventory;
    }

    // public access factory methods for iterators here...

    public OnlineStoreIterator getAllItemsIterator(List<AbstractItem> items) {
        return new AllItemsIterator(items);
    }


    private class AllItemsIterator implements OnlineStoreIterator {

        private List<AbstractItem> items;

        public AllItemsIterator(List<AbstractItem> items) {
            this.items = items;
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

    private class ElectronicItemsIterator implements OnlineStoreIterator {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public AbstractItem next() {
            return null;
        }
    }

    private class GenericItemsIterator implements OnlineStoreIterator {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public AbstractItem next() {
            return null;
        }
    }

    // More iterators here...


    public List<AbstractItem> getInventory() {
        return inventory;
    }

    public void setInventory(List<AbstractItem> inventory) {
        this.inventory = inventory;
    }
}
