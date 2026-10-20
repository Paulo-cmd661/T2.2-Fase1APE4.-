public class Main {
    public static void main(String[] args) {
        Producto[] productos = {
            new Producto("Laptop", 800.00, 10),
            new Producto("Mouse", 15.50, 7),
            new Producto("Teclado", 25.00, 7),
            new Producto("Monitor", 150.00, 6)
        };

        System.out.println("Productos:");
        for (Producto p : productos) {
            System.out.printf("%s : %.2f%n", p.nombre, p.precio);
        }

        // Venta de 3 unidades de dos productos
        productos[1].vender(3);   // Mouse
        productos[2].vender(3);   // Teclado

        System.out.println("\nDespués de la venta:");
        double total = 0;
        for (Producto p : productos) {
            String aviso = "";
            if (p.stock < 5) {
                aviso = " Reponer";
            }
            System.out.printf("%s : %d unidades%s%n", p.nombre, p.stock, aviso);
            total = total + p.valorTotal();
        }

        System.out.printf("Valor total del inventario: %.2f%n", total);
    }
}
