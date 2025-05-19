package Persona;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona p = new Persona("Juan", 25);
        
        System.out.println("Nombre (getter): " + p.getNombre());  // Acceso permitido (private vía getter)
        //System.out.println("Nombre (directo): " + p.nombre);   // Error: nombre es privado
        System.out.println("Edad (directo): " + p.edad);         // Acceso permitido (default, mismo paquete)
    }
}