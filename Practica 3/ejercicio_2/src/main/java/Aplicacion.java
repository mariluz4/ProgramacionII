/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class Aplicacion {
    public static void main(String[] args) {
        JuegoAdivinaNumero juego1 = new JuegoAdivinaNumero(3);
        JuegoAdivinaPar juego2 = new JuegoAdivinaPar(3);
        JuegoAdivinaImpar juego3 = new JuegoAdivinaImpar(3);

        System.out.println(" Juego 1: Adivina cualquier numero ");
        juego1.juega();

        System.out.println("\n Juego 2: Adivina un numero PAR ");
        juego2.juega();

        System.out.println("\n Juego 3: Adivina un numero IMPAR ");
        juego3.juega();
    }
}

