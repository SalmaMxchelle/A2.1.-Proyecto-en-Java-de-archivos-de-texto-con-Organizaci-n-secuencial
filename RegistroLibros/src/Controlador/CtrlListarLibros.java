/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ModeloListarLibro;
import Vista.FrmListarLibro;
import javax.swing.table.DefaultTableModel;

public class CtrlListarLibros {

    ModeloListarLibro objModeloListarLibro;
    FrmListarLibro ObjListarLibro;

    public CtrlListarLibros(FrmListarLibro ObjListarLibro) {
        this.ObjListarLibro = ObjListarLibro;
        this.objModeloListarLibro = new ModeloListarLibro();
    }

    public void listarLibros(String[] columnas) {
        Object[][] datos;
        datos = this.objModeloListarLibro.listarLibro(columnas);
        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        this.ObjListarLibro.tblListarLibros.setModel(modelo);
    }
}
