package controlador;

import Modelo.ModeloListarEstudiante;
import Vista.FrmListar;
import javax.swing.table.DefaultTableModel;

public class CtrlListarEstudiantes {

    ModeloListarEstudiante objModeloListarEstudiante; // Apunta al modelo
    FrmListar ObjListarEstudiantes; // apuntando a la vista de Listar estudiantes

    public CtrlListarEstudiantes(FrmListar ObjListarEstudiantes) {
        this.ObjListarEstudiantes = ObjListarEstudiantes;
        this.objModeloListarEstudiante = new ModeloListarEstudiante();
    }

    public void listarEstudiantes(String[] columnas) {
        Object[][] datos;
        datos = this.objModeloListarEstudiante.listarEstudiante(columnas);
        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        this.ObjListarEstudiantes.TblListar.setModel(modelo);
    }
}
