/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario esther mariluz valencia carpio
 */
public class Vector {
    private double x, y, z;

    // Constructor
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // a) Suma de dos vectores: c = a + b
    public Vector sumar(Vector v) {
        return new Vector(this.x + v.x, this.y + v.y, this.z + v.z);
    }

    // b) Multiplicación por un escalar: b = r * a
    public Vector escalar(double r) {
        return new Vector(this.x * r, this.y * r, this.z * r);
    }

    // c) Longitud del vector: |a|
    public double magnitud() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    // d) Vector normalizado: a / |a|
    public Vector normalizar() {
        double mag = magnitud();
        if (mag == 0) throw new ArithmeticException("Vector nulo no puede ser normalizado");
        return new Vector(x / mag, y / mag, z / mag);
    }

    // e) Producto escalar: a · b
    public double productoEscalar(Vector v) {
        return this.x * v.x + this.y * v.y + this.z * v.z;
    }

    // f) Producto vectorial: a × b
    public Vector productoVectorial(Vector v) {
        double cx = this.y * v.z - this.z * v.y;
        double cy = this.z * v.x - this.x * v.z;
        double cz = this.x * v.y - this.y * v.x;
        return new Vector(cx, cy, cz);
    }

    // g) Proyección ortogonal de a sobre b
    public Vector proyeccionSobre(Vector v) {
        double dotAB = this.productoEscalar(v);
        double magB2 = v.magnitud() * v.magnitud();
        double escala = dotAB / magB2;
        return v.escalar(escala);
    }

    // Método toString para imprimir vectores
    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}


