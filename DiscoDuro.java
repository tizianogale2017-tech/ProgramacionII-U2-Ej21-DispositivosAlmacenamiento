package Ejercicio21_dispositivosAlmacenamiento;

public class DiscoDuro implements DispositivoAlmacenamiento {
    private int capacidadMaxima;
    private int velocidadRPM;
    private StringBuilder contenido = new StringBuilder();

    public DiscoDuro(int capacidadMaxima, int velocidadRPM) {
        this.capacidadMaxima = capacidadMaxima;
        this.velocidadRPM = velocidadRPM;
    }

    @Override
    public void escribirDatos(String datos) {
        if (contenido.length() + datos.length() > capacidadMaxima) {
            throw new IllegalStateException("Disco duro lleno: no hay espacio para " + datos.length() + " caracteres.");
        }
        contenido.append(datos);
        System.out.println("[Disco duro " + velocidadRPM + " RPM] Escritura mecánica de " + datos.length() + " caracteres.");
    }

    @Override
    public String leerDatos() {
        System.out.println("[Disco duro " + velocidadRPM + " RPM] Moviendo el cabezal y leyendo...");
        return contenido.toString();
    }
}
