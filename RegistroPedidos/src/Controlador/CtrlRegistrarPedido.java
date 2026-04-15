/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ModeloRegistrarPedido;


public class CtrlRegistrarPedido {
    ModeloRegistrarPedido ObjModeloRegistrarPedido;

    public CtrlRegistrarPedido() {
        this.ObjModeloRegistrarPedido = new ModeloRegistrarPedido();
    }
    

    public void registrarPedido(String Cliente, String Producto, int Cantidad){
        this.ObjModeloRegistrarPedido.registrarPedido(Cliente, Producto, Cantidad);
    }
}
