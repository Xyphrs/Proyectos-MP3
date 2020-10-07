package com.company;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    JocDaus jocDaus = new JocDaus();

    public void start() {
        int menuSeleccion1;

        System.out.println("A que quieres jugar? (Elige un numero)");

        do {
            System.out.println("1. Dados");
            System.out.println("2. Parchis");
            System.out.println("3. Tic Tac Toe");
            System.out.println("4. Salir");
            menuSeleccion1 = scanner.nextInt();

            switch (menuSeleccion1) {
                case 1:
                    jocDaus.start();
                    break;
                case 2:
                case 3:
                    System.out.println("Solo hay dados");
                    break;
                case 4:
                    break;
            }
        } while (menuSeleccion1 != 4);
    }
}
