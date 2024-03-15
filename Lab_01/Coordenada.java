
public class Coordenada {
    private double x;
    private double y;

    // Constructor sin argumentos, con doubles x/y Y objeto Coordenada
    public Coordenada() {

        this.x = 0.0;
        this.y = 0.0;
    }

    // Constructor
    public Coordenada(double x, double y) {

        this.x = x;
        this.y = y;
    }

    // Constructor
    public Coordenada(Coordenada c) {

        this.x = c.getX();
        this.y = c.getY();
    }

    // métodos setter
    void setX(double x) {

        this.x = x;
    }

    void setY(double y) {

        this.y = y;
    }

    // métodos getter
    double getX() {

        return this.x;
    }

    double getY() {

        return this.y;
    }

    // método de instancia que calcula la distancia euclideana
    double distancia(Coordenada c) {
        // Hallando la distancia con el teorema de pitagoras
        double dx = this.x - c.getX();
        double dy = this.y - c.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // método de clase que calcula la distancia euclideana
    static double distancia(Coordenada c1, Coordenada c2) {
        // Hallando la distancia con el teorema de pitagoras
        double dx = c1.getX() - c2.getX();
        double dy = c1.getY() - c2.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // método que devuelve los valores de una coordenada en determinado formato
    public String toString() {
        return "([" + x + "," + y + "])";
    }
}