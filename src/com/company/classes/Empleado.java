package com.company.classes;

public class Empleado {

    private String nombre;
    private String apellido;
    private String DNI;
    private double salario;

    public Empleado() {

    }

    public void cargarEmpleado(String nombre, String apellido, String DNI, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.salario = salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDNI() {
        return this.DNI;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

    public void muestraEmpleado() {
        System.out.println("Informacion Empleado:");
        System.out.println("DNI:---------- " + DNI);
        System.out.println("Nombre:------- " + nombre);
        System.out.println("Apellido:----- " + apellido);
        System.out.println("Salario------- " + salario);
    }

    public double salarioAnual(int salario) {
        salario *= 12;
        return salario;
    }

    public double aumentoSalario(double porcentaje, double salario) {
        salario = ((porcentaje * salario) / 100) + salario;
        return salario;
    }

}
