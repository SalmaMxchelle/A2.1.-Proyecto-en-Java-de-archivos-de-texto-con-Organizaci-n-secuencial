/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class ModeloListarVentas {
 ArchivoTexto objArch;
 
 public Object[][] listarVentas(String[] columnas){
        this.objArch = new ArchivoTexto();
        this.objArch.abrirArchivoTexto('r',"Ventas.txt");                
        Object[][] datos = this.objArch.obtenerMatrizLineas(columnas.length);        
        this.objArch.cerrarArchivo('r');
        return datos;
}
}
