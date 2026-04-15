/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class ModeloListarAsistencia {
    ArchivoTexto objArchivoTexto;
    
    public Object[][] listarAsistencia(String[] columnas){
        this.objArchivoTexto = new ArchivoTexto();
        this.objArchivoTexto.abrirArchivoTexto('r',"asistencia.txt");                
        Object[][] datos = this.objArchivoTexto.obtenerMatrizLineas(columnas.length);        
        this.objArchivoTexto.cerrarArchivo('r');
        return datos;
} 
}
