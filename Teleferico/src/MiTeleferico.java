/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class MiTeleferico {
    public Linea[] lineas;
    public float cantidadIngresos;

    public MiTeleferico() {
        this.lineas = new Linea[10];
        this.cantidadIngresos = 0f;
    }
    public boolean agregarLinea(Linea l) {
        for (int i = 0; i < lineas.length; i++) {
            if (lineas[i] == null) {
                lineas[i] = l;
                return true;
            }
        }
        return false;
    }
    public boolean agregarPersonaFila(Persona p, String colorLinea) {
        Linea l = buscarLinea(colorLinea);
        if (l == null) return false;
        return l.agregarPersona(p);
    }
    public boolean agregarCabina(String colorLinea, int nroCab) {
        Linea l = buscarLinea(colorLinea);
        if (l == null) return false;
        return l.agregarCabina(nroCab);
    }
    public Linea buscarLinea(String colorLinea) {
        for (Linea l : lineas) {
            if (l != null && l.color.equalsIgnoreCase(colorLinea)) return l;
        }
        return null;
    }
    public boolean subirPrimeraPersonaACabina(String colorLinea, int nroCab) {
        Linea l = buscarLinea(colorLinea);
        if (l == null) {
            System.out.println("Linea no encontrada: " + colorLinea);
            return false;
        }
        Persona p = l.sacarPrimeraPersonaDeFila();
        if (p == null) {
            System.out.println("Fila vacia en linea " + colorLinea);
            return false;
        }
        Cabina c = l.buscarCabina(nroCab);
        if (c == null) {
            System.out.println("Cabina no encontrada: " + nroCab);
            l.agregarPersona(p);
            return false;
        }
        if (c.cantidadPersonas() >= 10) {
            System.out.println("Cabina llena: " + nroCab);
            l.agregarPersona(p); 
            return false;
        }
        float pesoActual = c.pesoTotal();
        if (pesoActual + p.pesoPersona > 850f) {
            System.out.println("No se puede subir: sobrepasa peso máximo en cabina " + nroCab);
            l.agregarPersona(p); 
            return false;
        }
        boolean agregado = c.agregarPersona(p);
        if (agregado) {
            System.out.println("Persona " + p.nombre + " subida a cabina " + nroCab + " en linea " + colorLinea);
            return true;
        } else {
            l.agregarPersona(p);
            System.out.println("Error al agregar persona a la cabina (inconsistencia)");
            return false;
        }
    }
    public boolean verificarReglasCabinas() {
        boolean todoBien = true;
        for (Linea l : lineas) {
            if (l == null) continue;
            for (int i = 0; i < l.cantidadCabinas; i++) {
                Cabina c = l.cabinas[i];
                if (c == null) continue;
                if (c.cantidadPersonas() > 10) {
                    System.out.println("Infraccion: cabina " + c.nroCabina + " en linea " + l.color + " tiene mas de 10 personas");
                    todoBien = false;
                }
                if (c.pesoTotal() > 850f) {
                    System.out.println("Infraccion: cabina " + c.nroCabina + " en linea " + l.color + " supera 850kg");
                    todoBien = false;
                }
            }
        }
        if (todoBien) System.out.println("Todas las cabinas cumplen las reglas.");
        return todoBien;
    }
    public float calcularIngresoTotal() {
        double tarifaPreferencial = 1.5;
        double tarifaRegular = 3.0;
        float total = 0f;
        for (Linea l : lineas) {
            if (l == null) continue;
            total += l.ingresoTotalPorLine(tarifaPreferencial, tarifaRegular);
        }
        this.cantidadIngresos = total;
        System.out.println("Ingreso total (todas las lineas): " + total + " bs");
        return total;
    }
    public Linea lineaConMasIngresoSoloRegular() {
        double tarifaRegular = 3.0;
        Linea mejor = null;
        float max = -1f;
        for (Linea l : lineas) {
            if (l == null) continue;
            float ingreso = l.ingresoSoloRegular(tarifaRegular);
            if (ingreso > max) {
                max = ingreso;
                mejor = l;
            }
        }
        if (mejor != null) {
            System.out.println("Linea con mas ingreso (solo tarifa regular): " + mejor.color + " = " + max + " bs");
        } else {
            System.out.println("No hay lineas con ingreso regular.");
        }
        return mejor;
    }
}