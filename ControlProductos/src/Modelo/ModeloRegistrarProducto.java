/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class ModeloRegistrarProducto {

    ArchivoTexto ObjArch;
    
    public void registrarProducto(String ID, String nombre,  double precio, int cantidad) {
        Producto ObjProduct = new Producto();
        ObjProduct.setID(ID);
        ObjProduct.setNombre(nombre);
         ObjProduct.setPrecio(precio);
        ObjProduct.setCantidad(cantidad);
       
        this.ObjArch= new ArchivoTexto();
        this.ObjArch.abrirArchivoTexto('w', "Productos.txt");
        this.ObjArch.crearLinea(ObjProduct.toString());
        this.ObjArch.cerrarArchivo('w');
    }
}
