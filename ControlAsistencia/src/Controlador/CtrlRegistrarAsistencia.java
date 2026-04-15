/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ModeloRegistrarAsistencia;

public class CtrlRegistrarAsistencia {

    ModeloRegistrarAsistencia objModeloRegistrarAsistencia;

    public CtrlRegistrarAsistencia() {
        this.objModeloRegistrarAsistencia = new ModeloRegistrarAsistencia();
    }

    public void registrarAsistencia(String nombre, String fecha, String estado){
        this.objModeloRegistrarAsistencia.registrarAsistencia(nombre, fecha, estado);
    }
}
