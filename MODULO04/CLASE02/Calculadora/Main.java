package MODULO04.CLASE02.Calculadora;

public class Main {
    public static void main(String[] args) {
        var inventory = new Inventory();
        inventory.addProduct(new Product("Avena", 2000d, 15));
        inventory.addProduct(new Product("Arroz", 5000d, 25));
        inventory.addProduct(new Product("Algas", 7000d, 5));
        inventory.addProduct(new Product("Tomate", 1500d, 35));
        inventory.addProduct(new Product("Cebolla", 2500d, 5));

        var all = inventory.getInventory();
        for (var value : all) {
            System.out.println(value);
        }

        try {
            var product = inventory.geProduct("cafe");
            System.out.printf("%s \t%d \t$ %,.2f%n", product.getName(), product.getQuantity(), product.getPrice());
        } catch (NullPointerException e) {
            System.err.println("Error al encontrar el proucto");
        }

        var total = inventory.getTotalInventory();
        System.out.printf("El total del inventario es $ %,.2f %n", total);

    }
}
