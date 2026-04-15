/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
public class ModeloLogin {
       ArchivoTexto ObjArch;
    public boolean validar(String usuario, String contrasenia) {
        ObjArch = new ArchivoTexto();
        ObjArch.abrirArchivoTexto('r', "usuarios.txt");
        Object[][] datos = ObjArch.obtenerMatrizLineas(2);
        ObjArch.cerrarArchivo('r');

        for (int i = 0; i < datos.length; i++) {
            String usuarioArchivo = datos[i][0].toString();
            String contraseniaArchivo = datos[i][1].toString();

            if (usuarioArchivo.equals(usuario) && contraseniaArchivo.equals(contrasenia)) {
                return true;
            } 
        }
        return false;
    }
}
