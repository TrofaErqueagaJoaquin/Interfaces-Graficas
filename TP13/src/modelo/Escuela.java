package modelo;

import java.util.ArrayList;
import java.util.List;

public class Escuela {
    private String nombre;
    private List<Curso> cursos;
    private List<Alumno> alumnos;
    private List<Profesor> profesores;

    public Escuela(String nombre) {
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
        this.alumnos = new ArrayList<>();
        this.profesores = new ArrayList<>();
    }

    public void agregarCurso(Curso c) { cursos.add(c); }
    public void agregarAlumno(Alumno a) { alumnos.add(a); }
    public void agregarProfesor(Profesor p) { profesores.add(p); }

    public List<Curso> getCursos() { return cursos; }
    public List<Alumno> getAlumnos() { return alumnos; }
    public List<Profesor> getProfesores() { return profesores; }

    @Override
    public String toString() {
        return "Escuela: " + nombre;
    }
}
