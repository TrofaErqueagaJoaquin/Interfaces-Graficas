package Modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class Juego {
    private ArrayList<Ciclomotor> motos = new ArrayList<Ciclomotor>();

    public void agregarCiclomotor(Ciclomotor c) {
        this.motos.add(c);
    }

    public void eliminarCiclomotor(Ciclomotor c) {
        this.motos.remove(c);
    }

    public Iterator<Ciclomotor> getCiclomotores() {
        return this.motos.iterator();
    }

    public Ciclomotor enfrentar(Ciclomotor c1, Ciclomotor c2, String atributo) {
        if (atributo.equalsIgnoreCase("Potencia"))
            return c1.enfrentaPotencia(c2);
        if (atributo.equalsIgnoreCase("Velocidad"))
            return c1.enfrentaVelocidad(c2);
        if (atributo.equalsIgnoreCase("Peso"))
            return c1.enfrentaPeso(c2);
        if (atributo.equalsIgnoreCase("Cilindrada"))
            return c1.enfrentaCilindrada(c2);

        return null;
    }
}
