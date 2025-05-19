package Prueba;

import Vehiculos.Moto;
// import Vehiculos.Vehiculo; // Esto daría error porque Vehiculo es default

public class PruebaVehiculo {
    public static void main(String[] args) {
        // 1. Esto no compila porque Vehiculo es default (no visible fuera de su paquete)
        //Vehiculo v = new Vehiculo("Terrestre");
        
        // 2. Esto funciona porque Moto es pública
        Moto moto = new Moto("Deportiva");
        
        // 3. Esto no compila porque 'tipo' tiene acceso default
        // System.out.println("Tipo de moto: " + moto.tipo);
        
        // Solución: Necesitaríamos un método getter público en Moto o Vehiculo
        System.out.println("Moto creada correctamente (pero no podemos acceder a 'tipo' directamente)");
    }
}