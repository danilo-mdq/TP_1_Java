package com.company.classes;

public class Rectangulo {

    private double base = 1.0;
    private double altura = 1.0;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return this.base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void areaRectangulo() {
        System.out.println("El area es: " + (base * altura));
    }

    public void perimetroRectangulo() {
        System.out.println("El perimetro es: " + ((base + base) + (altura + altura)));
    }


}