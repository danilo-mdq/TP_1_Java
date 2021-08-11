package com.company.classes;

public class Item {
    private int identificador;
    private String descripcion;
    private int cantidad;
    private double precio;

    public Item(){

    }

    public void cargarItem(int identificador,String descripcion, int cantidad,double precio){
        this.identificador=identificador;
        this.descripcion=descripcion;
        this.cantidad=cantidad;
        this.precio=precio;
    }

    public void setIdentificador(int identificador){
        this.identificador=identificador;
    }
    public int getIdentificador(){
        return this.identificador;
    }

    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    public String getDescripcion(){
        return this.descripcion;
    }

    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }
    public int getCantidad(){
        return this.cantidad;
    }

    public void setPrecio(double precio){
        this.precio=precio;
    }
    public double getPrecio(){
        return this.precio;
    }

    public void muestraUnItem(){
        System.out.println("Informacion Item:");
        System.out.println("Identificador:....... " + identificador);
        System.out.println("Descripcion:......... " + descripcion);
        System.out.println("Cantidad:............ " + cantidad);
        System.out.println("Precio:.............. " + precio);
        System.out.println("Precio Total:........ " + precioTotal(cantidad,precio));
    }

    public double precioTotal(int cantidad, double precio){
        double precioTotal=0;
        precioTotal=cantidad*precio;
        return precioTotal;
    }




}
