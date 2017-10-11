package com.tamargo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce diez valores y se calculará la suma de ellos.");

        int i = 1;
        int a;
        int total = 0;

        do {
            System.out.print("Valor "+i+": ");

            String valor = br.readLine();
            a = Integer.parseInt(valor);

            total = total + a;
            i++;
        } while (i < 11);

        System.out.println("La suma total es: "+total);
    }
}
