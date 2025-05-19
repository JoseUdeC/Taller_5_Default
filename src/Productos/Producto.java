package Productos;

class Producto {  // Clase con acceso default (no se usa 'public')
    String nombre;  // Atributo default
    float precio;  // Atributo default
    int stock;      // Atributo default

    // Constructor default
    Producto(String nombre, float precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Método default
    void mostrarInfo() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio + " | Stock: " + stock);
    }
}