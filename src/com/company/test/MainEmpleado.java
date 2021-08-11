package com.company.test;

import com.company.classes.Empleado;

public class MainEmpleado {
    public static void main(String[] args) {
        //a. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de
        //25000.
        Empleado Carlos = new Empleado();

       Carlos.setDNI("23456345");
        Carlos.getDNI();

        Carlos.setNombre("Carlos");
        Carlos.getNombre();

        Carlos.setApellido("Gutierrez");
        Carlos.getApellido();

        Carlos.setSalario(25000);
        Carlos.getSalario();

        //b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de
        //27500.

        Empleado Ana = new Empleado();

        Ana.cargarEmpleado("Ana", "Sanchez", "34234123", 27500);
        //c. Imprima ambos objetos por pantalla

        Carlos.muestraEmpleado();
        Ana.muestraEmpleado();

        ////d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el
        //salario anual del mismo.
        Carlos.setSalario(Carlos.aumentoSalario(15,25000));
        Carlos.getSalario();
        Carlos.muestraEmpleado();
        //Carlos.salarioAnual();




    }
}
