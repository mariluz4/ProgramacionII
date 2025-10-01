/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario esther mariluz valencia carpio
 */
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empleado[] empleados = new Empleado[5];

        System.out.println("Ingrese datos para 3 empleados a tiempo completo:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Nombre del empleado " + (i + 1) + ": ");
            String nombre = scanner.nextLine();
            System.out.print("Salario anual: ");
            double salarioAnual = Double.parseDouble(scanner.nextLine());

            empleados[i] = new EmpleadoTiempoCompleto(nombre, salarioAnual);
        }

        System.out.println("\nIngrese datos para 2 empleados a tiempo horario:");
        for (int i = 3; i < 5; i++) {
            System.out.print("Nombre del empleado " + (i + 1) + ": ");
            String nombre = scanner.nextLine();
            System.out.print("Horas trabajadas: ");
            double horas = Double.parseDouble(scanner.nextLine());
            System.out.print("Tarifa por hora: ");
            double tarifa = Double.parseDouble(scanner.nextLine());

            empleados[i] = new EmpleadoTiempoHorario(nombre, horas, tarifa);
        }

        System.out.println("\n Informacion de empleados ");
        for (Empleado emp : empleados) {
            System.out.println(emp.toString());
            System.out.println("Salario mensual: $" + emp.CalcularSalarioMensual());
            System.out.println("S");
        }

        scanner.close();
    }
}
