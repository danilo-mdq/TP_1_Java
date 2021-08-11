package com.company.classes;

public class Cuenta {
    private int identificador;
    private String nombre;
    private double balance;


    public Cuenta() {
    }

    public void cargarCuenta(int identificador, String nombre, double balance) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.balance = balance;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getIdentificador() {
        return this.identificador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    //a. El método crédito que representa un depósito de dinero en la cuenta. Este
    //método debe devolver el balance luego de la operación.

    public double credito(double credito) {
        balance += credito;
        return balance;
    }
    //b. El método débito que representa una sustracción de dinero de la cuenta.
    //Este método debe devolver el balance luego de la operación. Si el dinero en
    //la cuenta no es suficiente para cubrir la sustracción, se debe imprimir por
    //pantalla un aviso

    public double debito(double debito) {
        if (balance <= debito) {
            System.out.println("No hay dinero suficiente");
        } else {
            balance -= debito;
        }
        return balance;
    }

    //c. Un método que imprima por pantalla las características del objeto.

    public void muestraCuenta(){
        System.out.println("Identificador:... " + identificador);
        System.out.println("Nombre:.......... " + nombre);
        System.out.println("Balance:......... " + balance);
    }

}