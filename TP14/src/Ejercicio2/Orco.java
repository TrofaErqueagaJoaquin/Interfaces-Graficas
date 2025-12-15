package Ejercicio2;

public class Orco extends Personaje {
    public Orco(String nombre, int vitalidad, Posicion posicion) {
        super(nombre, vitalidad, posicion);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Orco " + getNombre() + " - Vida: " + getVitalidad() + " - Posición: " + getPosicion());
    }
}
