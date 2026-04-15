/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Calificacion {

    String nombre;
    String materia;
    double calificacion;

    public Calificacion(String nombre, String materia, double calificacion) {
        this.nombre = nombre;
        this.materia = materia;
        this.calificacion = calificacion;
    }

    public Calificacion() {
        this("", "", 0.0);
        
    }

     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public String toString(){
        return this.getNombre() + ","+
                this.getMateria()+ ","+
                this.getCalificacion();
    }
}
