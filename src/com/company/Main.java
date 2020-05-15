package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        Podstawowa b1 = new Podstawowa();
        b1.wypisz();
        System.out.println();

        Pochodna d1 = new Pochodna();
        d1.wypisz();
    }
}

class Podstawowa {

    void wypisz() {
        System.out.println("Hello");
    }

}

class Pochodna extends Podstawowa {
    void wypisz() {
        super.wypisz();
        System.out.println("World");
    }
}