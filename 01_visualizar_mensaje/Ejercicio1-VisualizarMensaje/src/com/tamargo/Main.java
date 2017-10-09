package com.tamargo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        //Buffered Reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Texto en pantalla: pedida texto
        System.out.print("Escribe el mensaje que quieras mostrar en pantalla: ");

        //Usuario introduce texto
        String texto = br.readLine();

        //Texto en pantalla: mensaje final + texto
        System.out.println("El mensaje es: "+texto);
    }
}
