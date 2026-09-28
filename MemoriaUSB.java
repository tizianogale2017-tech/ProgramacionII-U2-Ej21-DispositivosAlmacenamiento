package Ejercicio21_dispositivosAlmacenamiento;

public class MemoriaUSB implements DispositivoAlmacenamiento {
    private int capacidadMaxima;
    private boolean conectada;
    private StringBuilder contenido = new StringBuilder();

    public MemoriaUSB(int capacidadMaxima, boolean conectada) {
        this.capacidadMaxima = capacidadMaxima;
        this.conectada = conectada;
    }

    @Override
    public void escribirDatos(String datos) {
        if (!conectada) {
            throw new IllegalStateException("La memoria USB no está conectada.");
        }
        if (contenido.length() + datos.length() > capacidadMaxima) {
            throw new IllegalStateException("USB llena: no hay espacio para " + datos.length() + " caracteres.");
        }
        contenido.append(datos);
        System.out.println("[USB] Copiando " + datos.length() + " caracteres al pendrive.");
    }

    @Override
    public String leerDatos() {
        if (!conectada) {
            throw new IllegalStateException("La memoria USB no está conectada.");
        }
        System.out.println("[USB] Leyendo el pendrive...");
        return contenido.toString();
    }
}
