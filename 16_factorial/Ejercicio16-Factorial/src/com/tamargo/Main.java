package com.tamargo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Escribe un valor del cual quieras calcular su factorial.");
        System.out.print("Valor: ");

        int n = Integer.parseInt(br.readLine());
        long total = 1;
        int i;

        for (i = 1; i < n+1; i++) {
            total = total * i;
        }
        System.out.println("El factorial es: "+total);

        //int=32
        //long=64
    }
}