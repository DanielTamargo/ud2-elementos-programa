package com.tamargo;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Escribe una temperatura en grados centígrados (ºC).");
        System.out.print("Temperatura: ");

        String temperatura = br.readLine();

        double t = Double.parseDouble(temperatura);

        System.out.println("Ahora elige si quieres convertirlo en grados Fahrenheit o Kelvin. Para ello debes escribir la inicial.");
        System.out.print("Elección (F/K): ");

        char e = br.readLine().charAt(0);

        switch (e) {
            case 'F':
            case 'f':
                t = t * 1.8 + 32;
                System.out.println(+t+" grados Fahrenheit.");
                break;
            case 'K':
            case 'k':
                t = t + 273.15;
                System.out.println(+t+" grados Kelvin.");
                break;
            default:
                System.out.println("Error.");
        }
    }
}
