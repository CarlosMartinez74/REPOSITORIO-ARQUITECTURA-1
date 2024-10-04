package Vista;

import java.util.Date;

public class Alumno {

    String Nombre;
    String Apellido;
    String Codigo;
    Date añonacimiento;
    String DNI;
    String Ciclo;

    public Alumno() {
    }

    public Alumno(String Nombre, String Apellido, String Codigo, Date añonacimiento, String DNI, String Ciclo) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Codigo = Codigo;
        this.añonacimiento = añonacimiento;
        this.DNI = DNI;
        this.Ciclo = Ciclo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public Date getAñonacimiento() {
        return añonacimiento;
    }

    public void setAñonacimiento(Date añonacimiento) {
        this.añonacimiento = añonacimiento;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getCiclo() {
        return Ciclo;
    }

    public void setCiclo(String Ciclo) {
        this.Ciclo = Ciclo;
    }

    @Override
    public String toString() {
        return "Alumno{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Codigo=" + Codigo + ", a\u00f1onacimiento=" + añonacimiento + ", DNI=" + DNI + ", Ciclo=" + Ciclo + '}';
    }

}
