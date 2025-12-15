package Ejercicio2;

public class RepresentacionEnConsola implements Dibujable {
    @Override
    public void dibujar(Personaje personaje) {
        System.out.println(personaje.getNombre() + " está en la posición " + personaje.getPosicion());
    }
}
