package com.tamargo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    // precio, pago y cambio (double) y vueltas (int) || e = 1€, c = 50cent, v= 20cent, d= 10cent, o= 5cent

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String x;
        double precio;
        String y;
        double pago;
        int cambio;
        int i = 0;

        do {
            if ( i >= 1 ) {
                System.out.println("Error. Cantidad insuficiente o no múltiplo de 5.");
                System.out.println("Vuelve a escribirla.");
            }
            System.out.print("Introduce el precio del producto: ");
            x = br.readLine();
            precio = Double.parseDouble(x);
            precio = precio *100;
            System.out.print("Introduce la cantidad pagada: ");
            y = br.readLine();
            pago = Double.parseDouble(y);
            pago = pago *100;

            int pr = (int) precio;
            int pa = (int) pago;
            cambio = pa - pr;

            i = i+1;

        } while (cambio % 5 != 0 || cambio < 0);

        if (cambio != 0) {

            int vueltas = cambio;

            // e = 1€, c = 50cent, v= 20cent, d= 10cent, o= 5cent

            int e = vueltas / 100;
            vueltas = vueltas % 100;

            int c = vueltas / 50;
            vueltas = vueltas % 50;

            int v = vueltas / 20;
            vueltas = vueltas % 20;

            int d = vueltas / 10;
            vueltas = vueltas % 10;

            int o = vueltas / 5;


            System.out.println("El mínimo número de monedas para devolver "+cambio+" céntimos son: ");
            System.out.println("Monedas de 1€: " + e);
            System.out.println("Monedas de 50 céntimos: " + c);
            System.out.println("Monedas de 20 céntimos: " + v);
            System.out.println("Monedas de 10 céntimos: " + d);
            System.out.println("Monedas de 5 céntimos: " + o);

        } else {
            System.out.println("Importe exacto.");

        }
    }
}
