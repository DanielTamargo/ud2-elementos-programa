package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Escribe todos los valores que quieras sumar y escribe 'FIN' cuando hayas acabado.");

        int i = 1;
        int total = 0;
        String valor;

        do {
            System.out.print("Valor "+i+": ");
            valor = br.readLine();

            if (valor.equalsIgnoreCase("FIN") == false) {

                int x = Integer.parseInt(valor);
                total = total + x;
                i++;
            }

        } while (valor.equalsIgnoreCase("FIN") == false);

        i = i - 1;
        //resto uno a i para que el valor "Fin" no cuente como valor sumado

        System.out.println("La suma total de los "+i+" valores es: "+total);
    }
}
