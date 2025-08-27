/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;
import java.util.Scanner;
/**
 *
 * @author Pc
 */
public class Cuadratica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        Ecuacion_Cuadratica ecuacion = new Ecuacion_Cuadratica(a, b, c);
        double discriminante = ecuacion.getDiscriminante();
        
        if (discriminante > 0) {
            double raiz1 = ecuacion.getRaiz1();
            double raiz2 = ecuacion.getRaiz2();
            System.out.printf("La ecuacion tiene dos raices %.6f y %.6f%n", raiz1, raiz2);
        } else if (discriminante == 0) {
            double raiz = ecuacion.getRaiz1(); // Ambas raíces son iguales
            System.out.printf("La ecuacion tiene una raiz %.6f%n", raiz);
        } else {
            System.out.println("La ecuacion no tiene raices reales");
        }
        
        input.close();
    }
}
