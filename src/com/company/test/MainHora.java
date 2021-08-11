package com.company.test;

import com.company.classes.Hora;

public class MainHora {
    public static void main(String[] args) throws InterruptedException {
        Hora ahora = new Hora();
        int i;
        ahora.cargarHora(00,59,50);
        for(i=0;i<100;i++) {
            /*ahora.imprimirHora();

            ahora.sumaSegundo();
            ahora.imprimirHora();

            ahora.restaSegundo();
            ahora.imprimirHora();*/
            Thread.sleep(1000);
            ahora.sumaSegundo();
            ahora.imprimirHora();
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }


    }
}
