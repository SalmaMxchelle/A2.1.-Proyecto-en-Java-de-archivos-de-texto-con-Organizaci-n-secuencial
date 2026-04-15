/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ModeloListarVentas;
import Vista.FrmListarVentas;
import javax.swing.table.DefaultTableModel;

public class CtrlListarVentas {
    ModeloListarVentas objModeloListarVentas;
    FrmListarVentas objListarVentas;

    public CtrlListarVentas(FrmListarVentas objListarVentas) {
               this.objListarVentas = objListarVentas;
               this.objModeloListarVentas = new ModeloListarVentas();
    }
     
     public void listarVentas(String[] columnas) {
        Object[][] datos;
        datos = this.objModeloListarVentas.listarVentas(columnas);
        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        this.objListarVentas.tblListarVentas.setModel(modelo);
    }
}
