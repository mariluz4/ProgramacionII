/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;
import java.util.Random;

public class JuegoAdivinaNumero extends Juego {
    protected int numeroAAdivinar;

    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    public boolean validaNumero(int numero) {
        return numero >= 0 && numero <= 10;
    }

    public void juega() {
        reiniciaPartida();
        Random rand = new Random();
        numeroAAdivinar = rand.nextInt(11);

        Scanner scanner = new Scanner(System.in);
        int intento;

        while (true) {
            System.out.print("Adivina un numero entre 0 y 10: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Entrada invalida. Debes ingresar un numero.");
                scanner.next();
                continue;
            }

            intento = scanner.nextInt();

            if (!validaNumero(intento)) {
                System.out.println("Numero invalido. Debe estar entre 0 y 10.");
                continue;
            }

            if (intento == numeroAAdivinar) {
                System.out.println("Acertaste");
                actualizaRecord();
                break;
            } else {
                boolean tieneVidas = quitaVida();

                if (!tieneVidas) {
                    System.out.println("El numero correcto era: " + numeroAAdivinar);
                    break;
                } else {
                    if (intento < numeroAAdivinar) {
                        System.out.println("El numero es mayor.");
                    } else {
                        System.out.println("El numero es menor.");
                    }
                }
            }
        }
    }
}

