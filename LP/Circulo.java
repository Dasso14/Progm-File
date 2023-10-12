class Circulo extends FiguraBidimensional {
    private double radio;
    private String color="rojo";

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }

    public String obtenerColor() {
        return color;
    }

    @Override
    public double obtenerVolumen() {
        throw new UnsupportedOperationException("Unimplemented method 'obtenerVolumen'");
    }
}

