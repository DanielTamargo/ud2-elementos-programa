package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int end = 0;

            do {
                System.out.print("Escribe par o impar: ");
                String x = br.readLine();

                if (new String(x).equals("par")==true) {
                    System.out.println("Los 100 primeros números pares son:");
                    int vueltas = 99;
                    int par = 0;
                    while (vueltas > 0) {
                        System.out.print(par+", ");
                        par = par + 2;
                        --vueltas;
                    }
                    System.out.println("198.");
                    ++end;
                } else {
                    if (new String(x).equals("impar")==true) {
                        System.out.println("Los 100 primeros números impares son:");
                        int vueltas = 99;
                        int impar = 1;
                        while (vueltas > 0) {
                            System.out.print(impar+", ");
                            impar = impar + 2;
                            --vueltas;
                        }
                        System.out.println("199.");
                        ++end;
                    } else {
                        System.out.println("Error, elección desconocida.");
                    }
                }
            } while (end == 0);
    }
}