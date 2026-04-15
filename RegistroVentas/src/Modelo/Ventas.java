/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
public class Ventas {
    String fecha;
    String producto;
    int cantidad;
    double total;

    public Ventas(String fecha, String producto, int cantidad, double total) {
        this.fecha = fecha;
        this.producto = producto;
        this.cantidad = cantidad;
        this.total = total;
    }

    public Ventas() {
        this(" ", " ", 0, 0.0);
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
       
    public String toString(){
        return this.getFecha() + "," +
                this.getProducto() + "," +
                this.getCantidad()+ "," +
                this.getTotal();
    }
}
