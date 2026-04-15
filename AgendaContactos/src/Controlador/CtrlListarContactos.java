/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ModeloListarContacto;
import Vista.FrmListarContactos;
import javax.swing.table.DefaultTableModel;

public class CtrlListarContactos {

    ModeloListarContacto objModeloListarContacto;

    FrmListarContactos objListarContactos;

    public CtrlListarContactos(FrmListarContactos ObjListarContactos) {
        this.objListarContactos = ObjListarContactos;
        this.objModeloListarContacto = new ModeloListarContacto();
    }

    public void listarContactos(String[] columnas) {
        Object[][] datos;
        datos = this.objModeloListarContacto.listarContactos(columnas);
        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        this.objListarContactos.tblContactos.setModel(modelo);
    }
}
