package modelo;

public class Alumno extends Persona {
    private String legajo;

    public Alumno(String nombre, String dni, String legajo) {
        super(nombre, dni);
        this.legajo = legajo;
    }

    public String getLegajo() { return legajo; }

    @Override
    public String toString() {
        return super.toString() + " - Legajo: " + legajo;
    }
}
