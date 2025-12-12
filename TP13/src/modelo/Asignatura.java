package modelo;

public class Asignatura {
    private String nombre;

    public Asignatura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }

    @Override
    public String toString() {
        return nombre;
    }
}
