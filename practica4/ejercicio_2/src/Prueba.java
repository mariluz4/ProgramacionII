/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario esther mariluz valencia carpio
 */
import java.util.Random;

public class Prueba {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[5];
        Random rand = new Random();

        for (int i = 0; i < figuras.length; i++) {
            int tipo = rand.nextInt(2) + 1; 
            String color = (i % 2 == 0) ? "Rojo" : "Azul";

            if (tipo == 1) {
                double lado = rand.nextDouble() * 10 + 1; 
                figuras[i] = new Cuadrado(lado, color);
            } else {
                double radio = rand.nextDouble() * 10 + 1; 
                figuras[i] = new Circulo(radio, color);
            }
        }

        System.out.println("Informacion de Figuras ");
        for (Figura f : figuras) {
            System.out.println(f.toString());
            System.out.printf("Area: %.2f\n", f.area());
            System.out.printf("Perimetro: %.2f\n", f.perimetro());
            if (f instanceof Coloreado) {
                Coloreado c = (Coloreado) f;
                System.out.println("Como colorear: " + c.comoColorear());
            }
            System.out.println("");
        }
    }
}
