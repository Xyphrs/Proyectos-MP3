package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantas veces quieres tirar el dado?");
        int veces = scanner.nextInt();
        Random r1 = new Random();

        int c2 = 0,c3 = 0,c4 = 0,c5 = 0,c6 = 0,c7 = 0,c8 = 0,c9 = 0,c10 = 0,c11 = 0,c12 = 0;


        System.out.println("Lanzando dados...");

        for (int i = 0; i < veces; i++) {
            int dado1 = r1.nextInt(6+1);
            int dado2 = r1.nextInt(6+1);

            int result = dado1 + dado2;
            switch (result) {
                case 2 -> c2++;
                case 3 -> c3++;
                case 4 -> c4++;
                case 5 -> c5++;
                case 6 -> c6++;
                case 7 -> c7++;
                case 8 -> c8++;
                case 9 -> c9++;
                case 10 -> c10++;
                case 11 -> c11++;
                case 12 -> c12++;
            }
        }

        System.out.println("Resultados");
        System.out.println("2 --> " + c2);
        System.out.println("3 --> " + c3);
        System.out.println("4 --> " + c4);
        System.out.println("5 --> " + c5);
        System.out.println("6 --> " + c6);
        System.out.println("7 --> " + c7);
        System.out.println("8 --> " + c8);
        System.out.println("9 --> " + c9);
        System.out.println("10 --> " + c10);
        System.out.println("11 --> " + c11);
        System.out.println("12 --> " + c12);

    }
}
