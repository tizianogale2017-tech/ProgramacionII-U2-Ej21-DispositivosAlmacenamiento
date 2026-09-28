package Ejercicio21_dispositivosAlmacenamiento;

public class UnidadSSD implements DispositivoAlmacenamiento {
    private int capacidadMaxima;
    private int velocidadMBs;
    private StringBuilder contenido = new StringBuilder();

    public UnidadSSD(int capacidadMaxima, int velocidadMBs) {
        this.capacidadMaxima = capacidadMaxima;
        this.velocidadMBs = velocidadMBs;
    }

    @Override
    public void escribirDatos(String datos) {
        if (contenido.length() + datos.length() > capacidadMaxima) {
            throw new IllegalStateException("SSD lleno: no hay espacio para " + datos.length() + " caracteres.");
        }
        contenido.append(datos);
        System.out.println("[SSD " + velocidadMBs + " MB/s] Escritura en celdas flash de " + datos.length() + " caracteres.");
    }

    @Override
    public String leerDatos() {
        System.out.println("[SSD " + velocidadMBs + " MB/s] Lectura instantánea.");
        return contenido.toString();
    }
}
