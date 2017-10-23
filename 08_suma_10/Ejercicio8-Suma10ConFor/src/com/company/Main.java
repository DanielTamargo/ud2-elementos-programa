package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("A continuación vas a sumar 10 valores (números).");

        //i = repeticiones
        int i;
        int total = 0;

        for (i = 1; i < 11; i++) {
            System.out.print("Valor "+i+": ");
            int valor = Integer.parseInt(br.readLine());
            total = total + valor;
        }
        System.out.println("La suma de los 10 valores es: "+total);
    }
}
