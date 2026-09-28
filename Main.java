package Ejercicio21_dispositivosAlmacenamiento;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DispositivoAlmacenamiento> dispositivos = new ArrayList<>();
        dispositivos.add(new DiscoDuro(100, 7200));
        dispositivos.add(new UnidadSSD(100, 550));
        dispositivos.add(new MemoriaUSB(20, true));

        for (DispositivoAlmacenamiento d : dispositivos) {
            try {
                d.escribirDatos("Informe trimestral 2026");
                System.out.println("  Leído: \"" + d.leerDatos() + "\"");
                d.escribirDatos("Copia de seguridad extra");
            } catch (IllegalStateException e) {
                System.out.println("  ERROR: " + e.getMessage());
            }
        }
    }
}
