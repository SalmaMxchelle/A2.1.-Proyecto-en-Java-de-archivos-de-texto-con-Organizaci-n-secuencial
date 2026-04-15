/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ModeloRegistrarContacto;

public class CtrlRegistrarContactos {
    
    ModeloRegistrarContacto ObjModeloRegistrarContact;

    public CtrlRegistrarContactos() {
        this.ObjModeloRegistrarContact = new ModeloRegistrarContacto();
    }

  public void registrarContacto(String nombre, String telefono, String gmail){
      this.ObjModeloRegistrarContact.RegistrarContacto( nombre, telefono,  gmail);
  }
}
