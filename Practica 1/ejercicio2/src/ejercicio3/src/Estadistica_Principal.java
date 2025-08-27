/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class Estadistica_Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] datos = new double[10];

        System.out.println("Ingrese 10 numeros separados por espacios:");
        for (int i = 0; i < 10; i++) {
            datos[i] = input.nextDouble();
        }

        Estadistica estadistica = new Estadistica(datos);
        
        System.out.printf("El promedio es %.2f%n", estadistica.getPromedio());
        System.out.printf("La desviacion estandar es %.5f%n", estadistica.getDesviacion());

        input.close();
    }
}

