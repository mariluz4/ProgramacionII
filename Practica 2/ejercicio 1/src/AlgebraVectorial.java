/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario esther mariluz valencia carpio
 */

public class AlgebraVectorial {
    private double x, y, z;

    // Constructores sobrecargados
    public AlgebraVectorial(double x, double y) {
        this.x = x;
        this.y = y;
        this.z = 0;
    }

    public AlgebraVectorial(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Metodo para obtener la magnitud del vector
    public double norma() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    // Suma de vectores
    public AlgebraVectorial suma(AlgebraVectorial v) {
        return new AlgebraVectorial(this.x + v.x, this.y + v.y, this.z + v.z);
    }

    // Resta de vectores
    public AlgebraVectorial resta(AlgebraVectorial v) {
        return new AlgebraVectorial(this.x - v.x, this.y - v.y, this.z - v.z);
    }

    // Producto punto (dot product)
    public double productoPunto(AlgebraVectorial v) {
        return this.x * v.x + this.y * v.y + this.z * v.z;
    }

    // Producto cruz (cross product)
    public AlgebraVectorial productoCruz(AlgebraVectorial v) {
        double cx = this.y * v.z - this.z * v.y;
        double cy = this.z * v.x - this.x * v.z;
        double cz = this.x * v.y - this.y * v.x;
        return new AlgebraVectorial(cx, cy, cz);
    }

    // Metodo (a): |a + b| == |a - b|
    public boolean esPerpendicularPorSumaResta(AlgebraVectorial v) {
        return Math.abs(this.suma(v).norma() - this.resta(v).norma()) < 1e-6;
    }

    // Metodo (b): |a - b| == |b - a|
    public boolean esPerpendicularMutua(AlgebraVectorial v) {
        return Math.abs(this.resta(v).norma() - v.resta(this).norma()) < 1e-6;
    }

    // Metodo (c): a * b == 0
    public boolean esPerpendicularProductoPunto(AlgebraVectorial v) {
        return Math.abs(this.productoPunto(v)) < 1e-6;
    }

    // Metodo (d): |a + b|^2 == |a|^2 + |b|^2
    public boolean esPerpendicularPit(AlgebraVectorial v) {
        double sumaCuadrado = Math.pow(this.suma(v).norma(), 2);
        double normaCuadrado = Math.pow(this.norma(), 2) + Math.pow(v.norma(), 2);
        return Math.abs(sumaCuadrado - normaCuadrado) < 1e-6;
    }

    // Metodo (e): a = r * b
    public boolean esParalelaPorEscalar(AlgebraVectorial v) {
        if (v.x == 0 && v.y == 0 && v.z == 0) return false;

        double r1 = (v.x != 0) ? this.x / v.x : 0;
        double r2 = (v.y != 0) ? this.y / v.y : 0;
        double r3 = (v.z != 0) ? this.z / v.z : 0;

        boolean checkX = (v.x == 0 && this.x == 0) || (v.x != 0 && Math.abs(this.x - r1 * v.x) < 1e-6);
        boolean checkY = (v.y == 0 && this.y == 0) || (v.y != 0 && Math.abs(this.y - r1 * v.y) < 1e-6);
        boolean checkZ = (v.z == 0 && this.z == 0) || (v.z != 0 && Math.abs(this.z - r1 * v.z) < 1e-6);

        return checkX && checkY && checkZ;
    }

    // Metodo (f): a * b = 0
    public boolean esParalelaPorCruz(AlgebraVectorial v) {
        return this.productoCruz(v).norma() < 1e-6;
    }

    // Metodo (g): Proyección de a sobre b = (a * b / |b|²) * b
    public AlgebraVectorial proyeccionSobre(AlgebraVectorial b) {
        double normaB2 = Math.pow(b.norma(), 2);
        if (normaB2 == 0) return new AlgebraVectorial(0, 0, 0);
        double escala = this.productoPunto(b) / normaB2;
        return new AlgebraVectorial(escala * b.x, escala * b.y, escala * b.z);
    }

    // Metodo (h): Componente de a en b = (a * b) / |b|
    public double componenteEn(AlgebraVectorial b) {
        double normaB = b.norma();
        if (normaB == 0) return 0;
        return this.productoPunto(b) / normaB;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}

