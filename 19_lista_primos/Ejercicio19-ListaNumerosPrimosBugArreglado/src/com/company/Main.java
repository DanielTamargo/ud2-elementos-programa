package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce un número: ");
        int n = Integer.parseInt(br.readLine());
        int i = 3;
        int resto;
        int x = 1;

        if (n < 2) {
            System.out.println("Debes introducir un número igual o superior a 2 para sacar la lista de números primos.");
        } else {

            if (n == 2) {
                System.out.println("Has introducido 2, que es el primer número primo por lo que no hay más en la lista.");

            } else {

                System.out.print("La lista de números primos es: 2");

                do {
                    do {
                        x++;
                        resto = i % x;
                    } while (resto != 0);

                    if (i == x) {
                        System.out.print(", " + i);
                    }
                    i++;
                    x = 1;
                } while (i < n);

                i = 1;

                if (n == 3) {
                    System.out.print(".");
                } else {

                    do {
                        i++;
                        resto = n % i;
                    } while (resto != 0);

                    if (n == i) {
                        System.out.print(", " + n + ".");
                    } else {
                        System.out.print(".");
                    }
                }
            }
        }
    }
}