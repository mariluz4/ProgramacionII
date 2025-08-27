/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author Pc
 */
import java.util.Scanner;

public class Estadistica_Modular {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] datos = new double[10];
        
        System.out.println("Ingrese 10 números separados por espacios:");
        for (int i = 0; i < 10; i++) {
            datos[i] = input.nextDouble();
        }

        double promedio = calcularPromedio(datos);
        double desviacion = calcularDesviacion(datos, promedio);

        System.out.printf("El promedio es %.2f%n", promedio);
        System.out.printf("La desviación estandar es %.5f%n", desviacion);
        
        input.close();
    }
    
    public static double calcularPromedio(double[] numeros) {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }

    public static double calcularDesviacion(double[] numeros, double promedio) {
        double suma = 0;
        for (double num : numeros) {
            suma += Math.pow(num - promedio, 2);
        }
        return Math.sqrt(suma / (numeros.length - 1));
    }
}
