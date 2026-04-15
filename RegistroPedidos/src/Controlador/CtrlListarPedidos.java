/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ModeloListarPedidos;
import Vista.FrmListarPedidos;
import javax.swing.table.DefaultTableModel;

public class CtrlListarPedidos {
   
    ModeloListarPedidos objModeloListarPedidos;
    FrmListarPedidos ObjListarPedidos;

    public CtrlListarPedidos( FrmListarPedidos ObjListarPedidos) {
               this.ObjListarPedidos = ObjListarPedidos;
              this.objModeloListarPedidos = new  ModeloListarPedidos();
    }
    
    public void listarPedidos(String[] columnas) {
        Object[][] datos;
        datos = this.objModeloListarPedidos.listarPedido(columnas);
        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        this.ObjListarPedidos.tblListarPedidos.setModel(modelo);
    }
}
