package MODULO04.CLASE02.Calculadora;

import java.util.*;

public class Inventory {
    private Map<String, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        if (products.containsKey(product.getName().toUpperCase())) {
            // Producto si existe
            var oldProduct = products.get(product.getName().toUpperCase());
            var quantity = oldProduct.getQuantity();
            quantity += product.getQuantity();
            oldProduct.setQuantity(quantity);
        } else {
            // Producto no existe
            products.put(product.getName().toUpperCase(), product);
        }
    }

    public Queue<String> getInventory() {
        Queue<String> response = new LinkedList<>();
        for (var key : products.keySet()) {
            var value = products.get(key);
            response.add(String.format("%s \t%d \t$ %,.2f", value.getName(), value.getQuantity(), value.getPrice()));
        }
        return response;
    }

    public Product geProduct(String name) {
        return products.get(name.toUpperCase());
    }

    public double getTotalInventory() {
        var total = 0d;
        for (var product : products.values()) {
            total += product.getQuantity() * product.getPrice();
        }
        return total;
    }
}
