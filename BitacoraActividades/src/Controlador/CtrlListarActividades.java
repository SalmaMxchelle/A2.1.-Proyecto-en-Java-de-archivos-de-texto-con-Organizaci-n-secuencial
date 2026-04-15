/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.ModeloListarActividad;
import Vista.FrmListarActividades;
import javax.swing.table.DefaultTableModel;

public class CtrlListarActividades {
    
    ModeloListarActividad objModeloListarActividad;
    FrmListarActividades objListarActividades;

    public CtrlListarActividades( FrmListarActividades objListarActividades) {
              this.objListarActividades = objListarActividades;
              this.objModeloListarActividad = new ModeloListarActividad();
    }
      
  public void listarActividad(String[] columnas) {
        Object[][] datos;
        datos = this.objModeloListarActividad.listarActividad(columnas);
        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        this.objListarActividades.tblListarActividades.setModel(modelo);
    }
}
