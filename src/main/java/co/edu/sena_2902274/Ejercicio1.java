package co.edu.sena_2902274;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        // entradas

        System.out.println("1. Calcular el área de un triángulo ");
        System.out.println("Ingrese la base del triángulo");

        Scanner src = new Scanner (System.in);
        double base = src.nextDouble(); 

        System.out.println("Ingrese la altura del triángulo ");

        double heigth = src.nextDouble();  

        // proceso

        double result = (base * heigth)/ 2;

        //salida

        System.out.println("El área del triángulo es: " +result);

    }
}
