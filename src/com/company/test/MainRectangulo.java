package com.company.test;

import com.company.classes.Rectangulo;

public class MainRectangulo {
    public static void main(String[] args) {

        ///Ejercicio 1:
        ///Putno a)
        Rectangulo rectangulo1 = new Rectangulo();

        ///Punto b)
        System.out.println("Alto: " + rectangulo1.getAltura() + "\n Base: " + rectangulo1.getBase());

        ///Punto c)
        rectangulo1.areaRectangulo();
        rectangulo1.perimetroRectangulo();

        ///Punto d)
        rectangulo1.setAltura(4);
        rectangulo1.getAltura();

        rectangulo1.setBase(6);
        rectangulo1.getBase();

        System.out.println("Alto: " + rectangulo1.getAltura() + "\nBase: " + rectangulo1.getBase());

        ///Punto e)

        rectangulo1.areaRectangulo();
        rectangulo1.perimetroRectangulo();

        ///Punto f)
        Rectangulo rectangulo2 = new Rectangulo();

        System.out.println("Alto: " + rectangulo2.getAltura() + "\nBase: " + rectangulo2.getBase());
        rectangulo2.areaRectangulo();
        rectangulo2.perimetroRectangulo();
    }
}
