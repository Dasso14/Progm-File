import java.util.*;

public class Coordenada {
    private double x;
    private double y;

    // Constructor, initialize x, y attributes to zero
    public Coordenada() {
        // fill in the code here
        this.x = 0.0;
        this.y = 0.0;
    }

    // Constructor
    public Coordenada(double x, double y) {
        // fill in the code here
        this.x = x;
        this.y = y;
    }

    // Constructor
    public Coordenada(Coordenada c) {
        // fill in the code here
        this.x = c.getX();
        this.y = c.getY();
    }

    // métodos setter
    void setX(double x) {
        // fill in the code here
        this.x = x;
    }

    void setY(double y) {
        // fill in the code here
        this.y = y;
    }

    // métodos getter
    double getX() {
        // fill in the code here
        return this.x;
    }

    double getY() {
        // fill in the code here
        return this.y;
    }

    // método de instancia que calcula la distancia euclideana
    double distancia(Coordenada c) {
        // fill in the code here
        double dx = this.x - c.getX();
        double dy = this.y - c.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // método de clase que calcula la distancia euclideana
    static double distancia(Coordenada c1, Coordenada c2) {
        // fill in the code here
        double dx = c1.getX() - c2.getX();
        double dy = c1.getY() - c2.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // método que devuelve los valores de una coordenada en determinado formato
    String toString() {
        // fill in the code here
    }
}