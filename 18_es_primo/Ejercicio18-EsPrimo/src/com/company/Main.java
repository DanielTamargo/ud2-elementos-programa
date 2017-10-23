package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = 1;
        int resto;

        System.out.print("Introduce un valor: ");
        int valor = Integer.parseInt(br.readLine());

        if (valor < 2) {
            System.out.println("El 0 y el 1 son números especiales y no son considerados primos ni compuestos.");
            System.out.println("Los números negativos no son números primos ya que la definición de número primo es:");
            System.out.println("'Número natural mayor que 1 que tiene únicamente dos divisores distintos: él mismo y el 1.'");
        } else {
                do {
                    x++;
                    resto = valor % x;
            } while (resto != 0);

                if (valor == x) {
                    System.out.println("Es primo.");
                } else {
                    System.out.println("No es primo.");
                }
        }
    }
}
