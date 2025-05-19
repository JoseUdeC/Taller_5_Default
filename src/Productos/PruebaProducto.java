package Productos;

public class PruebaProducto {
    public static void main(String[] args) {
        Producto p = new Producto("Celular", 1100000, 10);  // Acceso permitido
        p.mostrarInfo();  // Acceso permitido
        System.out.println("Nombre (acceso directo): " + p.nombre);  // Funciona (mismo paquete)
    }
}