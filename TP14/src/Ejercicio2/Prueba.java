package Ejercicio2;

public class Prueba {
    public static void main(String[] args) {
        Caballero c = new Caballero("Arthur", 100, new Posicion(0, 0));
        Mago m = new Mago("Merlín", 85, new Posicion(5, 3));
        Elfo e = new Elfo("Legolas", 90, new Posicion(3, -1));
        Orco o = new Orco("Gorg", 120, new Posicion(-2, 1));

        c.mostrarInfo();
        m.mostrarInfo();
        e.mostrarInfo();
        o.mostrarInfo();

        System.out.println("\nMostrando representaciones en consola:");
        c.dibujar(c);
        m.dibujar(m);
        e.dibujar(e);
        o.dibujar(o);

        System.out.println("\nMoviendo personajes...");
        c.incrementaPos(2, 1);
        m.incrementaPos(-1, 0);
        e.incrementaPos(0, 5);
        o.incrementaPos(3, -1);

        c.dibujar(c);
        m.dibujar(m);
        e.dibujar(e);
        o.dibujar(o);
    }
}
