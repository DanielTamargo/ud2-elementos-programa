package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe el valor del cual quieras calcular su cuadrado: ");
        int valor = Integer.parseInt(br.readLine());

        int i;
        int cuadrado = valor;

        for (i = 1; i < valor; i++) {
            cuadrado = cuadrado + valor;
        }
        System.out.println("El cuadrado de "+valor+" es: "+cuadrado);

    }
}