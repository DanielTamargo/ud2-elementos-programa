package com.tamargo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        //Buffered Reader (br)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Texto en pantalla: explicación + pedida valor 1
        System.out.println("Introduce los dos valores que quieras multiplicar.");
        System.out.print("Primer valor: ");

        //Usuario introduce valor 1
        String valor1 = br.readLine();

        //Valor 1 convertido de String a int (a)
        int a = Integer.parseInt(valor1);

        //Texto en pantalla: pedida valor 2
        System.out.print("Segundo valor: ");

        //Usuario introduce valor 2
        String valor2 = br.readLine();

        //Valor 2 convertido de String a int (b)
        int b = Integer.parseInt(valor2);

        //Operación valor 1 (a) * valor 2 (b)
        int c = a * b;

        //Texto en pantalla: muestra resultado final
        System.out.print("El resultado de multiplicar "+a+" por "+b+" es: "+c);

        //Fin

    }
}
