package Persona;

public class Persona {
    private String nombre;  // Atributo privado
    int edad;              // Atributo default

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos públicos para acceder al atributo privado
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}