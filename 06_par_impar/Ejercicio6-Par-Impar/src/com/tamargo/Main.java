package com.tamargo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        //Buffered Reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Texto en pantalla: pedida de número
        System.out.print("Escribe un número: ");

        //Usuario introduce valor
        String valor = br.readLine();

        //Conversión String a int (a)
        int a = Integer.parseInt(valor);

        //Alternativa if (a), si es true se realiza el pri mer bloque tras el if,
        //si es false se realiza el bloque "else"
        //En ambos casos el final es un texto en pantalla
        if ( a%2 == 0 ){
            System.out.println("Es par.");

        } else {
            System.out.println("Es impar.");

        }
    }
}
