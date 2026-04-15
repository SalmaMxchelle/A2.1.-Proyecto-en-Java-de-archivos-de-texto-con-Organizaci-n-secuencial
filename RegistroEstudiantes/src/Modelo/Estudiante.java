/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Estudiante {
    String numControl;
    String nombre;
    String carrera;
    double promedio;

    public Estudiante(String numControl, String nombre, String carrera, double promedio) {
        this.numControl = numControl;
        this.nombre = nombre;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public Estudiante() {
        this("", "", "", 0.0);
    }

    public String getNumControl() {
        return numControl;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    //Convierte el objeto en texto para guardarlo en el archivo
    public String toString(){
        return this.getNumControl() + "," +
                this.getNombre() + ","+
                this.getCarrera() + ","+
                this.getPromedio();
    }
    
}
