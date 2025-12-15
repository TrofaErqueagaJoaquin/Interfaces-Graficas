package Ejercicio2;

public class Elfo extends Personaje {
    public Elfo(String nombre, int vitalidad, Posicion posicion) {
        super(nombre, vitalidad, posicion);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Elfo " + getNombre() + " - Vida: " + getVitalidad() + " - Posición: " + getPosicion());
    }
}
