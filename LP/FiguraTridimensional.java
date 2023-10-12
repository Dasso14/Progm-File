abstract class FiguraTridimensional extends Figura {
    public FiguraTridimensional(String nombre) {
        super(nombre);
    }

    public abstract double obtenerVolumen();

    public abstract double obtenerArea();
}

