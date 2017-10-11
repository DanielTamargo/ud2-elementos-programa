package com.tamargo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce un valor para saber su valor absoluto o 0 para finalizar el programa.");

        int a;

        do {
            System.out.print("Valor: ");
            String valor = br.readLine();
            a = Integer.parseInt(valor);

            if (a < 0) {
                a = a * -1;
                System.out.println("Valor absoluto: "+a);
            } else {
                if (a > 0) {
                    System.out.println("Valor absoluto: "+a);
                } else  {    }
            }

        }   while (a != 0) ;
    }
}