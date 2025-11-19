/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class Persona {
    public String nombre;
    public int edad;
    public float pesoPersona;
    public Persona(String nombre, int edad, float pesoPersona) {
        this.nombre = nombre;
        this.edad = edad;
        this.pesoPersona = pesoPersona;
    }
    @Override
    public String toString() {
        return nombre + " (edad=" + edad + ", peso=" + pesoPersona + ")";
    }
}