package co.edu.sena_2902274;

import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        //entradas
        System.out.println("Ingrese datos Perímetro y Área");
        
        Scanner scr = new Scanner(System.in);

        System.out.println("Ingrese Lado 1: ");
        double l1 = scr.nextDouble();

        System.out.println("Ingrese Lado 2: ");
        double l2 = scr.nextDouble();

        System.out.println("Ingrese Lado 3: ");
        double l3 = scr.nextDouble();

        System.out.println("Ingrese Lado 4: ");
        double l4 = scr.nextDouble();

        //proceso
        double resultper = (l1 *4);
        double resultare = (l1 * l1);

        //resultado
        System.out.println("El valor del perímetro de este cuadrado es: " + resultper);
        System.out.println("El valor del área de este cuadrado es: " + resultare);
    }
}
