package Ejercicio2;

public abstract class Personaje implements Movible, Dibujable {
    private String nombre;
    private int vitalidad;
    private Posicion posicion;
    private Dibujable representacion; // << NUEVO ATRIBUTO >>

    public Personaje(String nombre, int vitalidad, Posicion posicion) {
        this.nombre = nombre;
        this.vitalidad = vitalidad;
        this.posicion = posicion;
        this.representacion = new RepresentacionEnConsola(); // por defecto
    }

    public String getNombre() {
        return nombre;
    }

    public int getVitalidad() {
        return vitalidad;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setRepresentacion(Dibujable representacion) {
        this.representacion = representacion;
    }

     @Override
    public int getPosx() {
        return posicion.getPosx();
    }

    @Override
    public int getPosy() {
        return posicion.getPosy();
    }

    @Override
    public void setXY(int x, int y) {
        posicion.setXY(x, y);
    }

    @Override
    public void incrementaPos(int valorX, int valorY) {
        posicion.incrementaPos(valorX, valorY);
    }

    @Override
    public void dibujar(Personaje personaje) {
        representacion.dibujar(personaje);
    }

    public abstract void mostrarInfo();
}
