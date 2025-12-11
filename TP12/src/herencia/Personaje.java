package herencia;

abstract class Personaje {
    private int danioAtaque;
    private double distanciaAtaque;
    private String nombre;
    private Posicion posicion;
    private int vitalidad;

    public Personaje(String nombre, int vitalidad, int danioAtaque, double distanciaAtaque, double x, double y) {
        this.nombre = nombre;
        this.vitalidad = vitalidad;
        this.danioAtaque = danioAtaque;
        this.distanciaAtaque = distanciaAtaque;
        this.posicion = new Posicion(x, y);
    }

    public boolean ataca(Personaje adversario) {
        if (this.distancia(adversario) <= distanciaAtaque && adversario.vitalidad > 0) {
            adversario.recibeDanio(this.danioAtaque);
            return true;
        }
        return false;
    }

    public double distancia(Personaje otro) {
        return this.posicion.distancia(otro.getPosicion());
    }

    public String getNombre() {
        return nombre;
    }

    public double getPosX() {
        return posicion.getPosx();
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public int getVitalidad() {
        return vitalidad;
    }

    protected void recibeDanio(int cantidad) {
        this.vitalidad -= cantidad;
        if (this.vitalidad < 0) this.vitalidad = 0;
    }

    public void setPosX(double posX) {
        this.posicion.setXY(posX, this.posicion.getPosy());
    }
    public void incrementarVitalidad(int cantidad) {
        this.vitalidad += cantidad;
    }

}
