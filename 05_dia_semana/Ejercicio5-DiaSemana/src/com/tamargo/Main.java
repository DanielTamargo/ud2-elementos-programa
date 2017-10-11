package com.tamargo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        //Buffered Reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Texto en pantalla: pedida valor
        System.out.print("Introduce un número entre el 1 y el 7 (ambos inclusive): ");

        //Usuario introduce valor
        String valor = br.readLine();

        //Conversión string a int (a)
        int a = Integer.parseInt(valor);

        //Alternativas switch (a), cada alternativa tendrá su Texto en pantalla al final
        switch (a) {

            case 1:
                System.out.println("Lunes.");
                break;
            case 2:
                System.out.println("Martes.");
                break;
            case 3:
                System.out.println("Miércoles.");
                break;
            case 4:
                System.out.println("Jueves.");
                break;
            case 5:
                System.out.println("Viernes.");
                break;
            case 6:
                System.out.println("Sábado.");
                break;
            case 7:
                System.out.println("Domingo.");
                break;
            default:
                System.out.println("Número no válido.");
                break;



        }
    }
}
