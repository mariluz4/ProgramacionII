/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class Prueba {
    public static void main(String[] args) {
        MiTeleferico mt = new MiTeleferico();

        mt.agregarLinea(new Linea("Amarillo"));
        mt.agregarLinea(new Linea("Rojo"));
        mt.agregarLinea(new Linea("Verde"));

        mt.agregarCabina("Amarillo", 1);
        mt.agregarCabina("Amarillo", 2);
        mt.agregarCabina("Rojo", 1);
        mt.agregarCabina("Verde", 1);

        mt.agregarPersonaFila(new Persona("Ana", 20, 60f), "Amarillo"); 
        mt.agregarPersonaFila(new Persona("Luis", 30, 80f), "Amarillo");
        mt.agregarPersonaFila(new Persona("Maria", 65, 55f), "Rojo"); 
        mt.agregarPersonaFila(new Persona("Pedro", 40, 90f), "Verde"); 
        mt.subirPrimeraPersonaACabina("Amarillo", 1); 
        mt.subirPrimeraPersonaACabina("Amarillo", 1); 
        mt.subirPrimeraPersonaACabina("Rojo", 1);    
        mt.subirPrimeraPersonaACabina("Verde", 1);   
        mt.verificarReglasCabinas();
        mt.calcularIngresoTotal();
        mt.lineaConMasIngresoSoloRegular();
    }
}
