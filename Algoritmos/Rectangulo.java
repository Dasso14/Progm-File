public class Rectangulo {
    // atributos
    private Coordenada esquina1;
    private Coordenada esquina2;

    // Constructor
    public Rectangulo(Coordenada c1, Coordenada c2) {
        setEsquina1(c1);
        setEsquina2(c2);
    }

    // metodos set y get
    public void setEsquina1(Coordenada coo) {
        this.esquina1 = coo; // establece la coordenada de la esquina 1
    }

    public void setEsquina2(Coordenada coo) {
        this.esquina2 = coo; // establece la coordenade de la esquina 2
    }

    public Coordenada getEsquina1() {
        return this.esquina1; // devuelve la coordena de a esquina 1
    }

    public Coordenada getEsquina2() {
        return this.esquina2; // devuelve de la coordenada de la esquina 2
    }

    // devuelve la presentacion de la cadena del rectangulo
    public String toString() {
        return "Esquina 1: " + this.esquina1.toString() + ", Esquina 2: " + this.esquina2.toString();
    }

    // Método para calcular el área del rectángulo
    public double calculoArea() {
        double base = Math.abs(esquina2.getX() - esquina1.getX());
        double altura = Math.abs(esquina2.getY() - esquina1.getY());
        return base * altura;
    }
}