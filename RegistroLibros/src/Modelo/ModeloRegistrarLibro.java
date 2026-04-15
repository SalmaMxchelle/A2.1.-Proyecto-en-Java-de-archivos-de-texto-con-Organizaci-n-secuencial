/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class ModeloRegistrarLibro {

    ArchivoTexto ObjArch;

    public void registrarLibro(String ISBN, String titulo, String autor) {
        Libro objLibro = new Libro();

        objLibro.setISBN(ISBN);
        objLibro.setTitulo(titulo);
        objLibro.setAutor(autor);

        this.ObjArch = new ArchivoTexto();
        this.ObjArch.abrirArchivoTexto('w', "libros.txt");
        this.ObjArch.crearLinea(objLibro.toString());
        this.ObjArch.cerrarArchivo('w');
    }

}
