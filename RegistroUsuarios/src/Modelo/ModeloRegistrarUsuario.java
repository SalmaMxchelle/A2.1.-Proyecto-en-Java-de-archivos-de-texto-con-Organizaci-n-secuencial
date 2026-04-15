/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
public class ModeloRegistrarUsuario {
    ArchivoTexto objArch;
    public void registrarUsuario(String usuario, String contrasenia){
        Usuario objUsuario = new Usuario();
        objUsuario.setUsuario(usuario);
        objUsuario.setContrasenia(contrasenia);

        this.objArch = new ArchivoTexto();
        this.objArch.abrirArchivoTexto('w', "usuarios.txt");
        this.objArch.crearLinea(objUsuario.toString());
        this.objArch.cerrarArchivo('w');

    }
}
