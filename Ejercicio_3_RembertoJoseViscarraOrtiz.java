/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_3_rembertojoseviscarraortiz;

/**
 *
 * @author hp
 */
import java.util.Scanner;

public class ejercicio_3_RembertoJoseViscarraOrtiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double resultado;
        int opcion;

        do {
            System.out.println("Calculadora Básica");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    resultado = suma();
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    resultado = resta();
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    resultado = multiplicacion();
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    resultado = division();
                    System.out.println("Resultado: " + resultado);
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    public static double suma() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();
        return num1 + num2;
    }

    public static double resta() 
    {

    }

    public static double multiplicacion() {
       
    }

    public static double division() {

    }
}
