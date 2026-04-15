/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class ModeloRegistrarAsistencia {

    ArchivoTexto objArch;

    public void registrarAsistencia(String nombre, String fecha, String estado) {
        Asistencia objAsist = new Asistencia();
             
         objAsist.setNombre(nombre);
         objAsist.setFecha(fecha);
         objAsist.setEstado(estado);
         
         this.objArch = new ArchivoTexto();
         this.objArch.abrirArchivoTexto('w', "asistencia.txt");
         this.objArch.crearLinea(objAsist.toString());
         this.objArch.cerrarArchivo('w');
    }
}


