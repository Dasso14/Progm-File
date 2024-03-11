public class Verificador {
    // Método para verificar si dos rectángulos están superpuestos
    public static boolean estanSuperpuestos(Rectangulo r1, Rectangulo r2) {
        // Verificar si las coordenadas de las esquinas se superponen
        if (r1.getEsquina1().getX() < r2.getEsquina2().getX() &&
                r1.getEsquina2().getX() > r2.getEsquina1().getX() &&
                r1.getEsquina1().getY() < r2.getEsquina2().getY() &&
                r1.getEsquina2().getY() > r2.getEsquina1().getY()) {
            return true;
        }
        return false;
    }

    // Método para verificar si dos rectángulos están juntos
    public static boolean estanJuntos(Rectangulo r1, Rectangulo r2) {
        // Verificar si las coordenadas de las esquinas están adyacentes
        if ((r1.getEsquina1().getX() == r2.getEsquina2().getX() ||
                r1.getEsquina2().getX() == r2.getEsquina1().getX()) &&
                (r1.getEsquina1().getY() == r2.getEsquina2().getY() ||
                        r1.getEsquina2().getY() == r2.getEsquina1().getY())) {
            return true;
        }
        return false;
    }

    // Método para verificar si dos rectángulos están disjuntos
    public static boolean estanDisjuntos(Rectangulo r1, Rectangulo r2) {
        // Verificar si las coordenadas de las esquinas no se superponen ni están
        // adyacentes
        if (r1.getEsquina1().getX() > r2.getEsquina2().getX() ||
                r1.getEsquina2().getX() < r2.getEsquina1().getX() ||
                r1.getEsquina1().getY() > r2.getEsquina2().getY() ||
                r1.getEsquina2().getY() < r2.getEsquina1().getY()) {
            return true;
        }
        return false;
    }
}
