/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class ModeloRegistrarVenta {
   ArchivoTexto objArch;
      public void RegistrarVenta(String fecha,String producto, int cantidad, double total){
       Ventas objVenta = new Ventas();
       
       objVenta.setFecha(fecha);
       objVenta.setProducto(producto);
       objVenta.setCantidad(cantidad);
       objVenta.setTotal(total);
       
       this.objArch= new ArchivoTexto();
       this.objArch.abrirArchivoTexto('w', "Ventas.txt");
       this.objArch.crearLinea(objVenta.toString());
       this.objArch.cerrarArchivo('w');
   }
}
