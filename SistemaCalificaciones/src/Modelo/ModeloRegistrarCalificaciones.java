/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class ModeloRegistrarCalificaciones {   
    ArchivoTexto  objArch;
   public void registrarCalificacion( String nombre, String materia, double calificacion){
       Calificacion objCalif = new Calificacion();
       
       objCalif.setNombre(nombre);
       objCalif.setMateria(materia);
       objCalif.setCalificacion(calificacion);
       
       this.objArch = new ArchivoTexto();
       this.objArch.abrirArchivoTexto('w', "Calificaciones.txt");
       this.objArch.crearLinea(objCalif.toString());
       this.objArch.cerrarArchivo('w');
   }
        
}
