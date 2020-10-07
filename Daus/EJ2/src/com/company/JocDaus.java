package com.company;

import java.util.Scanner;

public class JocDaus {
    Scanner scanner = new Scanner(System.in);
    Dau dau1 = new Dau();
    Dau dau2 = new Dau();
    Dau dau3 = new Dau();

    public void start() {
        int seleccion;
        int victorias = 0;
        int jugado = 0;
        do {
            System.out.println("1. Tirar Dados");
            System.out.println("2. Salir");
            seleccion = scanner.nextInt();

            switch (seleccion) {
                case 1 -> {
                    dau1.tirar();
                    dau2.tirar();
                    dau3.tirar();
                    System.out.println(dau1.toString() + ", " + dau2.toString() + ", " + dau3.toString());
                    if (dau1.getValor() == dau2.getValor() && dau1.getValor() == dau3.getValor()) {
                        victorias++;
                    } else {
                        jugado++;
                    }
                }
                case 2 -> {
                    System.out.println("---------------------------------------------");
                    System.out.println("Has jugado " + jugado + " veces");
                    System.out.println("Has ganado " + victorias + " veces");
                    System.out.println("---------------------------------------------");
                }
            }
        } while (seleccion != 2);
    }
}
