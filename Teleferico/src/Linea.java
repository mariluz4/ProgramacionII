/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class Linea {
    public String color;
    public Persona[] filaPersonas; 
    public Cabina[] cabinas;       
    public int cantidadCabinas;    
    public Linea(String color) {
        this.color = color;
        this.filaPersonas = new Persona[200]; 
        this.cabinas = new Cabina[50];        
        this.cantidadCabinas = 0;
    }
    public boolean agregarPersona(Persona p) {
        for (int i = 0; i < filaPersonas.length; i++) {
            if (filaPersonas[i] == null) {
                filaPersonas[i] = p;
                return true;
            }
        }
        return false; 
    }
    public boolean agregarCabina(int nroCab) {
        if (cantidadCabinas >= cabinas.length) return false;
        Cabina c = new Cabina(nroCab);
        cabinas[cantidadCabinas++] = c;
        return true;
    }
    public Cabina buscarCabina(int nroCab) {
        for (int i = 0; i < cantidadCabinas; i++) {
            if (cabinas[i] != null && cabinas[i].nroCabina == nroCab) return cabinas[i];
        }
        return null;
    }
    public Persona sacarPrimeraPersonaDeFila() {
        for (int i = 0; i < filaPersonas.length; i++) {
            if (filaPersonas[i] != null) {
                Persona p = filaPersonas[i];
                // desplazar a la izquierda
                for (int j = i; j < filaPersonas.length - 1; j++) filaPersonas[j] = filaPersonas[j + 1];
                filaPersonas[filaPersonas.length - 1] = null;
                return p;
            }
        }
        return null;
    }
    public float ingresoTotalPorLine(double tarifaPreferencial, double tarifaRegular) {
        float suma = 0f;
        for (int i = 0; i < cantidadCabinas; i++) {
            Cabina c = cabinas[i];
            if (c == null) continue;
            for (Persona p : c.personasAbordo) {
                if (p == null) continue;
                if (esPreferencial(p)) suma += tarifaPreferencial;
                else suma += tarifaRegular;
            }
        }
        return suma;
    }
    public float ingresoSoloRegular(double tarifaRegular) {
        float suma = 0f;
        for (int i = 0; i < cantidadCabinas; i++) {
            Cabina c = cabinas[i];
            if (c == null) continue;
            for (Persona p : c.personasAbordo) {
                if (p == null) continue;
                if (!esPreferencial(p)) suma += tarifaRegular;
            }
        }
        return suma;
    }
    private boolean esPreferencial(Persona p) {
        return p.edad < 25 || p.edad > 60;
    }
    @Override
    public String toString() {
        return "Linea " + color + " (cabinas=" + cantidadCabinas + ")";
    }
}
