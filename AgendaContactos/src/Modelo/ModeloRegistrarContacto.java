/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class ModeloRegistrarContacto {
     
    ArchivoTexto ObjArch;

    public void RegistrarContacto(String nombre,    String telefono,     String gmail) {
       Contacto ObjContact = new Contacto();
    
       ObjContact.setNombre(nombre);
       ObjContact.setTelefono(telefono);
       ObjContact.setGmail(gmail);
       
       this.ObjArch= new ArchivoTexto();//objArchivo texto
       this.ObjArch.abrirArchivoTexto('w', "contactos.txt");
       this.ObjArch.crearLinea(ObjContact.toString());
       this.ObjArch.cerrarArchivo('w');
    }

}
