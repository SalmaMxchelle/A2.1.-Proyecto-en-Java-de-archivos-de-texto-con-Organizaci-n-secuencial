/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.ModeloRegistrarCalificaciones;
public class CtrlRegistrarCalificacion {
   ModeloRegistrarCalificaciones objModeloRegistrarCalificaciones;

    public CtrlRegistrarCalificacion() {
        this.objModeloRegistrarCalificaciones = new ModeloRegistrarCalificaciones();
    }
  
    public void registrarCalificaciones(String nombre, String materia, double calificacion){
        this.objModeloRegistrarCalificaciones.registrarCalificacion(nombre, materia, calificacion);
    }
}
