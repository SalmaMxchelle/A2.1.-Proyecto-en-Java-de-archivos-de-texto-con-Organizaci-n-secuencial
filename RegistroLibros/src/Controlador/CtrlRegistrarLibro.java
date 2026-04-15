/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ModeloRegistrarLibro;


public class CtrlRegistrarLibro {
     ModeloRegistrarLibro ObjModeloRegistrarLibro;

    public CtrlRegistrarLibro() {
        this.ObjModeloRegistrarLibro = new ModeloRegistrarLibro();
    }
    

    public void registrarLibro(String ISBN, String titulo, String autor){
        this.ObjModeloRegistrarLibro.registrarLibro(ISBN, titulo, autor);
    }
}
