/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.ModeloLogin;
public class CtrlLogin { 
    ModeloLogin objLogin;
    public CtrlLogin() {
        this.objLogin = new ModeloLogin();
    }
    
    public boolean validarRegistro(String usuario, String contrasenia){
       return this.objLogin.validar(usuario, contrasenia);
    }            
}
