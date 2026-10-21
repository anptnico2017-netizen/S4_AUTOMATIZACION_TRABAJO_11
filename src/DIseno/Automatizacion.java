package Automatizacion;

public class Todo {
    String nombre;
    String tipo;
    private static int contador = 0;

    public Automatizacion(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        contador++;
    }

    public Automatizacion() {
        contador++;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public static int getTotalCreados() {
        return contador;
    }
}
