package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe cuantos valores quieres sumar: ");
        int n = Integer.parseInt(br.readLine());

        System.out.println("A continuación escribe los "+n+" valores.");

        //i = repeticiones
        //n = número de veces que debe repetirse
        int i;
        int total = 0;

        for (i = 1; i < n+1; i++) {
            System.out.print("Valor "+i+": ");
            int valor = Integer.parseInt(br.readLine());
            total = total + valor;
        }
        System.out.println("La suma de los "+n+" valores es: "+total);
    }
}