/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioED.EjercicioEntornos;

import java.util.TreeSet;

/**
 * @author Luna
 * @version 1.0
 */
public class Curso {

    private String nombre;
    private TreeSet<Persona> listaAlumnos;

    /**
     * Devuelve el nombre del curso.
     *
     * @return nombre del curso
     */
    protected String getNombre() {
        return nombre;
    }

    /**
     * Constructor de la clase Curso.
     * Inicializa el nombre del curso y la lista de alumnos.
     */
    public Curso(String nombre) {
        this.nombre = nombre;
        listaAlumnos = new TreeSet<>();
    }

    /**
     * Devuelve una representación en texto del curso
     * incluyendo la lista de alumnos.
     *
     * @return cadena con los datos del curso
     */
    @Override
    public String toString() {
        String s = "--------------------" + nombre + "-----------------\n";
        s += "NumExp\tNIF\t\tNombre\t\tApellidos\n";
        s += "-------------------------------------------------\n";
        for (Persona listaAlumno : listaAlumnos) {
            s += listaAlumno + "\n";
        }
        return s;
    }

    /**
     * Añade un alumno al curso.
     */
    public void aniadirAlumno(Persona p) {
        listaAlumnos.add(p);
    }
}