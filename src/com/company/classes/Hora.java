package com.company.classes;

public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    public Hora() {

    }

    public void cargarHora(int hora, int minuto, int segundo) {

        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getHora() {
        return this.hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getMinuto() {
        return this.minuto;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int getSegundo() {
        return this.segundo;
    }

    //1. Un método que imprima la hora bajo el siguiente formato hh:mm:ss
    //usando zero a la izquierda ejemplo 13:04:22

    public void imprimirHora() {
        System.out.println(hora + ":" + minuto + ":" + segundo);
    }

    //2. Un método que avance en 1 segundo y devuelva la instancia del objeto.

    public void sumaSegundo() {
        this.segundo += 1;

        if (segundo <= 59) {
            this.segundo = segundo;
        } else {
            this.minuto += 1;
            this.segundo = 00;
        }
        if (minuto <= 59) {
            this.minuto = minuto;
        } else {
            this.hora += 1;
            this.minuto = 00;
        }
        if (hora <= 23) {
            this.hora = hora;
        } else {
            this.hora = 00;
        }


    }
    //3. Un método que retroceda en 1 segundo y devuelva la instancia del objeto.

    public void restaSegundo() {
        this.segundo -= 1;

        if (segundo == -1 & hora == 0 & minuto == 0) {
            this.hora = 23;
            this.minuto = 59;
            this.segundo = 59;
        } else if (segundo == -1) {
            this.minuto -= 1;
            this.segundo = 59;
        }else{
            this.segundo-=1;
        }
    }
}
