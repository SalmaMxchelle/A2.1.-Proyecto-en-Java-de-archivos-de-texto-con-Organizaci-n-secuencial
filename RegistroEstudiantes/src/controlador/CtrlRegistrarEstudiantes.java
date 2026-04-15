/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Modelo.ModeloRegistrarEstudiante;

public class CtrlRegistrarEstudiantes {

       
     ModeloRegistrarEstudiante ObjModeloRegistrarEst;

    public CtrlRegistrarEstudiantes() {
        this.ObjModeloRegistrarEst = new ModeloRegistrarEstudiante();
    }
    
       public void registrarEstudiante(String numControl, String nombre, String carrera, double promedio){
        this.ObjModeloRegistrarEst.listarEstudiante(numControl, nombre, carrera, promedio);
    }
}
