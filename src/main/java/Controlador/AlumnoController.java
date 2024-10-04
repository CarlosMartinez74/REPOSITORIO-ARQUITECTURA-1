
package Controlador;

import Vista.Alumno;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;


public class AlumnoController {
    
    
    private ArrayList<Alumno> listaAlumnos;
    private DefaultTableModel modeloTabla;

    public AlumnoController(DefaultTableModel modeloTabla) {
        this.listaAlumnos = new ArrayList<>();
        this.modeloTabla = modeloTabla;
    }

    // Agregar alumno
    public void agregarAlumno(String nombre, String apellido, String codigo, Date fechaNacimiento, String dni, String ciclo, int edad) {
        Alumno alumno = new Alumno(nombre, apellido, codigo, fechaNacimiento, dni, ciclo);
        listaAlumnos.add(alumno);
        modeloTabla.addRow(new Object[]{nombre, apellido, codigo, edad, dni, ciclo});
    }

    // Eliminar alumno
    public void eliminarAlumno(int indice) {
        if (indice >= 0 && indice < listaAlumnos.size()) {
            listaAlumnos.remove(indice);
            modeloTabla.removeRow(indice);
        }
    }

    // Editar alumno
    public void editarAlumno(int indice, String nombre, String apellido, String codigo, Date fechaNacimiento, String dni, String ciclo, int edad) {
        Alumno alumno = listaAlumnos.get(indice);
        alumno.setNombre(nombre);
        alumno.setApellido(apellido);
        alumno.setCodigo(codigo);
        alumno.setAñonacimiento(fechaNacimiento);
        alumno.setDNI(dni);
        alumno.setCiclo(ciclo);

        modeloTabla.setValueAt(nombre, indice, 0);
        modeloTabla.setValueAt(apellido, indice, 1);
        modeloTabla.setValueAt(codigo, indice, 2);
        modeloTabla.setValueAt(edad, indice, 3);
        modeloTabla.setValueAt(dni, indice, 4);
        modeloTabla.setValueAt(ciclo, indice, 5);
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }
}
