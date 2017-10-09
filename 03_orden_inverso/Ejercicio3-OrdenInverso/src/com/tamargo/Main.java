package com.tamargo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        //Buffered Reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Texto en pantalla: introducción + pedida vlaor 1
        System.out.println("Introduce 3 valores.");
        System.out.print("Primer valor: ");

        //Usuario introduce valor 1
        String a = br.readLine();

        //Texto en pantalla: pedida valor 2
        System.out.print("Segundo valor: ");

        //Usuario introduce valor 2
        String b = br.readLine();

        //Texto en pantalla: pedida valor 3
        System.out.print("Tercer valor: ");

        //Usuario introduce valor 3
        String c = br.readLine();

        //Texto en pantalla: mensaje final con el orden inverso
        System.out.println("El orden inverso de los valores que has introducido es: "+c+", "+b+" y "+a);



    }
}
