package com.design.patterns.behavioral.state;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Inventory {
    private Map<Product, Integer> productInventory;

    public Inventory() {
        productInventory = new ConcurrentHashMap<Product, Integer>();
    }

    public void addProduct(Product product, int quantity) {
        productInventory.put(product, quantity);
    }

    public void removeProduct(Product product) {
        productInventory.remove(product);
    }

    public void updateProduct(Product product, int quantity) {
        for (Map.Entry<Product, Integer> m : productInventory.entrySet()) {
            if (m.getKey().getName().equals(product.getName())) {
                int existingQuantity = m.getValue();
                m.setValue(existingQuantity + quantity);
            }
        }
    }

    public Product getProduct(String name) {
        for (Map.Entry<Product, Integer> m : productInventory.entrySet()) {
            if (m.getKey().getName().equals(name)) {
                return m.getKey();
            }
        }
        return null;
    }

    public int getQuantity(Product product) {
        return productInventory.getOrDefault(product, 0);
    }

    public boolean isAvailable(Product product) {
        return getQuantity(product)>0;
    }

}
