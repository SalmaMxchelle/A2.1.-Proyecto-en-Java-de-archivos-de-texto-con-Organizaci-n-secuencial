/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.ModeloRegistrarProducto;
public class CtrlRegistrarProducto {

    ModeloRegistrarProducto ObjModeloRegistrarProducto;
    
    public CtrlRegistrarProducto(){
        this.ObjModeloRegistrarProducto = new ModeloRegistrarProducto();
    }
    
     public void registrarProducto(String ID,String nombre, double precio, int cantidad){
      this.ObjModeloRegistrarProducto.registrarProducto( ID, nombre,  precio,  cantidad);
  }
}

    
