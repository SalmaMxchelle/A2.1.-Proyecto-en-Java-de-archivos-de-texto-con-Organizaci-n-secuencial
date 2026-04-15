/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class ModeloRegistrarPedido {

    ArchivoTexto ObjArch;

    public void registrarPedido(String Cliente, String Producto, int Cantidad) {
        Pedido objPedido = new Pedido();

        objPedido.setCliente(Cliente);
        objPedido.setProducto(Producto);
        objPedido.setCantidad(Cantidad);

        this.ObjArch = new ArchivoTexto();
        this.ObjArch.abrirArchivoTexto('w', "pedidos.txt");
        this.ObjArch.crearLinea(objPedido.toString());
        this.ObjArch.cerrarArchivo('w');
    }
}
