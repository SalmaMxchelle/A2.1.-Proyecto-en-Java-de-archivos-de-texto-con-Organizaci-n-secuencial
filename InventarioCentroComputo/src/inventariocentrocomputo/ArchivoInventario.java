/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventariocentrocomputo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArchivoInventario {
    
    private String archivo = "inventario.dat";

    // 📌 ALTA
    public void agregarProducto(Producto p) {
        ArrayList<Producto> lista = leerTodos();
        lista.add(p);
        guardarLista(lista);
    }

    // 📌 CONSULTA GENERAL
    public ArrayList<Producto> leerTodos() {
        ArrayList<Producto> lista = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            lista = (ArrayList<Producto>) ois.readObject();
        } catch (Exception e) {
            // Archivo vacío o no existe
        }

        return lista;
    }

    // 📌 GUARDAR TODO
    private void guardarLista(ArrayList<Producto> lista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 📌 BUSCAR
    public Producto buscar(int id) {
        for (Producto p : leerTodos()) {
            if (p.getId() == id && p.isEstado()) {
                return p;
            }
        }
        return null;
    }

    // 📌 BAJA (eliminación lógica)
    public boolean eliminar(int id) {
        ArrayList<Producto> lista = leerTodos();

        for (Producto p : lista) {
            if (p.getId() == id && p.isEstado()) {
                p.setEstado(false);
                guardarLista(lista);
                return true;
            }
        }
        return false;
    }

    // 📌 CAMBIO (modificación)
    public boolean modificar(int id, String nombre, String desc, int existencia) {
        ArrayList<Producto> lista = leerTodos();

        for (Producto p : lista) {
            if (p.getId() == id && p.isEstado()) {
                p.setNombre(nombre);
                p.setDescripcion(desc);
                p.setExistencia(existencia);
                guardarLista(lista);
                return true;
            }
        }
        return false;
    }

    // 📌 LISTAR ACTIVOS
    public void listar() {
        for (Producto p : leerTodos()) {
            if (p.isEstado()) {
                System.out.println(p);
            }
        }
    }
}
