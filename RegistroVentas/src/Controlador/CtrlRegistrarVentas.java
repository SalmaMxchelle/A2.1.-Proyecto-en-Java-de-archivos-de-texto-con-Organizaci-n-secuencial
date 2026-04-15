/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ModeloRegistrarVenta;
public class CtrlRegistrarVentas {
    
ModeloRegistrarVenta objModeloRegistrarVenta;
    public CtrlRegistrarVentas() {
        this.objModeloRegistrarVenta = new ModeloRegistrarVenta();
    }

   public void registrarVentas(String fecha, String producto, int cantidad,double total){
       this.objModeloRegistrarVenta.RegistrarVenta(fecha, producto, cantidad, total);
   }
    }
