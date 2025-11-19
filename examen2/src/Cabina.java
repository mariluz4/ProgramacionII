/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class Cabina {
    public int nroCabina;
    public Persona[] personasAbordo;
    public Cabina(int nroCabina) {
        this.nroCabina = nroCabina;
        this.personasAbordo = new Persona[10];
    }
    public boolean agregarPersona(Persona p) {
        for (int i = 0; i < personasAbordo.length; i++) {
            if (personasAbordo[i] == null) {
                personasAbordo[i] = p;
                return true;
            }
        }
        return false; // cabina llena
    }
    public int cantidadPersonas() {
        int c = 0;
        for (Persona p : personasAbordo) if (p != null) c++;
        return c;
    }
    public float pesoTotal() {
        float s = 0f;
        for (Persona p : personasAbordo) if (p != null) s += p.pesoPersona;
        return s;
    }
    @Override
    public String toString() {
        return "Cabina#" + nroCabina + " [" + cantidadPersonas() + " pers, peso=" + pesoTotal() + "]";
    }
}
