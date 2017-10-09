package com.tamargo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        //Buffered Reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Texto en pantalla: introducción + pedida valor 1 (base)
        System.out.println("Vamos a calcular el área de un triángulo.");
        System.out.println("Para ello debes introducir el valor de la base y de la altura.");
        System.out.print("Introduce el valor de la base: ");

        //Usuario introduce valor 1 (base)
        String Base = br.readLine();

        //Conversión valor string a int (a)
        int a = Integer.parseInt(Base);

        //Texto en pantalla: pedida valor 2 (altura)
        System.out.print("Introduce el valor de la altura: ");

        //Usuario introduce valor 2 (altura)
        String Altura = br.readLine();

        //Conversión valor string a int (b)
        int b = Integer.parseInt(Altura);

        //Opreación calcular área (a*b/2)
        int c = a * b / 2;

        //Texto en pantalla: mensaje final mostrando resultado
        System.out.println("El área del triángulo es: "+c);

    }
}
