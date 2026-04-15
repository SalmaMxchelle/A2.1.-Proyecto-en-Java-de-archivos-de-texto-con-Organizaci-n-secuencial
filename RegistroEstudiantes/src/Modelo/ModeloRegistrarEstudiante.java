/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class ModeloRegistrarEstudiante {

    ArchivoTexto ObjArch;

        public void listarEstudiante(String numControl, String nombre, String carrera, double promedio) {
   
        Estudiante ObjEst = new Estudiante();
        ObjEst.setNumControl(numControl);
        ObjEst.setNombre(nombre);
        ObjEst.setCarrera(carrera);
        ObjEst.setPromedio(promedio);

        this.ObjArch = new ArchivoTexto();
        this.ObjArch.abrirArchivoTexto('w', "estudiantes.txt");
        this.ObjArch.crearLinea(ObjEst.toString());
        this.ObjArch.cerrarArchivo('w');
    }
}
