package herencia;

public class Caballero extends Personaje {
    private int armadura;

    public Caballero(String nombre, double x, double y) {
        super(nombre, 800, 10, 5.0, x, y);
        this.armadura = 500;
    }


    public boolean ataca(Personaje adversario) {
        if (this.distancia(adversario) <= 5.0 && adversario.getVitalidad() > 0) {
            adversario.recibeDanio(15);
            return true;
        }
        return false;
    }


    public void recibeDanio(int cantidad) {
        if (armadura > 0) {
            armadura -= cantidad;
            if (armadura < 0) {
                super.recibeDanio(-armadura);
                armadura = 0;
            }
        } else {
            super.recibeDanio(cantidad);
        }
    }
}
