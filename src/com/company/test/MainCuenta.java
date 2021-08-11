package com.company.test;

import com.company.classes.Cuenta;

public class MainCuenta {
    public static void main(String[] args) {
        //Realice las siguientes operaciones:
        //1. Inicialice una cuenta con un monto inicial de 15000.

        Cuenta danilo = new Cuenta();
        danilo.cargarCuenta(1,"Danilo",15000);
        danilo.muestraCuenta();

        //2. Realice una operación de crédito de 2500.
        danilo.credito(2500);
        danilo.getBalance();
        danilo.muestraCuenta();

        //3. Realice una operación de compra de 1500.
        danilo.debito(1500);
        danilo.muestraCuenta();

        //4. Realice una operación de compra de 30000.
        danilo.debito(30000);
        danilo.muestraCuenta();

        //5. Imprima por pantalla los valores de la cuenta y verifique que el balance sea
        //correcto.
    }
}
