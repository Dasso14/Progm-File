abstract class Figura {
    private String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public abstract double obtenerArea();

    public abstract double obtenerVolumen();
}


