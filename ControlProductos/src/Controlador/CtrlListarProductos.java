/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ModeloListarProducto;
import Vista.FrmListarProductos;
import javax.swing.table.DefaultTableModel;

public class CtrlListarProductos {

    ModeloListarProducto objModeloListarProducto;

    FrmListarProductos ObjListarProductos;

    public CtrlListarProductos(FrmListarProductos ObjListarProductos) {
        this.ObjListarProductos = ObjListarProductos;
        this.objModeloListarProducto = new ModeloListarProducto();
    }

    public void listarContactos(String[] columnas) {
        Object[][] datos;
        datos = this.objModeloListarProducto.listarProducto(columnas);
        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        this.ObjListarProductos.tblListarProductos.setModel(modelo);
    }
}
