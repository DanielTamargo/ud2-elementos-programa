package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int cuenta;
            int vuelta;

                System.out.print("Escribe par o impar: ");
                String x = br.readLine();

                if (x.equals("par")) {
                    cuenta = 0;
                    } else {
                    cuenta = 1;
                    }
                for (vuelta = 1; vuelta < 100; vuelta++) {
                    System.out.print(+cuenta+", ");
                    cuenta = cuenta + 2;
                }
                //para hacer que quede bonito y que al final tenga un punto volveré a hacer un if
                if (x.equals("par")) {
                    System.out.print("198.");
                } else {
                    System.out.print("199.");
                }
    }
}
