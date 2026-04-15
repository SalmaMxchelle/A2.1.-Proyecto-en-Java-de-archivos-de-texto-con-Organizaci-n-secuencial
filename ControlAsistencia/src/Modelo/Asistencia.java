/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Asistencia {
    
    String nombre;
    String fecha;
    String estado;

    public Asistencia(String nombre, String fecha, String estado) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.estado = estado;
    }
    
    public Asistencia(){
        this("", "", "");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String toString(){
        return this.getNombre() + "," +
         this.getFecha() + "," + 
                this.getEstado();
    }
}
