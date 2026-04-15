/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.ModeloRegistrarUsuario;
public class CtrlRegistrarUsuario {
    ModeloRegistrarUsuario objRegistrarUsuario;
    public CtrlRegistrarUsuario() {
        this.objRegistrarUsuario = new ModeloRegistrarUsuario();
    }

    public void registrarUsuario(String usuario, String contrasenia){
        this.objRegistrarUsuario.registrarUsuario(usuario,contrasenia);
    }
}
