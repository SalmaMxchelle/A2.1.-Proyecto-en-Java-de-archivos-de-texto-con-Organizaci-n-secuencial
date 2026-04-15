/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class ModeloListarPedidos {
       ArchivoTexto objArchivoTexto;
    
    public Object[][] listarPedido(String[] columnas){
        this.objArchivoTexto = new ArchivoTexto();
        this.objArchivoTexto.abrirArchivoTexto('r',"pedidos.txt");                
        Object[][] datos = this.objArchivoTexto.obtenerMatrizLineas(columnas.length);        
        this.objArchivoTexto.cerrarArchivo('r');
        return datos;
}
}
