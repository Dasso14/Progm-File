class Cuadrado extends FiguraBidimensional {
    private double lado;

    public Cuadrado(String nombre, double lado) {
        super(nombre);
        this.lado = lado;
    }

    @Override
    public double obtenerArea() {
        return lado * lado;
    }

    @Override
    public double obtenerVolumen() {
        throw new UnsupportedOperationException("Unimplemented method 'obtenerVolumen'");
    }
}
