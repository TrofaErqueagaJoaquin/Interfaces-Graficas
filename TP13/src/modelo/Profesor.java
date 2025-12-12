package modelo;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona {
    private String cuil;
    private List<Asignatura> asignaturas;

    public Profesor(String nombre, String dni, String cuil) {
        super(nombre, dni);
        this.cuil = cuil;
        this.asignaturas = new ArrayList<>();
    }

    public void agregarAsignatura(Asignatura a) {
        asignaturas.add(a);
    }

    public String getCuil() { return cuil; }
    public List<Asignatura> getAsignaturas() { return asignaturas; }

    @Override
    public String toString() {
        return super.toString() + " - CUIL: " + cuil;
    }
}
