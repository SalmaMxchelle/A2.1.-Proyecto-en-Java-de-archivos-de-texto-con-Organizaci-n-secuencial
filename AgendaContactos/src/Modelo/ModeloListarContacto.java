/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class ModeloListarContacto {

    ArchivoTexto objArch;

    public Object[][] listarContactos(String[] columnas) {
        this.objArch = new ArchivoTexto();
        this.objArch.abrirArchivoTexto('r', "contactos.txt");
        Object[][] datos = this.objArch.obtenerMatrizLineas(columnas.length);
        this.objArch.cerrarArchivo('r');
        return datos;
    }

}
