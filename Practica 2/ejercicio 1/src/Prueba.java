/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario esther mariluz valencia carpio
 */


public class Prueba {
    public static void main(String[] args) {
        // Puedes cambiar estos vectores para hacer más pruebas
        AlgebraVectorial a = new AlgebraVectorial(3, 0, 0);
        AlgebraVectorial b = new AlgebraVectorial(0, 4, 0);

        System.out.println("Vector A: " + a);
        System.out.println("Vector B: " + b);
        System.out.println("(a) A es ortogonal o perpendicular a B (|a + b| = |a - b|) " + a.esPerpendicularPorSumaResta(b));
        System.out.println("(b) A es mutuamente ortogonal B mutuamente (|a - b| = |b - a|) " + a.esPerpendicularMutua(b));
        System.out.println("(c) A es ortogonal a B (producto punto a * b = 0) " + a.esPerpendicularProductoPunto(b));
        System.out.println("(d) A es ortogonal a B (|a + b|^2 = |a|^2 + |b|^2) " + a.esPerpendicularPit(b));
        System.out.println("(e) A es paralela a B (a = r * b) " + a.esParalelaPorEscalar(b));
        System.out.println("(f) A es paralela a B (a * b = 0) " + a.esParalelaPorCruz(b));
        System.out.println("(g) Proyeccion de A sobre B: " + a.proyeccionSobre(b));
        System.out.println("(h) Componente de A en direccion de B: " + a.componenteEn(b));
    }
}


