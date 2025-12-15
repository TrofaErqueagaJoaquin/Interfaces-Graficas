package Ejercicio2;

public class Mago extends Personaje {
    public Mago(String nombre, int vitalidad, Posicion posicion) {
        super(nombre, vitalidad, posicion);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Mago " + getNombre() + " - Vida: " + getVitalidad() + " - Posición: " + getPosicion());
    }
}
