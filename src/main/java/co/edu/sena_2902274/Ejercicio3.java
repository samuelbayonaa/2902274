package co.edu.sena_2902274;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        //entradas 

        System.out.println(" Número elevado al cuadrado ");

        System.out.println("Ingrese un número: ");

        Scanner src = new Scanner(System.in);

        double num2 = src.nextDouble();

        //proceso

        double resultnum2 = (num2*num2*num2);

        //resultado

        System.out.println("El número elevado al cuadrado es: " +resultnum2);
    
     }
}
