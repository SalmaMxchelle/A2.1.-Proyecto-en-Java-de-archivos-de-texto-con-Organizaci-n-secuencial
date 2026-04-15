/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ModeloListarCalificaciones;
import Vista.FrmListarCalificacion;
import javax.swing.table.DefaultTableModel;

public class CtrlListarCalificacion {
    ModeloListarCalificaciones objModeloListarCalificaciones;
    FrmListarCalificacion objListarCalificacion;

    public CtrlListarCalificacion(FrmListarCalificacion objListarCalificacion) {
        this.objListarCalificacion = objListarCalificacion;
        this.objModeloListarCalificaciones = new ModeloListarCalificaciones();
    }

    public void listarCalificaciones(String[] columnas) {
        Object[][] datos;
        datos = this.objModeloListarCalificaciones.listarCalificaciones(columnas);
        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        this.objListarCalificacion.tblListarCalificaciones.setModel(modelo);
    }

}
