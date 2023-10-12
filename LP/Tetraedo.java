class Tetraedo extends FiguraTridimensional {
    private double arista;
    private String aplicacion= "FGYPTO";

    public Tetraedo(String nombre, double arista) {
        super(nombre);
        this.arista = arista;
    }

    @Override
    public double obtenerVolumen() {
        return (Math.sqrt(2) * arista * arista * arista) / 12;
    }

    public double obtenerArea() {
        return Math.sqrt(3) * arista * arista;
    }

    public String obtenerAplicacion() {
        return aplicacion;
    }
}
