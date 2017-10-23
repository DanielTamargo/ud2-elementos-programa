package com.tamargo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Random r = new Random();
        int aleatorio = r.nextInt(100);

        String texto;
        int n = -1;

        System.out.println("Intenta adivinar el número elegido aleatoriamente entre 0 y 100 o escribe 'Fin' para acabar.");

        do {
            System.out.print("Escribe un número: ");
            texto = br.readLine();

            if (texto.equalsIgnoreCase("fin")) {
                System.out.println("¡Cobarde! Te has rendido :(");
            } else {
                n = Integer.parseInt(texto);
                if (n == aleatorio) {
                    System.out.println("¡Has acertado!");
                } else {
                    if (n > aleatorio) {
                        System.out.println("El número que buscas es menor.");
                    } else {
                        System.out.println("El número que buscas es mayor.");
                    }
                }
            }
        } while (!texto.equalsIgnoreCase("fin") && n != aleatorio);
    }
}