/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
public class ModeloRegistrarActividad {    
    ArchivoTexto ObjArch;
   public void registrarActividad(String fecha,String actividad ){
       Actividad objAct = new Actividad();
       objAct.setFecha(fecha);
       objAct.setActividad(actividad);
       
       this.ObjArch = new ArchivoTexto();
       this.ObjArch.abrirArchivoTexto('w', "Bitacora.txt");
       this.ObjArch.crearLinea(objAct.toString());
       this.ObjArch.cerrarArchivo('w');
   }
}
