package com.tamargo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cifras;
        String letra;
        int valorletra = -1;

        System.out.print("Escribe los números de tu DNI: ");
        cifras = Integer.parseInt((br.readLine()));
        System.out.print("Escribe la letra de tu DNI (en mayúscula): ");
        letra = br.readLine();

        if (cifras >= 10000000) {

            switch (letra) {
                case "A":
                    valorletra = 3;
                    break;
                case "B":
                    valorletra = 11;
                    break;
                case "C":
                    valorletra = 20;
                    break;
                case "D":
                    valorletra = 9;
                    break;
                case "E":
                    valorletra = 22;
                    break;

                //5

                case "F":
                    valorletra = 7;
                    break;
                case "G":
                    valorletra = 4;
                    break;
                case "H":
                    valorletra = 18;
                    break;
                case "J":
                    valorletra = 13;
                    break;
                case "K":
                    valorletra = 21;
                    break;

                //10

                case "L":
                    valorletra = 19;
                    break;
                case "M":
                    valorletra = 5;
                    break;
                case "N":
                    valorletra = 12;
                    break;
                case "P":
                    valorletra = 8;
                    break;
                case "Q":
                    valorletra = 16;
                    break;

                //15

                case "R":
                    valorletra = 1;
                    break;
                case "S":
                    valorletra = 15;
                    break;
                case "T":
                    valorletra = 0;
                    break;
                case "V":
                    valorletra = 17;
                    break;
                case "W":
                    valorletra = 2;
                    break;

                //20
                case "X":
                    valorletra = 10;
                    break;
                case "Y":
                    valorletra = 6;
                    break;
                case "Z":
                    valorletra = 14;
                    break;
                default:
                    System.out.println("No has introducido una letra válida, el programa no funcionará.");
                    break;
            }

        } else {
            //extranjero, solo con 7 cifras
            switch (letra) {
                case "X":
                    valorletra = 0;
                    break;
                case "Y":
                    valorletra = 1;
                    break;
                case "Z":
                    valorletra = 2;
                    break;
                default:
                    System.out.println("No has introducido una letra válida, el programa no funcionará.");
                    break;
            }
        }

        if (cifras%23 == valorletra) {
            System.out.println("La letra es correcta.");
        } else {
            System.out.println("La letra es errónea o has introducido mal los datos.");
        }
        //el ejercicio se puede hacer muy brevemente con el CharAt
        //si se usa el CharAt se tiene que tener en cuenta el orden de los valores para las letras
    }
}