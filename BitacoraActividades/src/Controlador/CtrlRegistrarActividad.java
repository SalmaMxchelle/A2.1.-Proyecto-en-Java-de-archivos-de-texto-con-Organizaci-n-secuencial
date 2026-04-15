/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.ModeloRegistrarActividad;
public class CtrlRegistrarActividad {   
  ModeloRegistrarActividad objRegistrarActividad;

    public CtrlRegistrarActividad() {
        this.objRegistrarActividad = new ModeloRegistrarActividad();
    }
    
    public void registrarActividad(String fecha,  String Actividad){
        this.objRegistrarActividad.registrarActividad(fecha, Actividad);
    }
}
