/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


public class Actividad {
    
    String fecha;
    String Actividad;

    public Actividad(String fecha, String Actividad) {
        this.fecha = fecha;
        this.Actividad = Actividad;
    }

    public Actividad() {
        this("", "");
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getActividad() {
        return Actividad;
    }

    public void setActividad(String Actividad) {
        this.Actividad = Actividad;
    }
    
    public String toString(){
        return this.getFecha() + " ,"+
                this.getActividad();
    }
             
}
