package com.company.test;

import com.company.classes.Item;

public class MainItem {
    public static void main(String[] args) {
        Item Remera = new Item();

        Remera.cargarItem(1,"Remera manga corta",3,45.9);

        Remera.muestraUnItem();

    }
}
