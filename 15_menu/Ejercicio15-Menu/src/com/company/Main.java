package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int resultado;

        System.out.println("Escribe dos valores:");
        System.out.print("Valor 1: ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("Valor 2: ");
        int b = Integer.parseInt(br.readLine());

        String eleccion;

        do {
            System.out.println("Elige una letra del menú de operaciones:");
            System.out.println("a) Suma.");
            System.out.println("b) Resta.");
            System.out.println("c) Multiplicación.");
            System.out.println("d) División.");
            System.out.println("e) Resto.");
            System.out.println("f) Terminar.");
            System.out.print("Elige una operación: ");
            eleccion = br.readLine();

            //para que no dependa de que el usuario utilice sí o sí minúsculas pondré la opción en mayúsculas también
            //introduzco System.out.println(" "); para que haya espacio y no se junten todas las líneas

            switch (eleccion) {
                case "a":
                case "A":
                    resultado = a + b;
                    System.out.println("La suma es: "+resultado);
                    System.out.println(" ");
                    break;
                case "b":
                case "B":
                    resultado = a - b;
                    System.out.println("La resta es: "+resultado);
                    System.out.println(" ");
                    break;
                case "c":
                case "C":
                    resultado = a * b;
                    System.out.println("La multiplicación es: "+resultado);
                    System.out.println(" ");
                    break;
                case "d":
                case "D":
                    resultado = a / b;
                    System.out.println("La división es: "+resultado);
                    System.out.println(" ");
                    break;
                case "e":
                case "E":
                    resultado = a % b;
                    System.out.println("El resto es: "+resultado);
                    System.out.println(" ");
                    break;
                case "f":
                case "F":
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Elección no válida.");
                    System.out.println(" ");
                    break;
            }
        } while (eleccion.equalsIgnoreCase("f") == false || eleccion.equalsIgnoreCase("F") == false);
    }
}



