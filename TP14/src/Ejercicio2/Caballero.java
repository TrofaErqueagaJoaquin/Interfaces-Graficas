package Ejercicio2;

public class Caballero extends Personaje {
    public Caballero(String nombre, int vitalidad, Posicion posicion) {
        super(nombre, vitalidad, posicion);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Caballero " + getNombre() + " - Vida: " + getVitalidad() + " - Posición: " + getPosicion());
    }
}
