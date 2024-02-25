package co.edu.sena_2902274;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

            //entradas
            System.out.println("Ingrese datos Área y Volumen de un Cilindro");

            Scanner scr = new Scanner(System.in);

            System.out.println("Ingrese el radio de la base del cilindro: ");
            double radio = scr.nextDouble();

            System.out.println("Ingrese la altura del cilindro: ");
            double altura = scr.nextDouble();

            //proceso

            double areabase = (Math.PI * radio * radio);
            double arealateral = (2 * Math.PI * radio * altura);
            double areatotal = (2 * areabase + arealateral);
            double volumen = (Math.PI * radio * radio * altura);

            //resultado

            System.out.println("El área de la base del cilindro es: " + areabase);
            System.out.println("El área lateral del cilindro es: " + arealateral);
            System.out.println("El área total del cilindro es: " + areatotal);
            System.out.println("El volumen del cilindro es: " + volumen);
        }
}
