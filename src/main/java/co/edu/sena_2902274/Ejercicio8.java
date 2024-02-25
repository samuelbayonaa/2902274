package co.edu.sena_2902274;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        
        //entrada

        System.out.println("Promedio de los 3 número ");

        Scanner scr = new Scanner(System.in);

        System.out.println("Ingrese el 1 número: ");
        double num31 = scr.nextDouble();

        System.out.println("Ingrese el 2 número: ");
        double num32 = scr.nextDouble();

        System.out.println("Ingrese el 3 número: ");
        double num33 = scr.nextDouble();

        //proceso 

        double promedionum = ((num31+num32+num33)/3);

        //resultado

        System.out.println("El resultado del promedio es: " + promedionum);

    }
    
}
