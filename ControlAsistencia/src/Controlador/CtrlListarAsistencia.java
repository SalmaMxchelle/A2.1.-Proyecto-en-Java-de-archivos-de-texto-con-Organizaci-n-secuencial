/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Modelo.ModeloListarAsistencia;
import Vista.FrmListarAsistencia;
import javax.swing.table.DefaultTableModel;

public class CtrlListarAsistencia {

    ModeloListarAsistencia objModeloListarAsistencia;
    FrmListarAsistencia objFrmListarAsistencia;

    public CtrlListarAsistencia(FrmListarAsistencia objFrmListarAsistencia) {
        this.objFrmListarAsistencia = objFrmListarAsistencia;
        this.objModeloListarAsistencia = new ModeloListarAsistencia();
    }

    public void listarAsistencia(String[] columnas) {
        Object[][] datos;
        datos = this.objModeloListarAsistencia.listarAsistencia(columnas);
        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        this.objFrmListarAsistencia.tblListarAsistencia.setModel(modelo);
    }

}
