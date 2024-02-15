/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2_rembertojoseviscarraortiz;

/**
 *
 * @author hp
 */
import java.util.Scanner;

public class Ejercicio2_RembertoJoseViscarraOrtiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingresa un número: ");
            numero = scanner.nextInt();

            if (esPar(numero)) {
                System.out.println("El número " + numero + " es par.");
            } else {
                System.out.println("El número " + numero + " es impar.");
            }
        } while (numero > 50);

        System.out.println("Fin del programa.");
        scanner.close();
    }

   
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}

