/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1_rembertojoseviscarraortiz;

/**
 *
 * @author Remberto Jose Viscarra Ortiz
 */

import java.util.Scanner;

public class Ejercicio1_RembertoJoseViscarraOrtiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un año: ");
        int anio = scanner.nextInt();
        scanner.close();

        if (esBisiesto(anio)) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
    }

    // Función para determinar si un año es bisiesto
    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
}
