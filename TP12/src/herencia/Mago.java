package herencia;

public class Mago extends Personaje {
    private int magia;

    public Mago(String nombre, double x, double y) {
        super(nombre, 300, 10, Double.MAX_VALUE, x, y); // puede atacar a cualquier distancia
        this.magia = 5000;
    }

    @Override
    public boolean ataca(Personaje adversario) {
        double distancia = this.distancia(adversario);
        if (magia >= 500) {
            adversario.recibeDanio(10);
            magia -= 500;
            return true;
        } else if (distancia <= 5) {
            adversario.recibeDanio(3);
            return true;
        }
        return false;
    }

    public void recuperarMagia(int cantidad) {
        this.magia += cantidad;
    }

    public boolean teletransportarse(double x, double y) {
        if (magia >= 2000) {
            this.setPosX(x); 
            this.getPosicion().setXY(x, y); 
            magia -= 2000;
            return true;
        }
        return false;
    }

    public boolean curar(Personaje objetivo) {
        if (magia >= 1000) {
            objetivo.incrementarVitalidad(100);
            magia -= 1000;
            return true;
        }
        return false;
    }

	public String getMagia() {
		// TODO Auto-generated method stub
		return null;
	}
}
