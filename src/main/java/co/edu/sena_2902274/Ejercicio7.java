package co.edu.sena_2902274;

import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        //entradas

        System.out.println("Longitud y Área de una circunferencia");

        Scanner scr = new Scanner(System.in);

        System.out.println("Ingrese el radio de la circunferencia ");
        double radio = scr.nextDouble();

        //proceso

        double LongitudC = ( 2 * Math.PI * radio);
        double AreaC = ( Math.PI * Math.pow(radio, 2));

        //resultado

        System.out.println("La longitud del circulo inscrito es: " +  LongitudC );
        System.out.println("El Área del circulo inscrito es: " +  AreaC);


    }

}
