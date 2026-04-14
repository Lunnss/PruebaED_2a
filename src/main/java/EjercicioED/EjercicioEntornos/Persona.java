/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioED.EjercicioEntornos;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

/**
 * @author Luna
 * @version 1.0
 */
public class Persona implements Comparable<Persona> {

    private Nif nif;
    private String nombre;
    private char genero;
    private LocalDate nacimiento;

    /**
     * Constructor por defecto.
     * Inicializa la persona con valores por defecto.
     */
    public Persona() {
        nif = new Nif();
        nombre = "";
        genero = ' ';
        nacimiento = LocalDate.of(1990, 1, 1);
    }

    /**
     * Constructor que crea una persona solo con NIF.
     *
     * @param nif número de identificación fiscal
     */
    public Persona(int nif) {
        this();
        this.nif = new Nif(nif);
    }

    /**
     * Constructor completo de la clase Persona.
     *
     * @param nif número de identificación fiscal
     * @param nombre nombre de la persona
     * @param genero género de la persona
     * @param dia día de nacimiento
     * @param mes mes de nacimiento
     * @param ano año de nacimiento
     */
    public Persona(int nif, String nombre, char genero,
            int dia, int mes, int ano) {
        this.nif = new Nif(nif);
        this.nombre = nombre;
        this.genero = genero;
        this.nacimiento = LocalDate.of(ano, mes, dia);
    }

    /**
     * Devuelve el NIF de la persona.
     *
     * @return objeto Nif
     */
    public Nif getNif() {
        return nif;
    }

    /**
     * Establece el NIF de la persona.
     *
     * @param nif nuevo NIF
     */
    public void setNif(Nif nif) {
        this.nif = nif;
    }

    /**
     * Devuelve el nombre de la persona.
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre de la persona.
     *
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el género de la persona.
     *
     * @return género
     */
    public char getGenero() {
        return genero;
    }

    /**
     * Modifica el género de la persona.
     *
     * @param genero nuevo género
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }

    /**
     * Devuelve la fecha de nacimiento.
     *
     * @return fecha de nacimiento
     */
    public LocalDate getNacimiento() {
        return nacimiento;
    }

    /**
     * Modifica la fecha de nacimiento.
     *
     * @param nacimiento nueva fecha
     */
    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    /**
     * Calcula la edad de la persona en años.
     *
     * @return edad actual
     */
    public int getEdad() {
        return Period.between(nacimiento, LocalDate.now()).getYears();
    }

    /**
     * Devuelve una representación en texto de la persona.
     *
     * @return cadena con los datos de la persona
     */
    @Override
    public String toString() {
        if (nombre.split(" ").length > 1) {
            return nif + "\t" + nombre.split(" ")[0]
                    + '\t' + nombre.split(" ")[1] + "\t\t" + getEdad();
        } else {
            return nif + "\t" + nombre + "\t\t\t" + getEdad();
        }
    }

    /**
     * Compara esta persona con otra por su NIF.
     *
     * @param a otra persona
     * @return true si tienen el mismo NIF
     */
    public boolean equals(Persona a) {
        if (a == null) {
            return false;
        }
        return a.nif.toString().equals(this.nif.toString());
    }

    /**
     * Compara esta persona con otro objeto.
     *
     * @param obj objeto a comparar
     * @return true si tienen el mismo NIF
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;

        return Objects.equals(this.nif, other.nif);
    }

    /**
     * Compara dos personas por su NIF.
     *
     * @param o otra persona
     * @return resultado de la comparación
     */
    @Override
    public int compareTo(Persona o) {
        return this.nif.toString().compareTo(o.nif.toString());
    }
}