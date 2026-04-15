/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
public class ModeloListarCalificaciones {
    ArchivoTexto objArch;
    
     public Object[][] listarCalificaciones(String[] columnas){
        this.objArch = new ArchivoTexto();
        this.objArch.abrirArchivoTexto('r',"Calificaciones.txt");                
        Object[][] datos = this.objArch.obtenerMatrizLineas(columnas.length);        
        this.objArch.cerrarArchivo('r');
        return datos;
}
}
