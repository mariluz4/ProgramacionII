/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author Pc
 */
public class Ecuacion_Cuadratica {
    private double a;
    private double b;
    private double c;
    
    // Constructor
    public  Ecuacion_Cuadratica (double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    // Método para obtener el discriminante
    public double getDiscriminante() {
        return b * b - 4 * a * c;
    }
    
    // Método para obtener la primera raíz
    public double getRaiz1() {
        double discriminante = getDiscriminante();
        if (discriminante >= 0) {
            return (-b + Math.sqrt(discriminante)) / (2 * a);
        } else {
            return 0;
        }
    }
    
    // Método para obtener la segunda raíz
    public double getRaiz2() {
        double discriminante = getDiscriminante();
        if (discriminante >= 0) {
            return (-b - Math.sqrt(discriminante)) / (2 * a);
        } else {
            return 0;
        }
    }
}
