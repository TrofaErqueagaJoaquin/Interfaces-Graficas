package modelo;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private List<Asignatura> asignaturas;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.asignaturas = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public List<Asignatura> getAsignaturas() { return asignaturas; }

    public void agregarAsignatura(Asignatura a) {
        asignaturas.add(a);
    }

    @Override
    public String toString() {
        return nombre;
    }
}
