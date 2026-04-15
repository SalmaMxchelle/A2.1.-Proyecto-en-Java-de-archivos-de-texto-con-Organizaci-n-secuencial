/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Contacto {
    String nombre;
    String telefono;
    String gmail;

    public Contacto() {
        this(" ", 
             "", " ");
    }

    public Contacto(String nombre, String telefono, String gmail) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.gmail = gmail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
    
    public String toString(){
        return this.getNombre() + "," +
                this.getTelefono() +"," +
                this.getGmail();
                
    }
}
