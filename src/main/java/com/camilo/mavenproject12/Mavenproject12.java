package com.camilo.mavenproject12;

import java.util.Scanner;

public class Mavenproject12 {

    public static void main(String[] args) {
        int numero;
        int i, numMayor;

        /* numero = Integer.parseInt(JOptionPane.showInputDialog("digite el numero"));

        if (numero > 0) {
            JOptionPane.showMessageDialog(null, "el numero es positivo");

        } else if (numero == 0) {
            JOptionPane.showMessageDialog(null, "el numero es neutro");
        } else {
            JOptionPane.showMessageDialog(null, "el numero es negativo");

        }
         */
        numMayor = 1;
        for (i = 1; i == 10; i++) {

            System.out.println("digite el numero " + i);
            Scanner scan = new Scanner(System.in);
            numero = scan.nextInt();
            if (numero > numMayor) {
                numMayor = numero;
            }
        }

    }
}
