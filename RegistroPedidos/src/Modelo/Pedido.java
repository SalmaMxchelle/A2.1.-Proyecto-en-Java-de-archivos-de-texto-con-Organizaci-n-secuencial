/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Pedido {

    String Cliente;
    String Producto;
    int Cantidad;

    public Pedido(String Cliente, String Producto, int Cantidad) {
        this.Cliente = Cliente;
        this.Producto = Producto;
        this.Cantidad = Cantidad;
    }

    public Pedido() {
        this("","",0);
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
     public String toString() {
        return this.getCliente() + ","
                + this.getProducto() + ","
                + this.getCantidad();
    }
}
