/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario esther mariluz valencia carpio
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector a = new Vector(2, 3, 4);
        Vector b = new Vector(1, -1, 2);
        double r = 2.5;

        // a) Suma de vectores
        System.out.println("a) Suma: a + b = " + a.sumar(b));

        // b) Multiplicacion por escalar
        System.out.println("b) r * a = " + a.escalar(r));

        // c) Longitud del vector a
        System.out.println("c) |a| = " + a.magnitud());

        // d) Vector normalizado
        System.out.println("d) a normalizado = " + a.normalizar());

        // e) Producto escalar
        System.out.println("e) a * b = " + a.productoEscalar(b));

        // f) Producto vectorial
        System.out.println("f) a * b = " + a.productoVectorial(b));

        // g) Proyeccion de a sobre b
        System.out.println("g) Proyeccion de a sobre b = " + a.proyeccionSobre(b));
    }
}


