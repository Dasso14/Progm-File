public class Verificador {
    // Método para verificar si los rectángulos están sobrepuestos
    public static boolean esSobrePos(Rectangulo rectA, Rectangulo rectB) {
        // Se verifica primero la sobreposición en el eje x, posteriormente en el eje y
        boolean xOverlap = rectA.getEsquina1().getX() < rectB.getEsquina2().getX()
                && rectA.getEsquina2().getX() > rectB.getEsquina1().getX();
        boolean yOverlap = rectA.getEsquina1().getY() < rectB.getEsquina2().getY()
                && rectA.getEsquina2().getY() > rectB.getEsquina1().getY();
        // Se devuelve true si hay superposición en ambos ejes, de lo contrario false
        return xOverlap && yOverlap;
    }

    public static boolean esJunto(Rectangulo rectA, Rectangulo rectB) {
        boolean xDisjoint = rectA.getEsquina1().getX() == rectB.getEsquina2().getX()
                || rectA.getEsquina2().getX() <= rectB.getEsquina1().getX();
        boolean yDisjoint = rectA.getEsquina1().getY() == rectB.getEsquina2().getY()
                || rectA.getEsquina2().getY() <= rectB.getEsquina1().getY();
        return xDisjoint || yDisjoint;
    }

    public static boolean esDisjunto(Rectangulo rectA, Rectangulo rectB) {
        boolean xDisjoint = rectA.getEsquina1().getX() > rectB.getEsquina2().getX()
                || rectA.getEsquina2().getX() < rectB.getEsquina1().getX();
        boolean yDisjoint = rectA.getEsquina1().getY() > rectB.getEsquina2().getY()
                || rectA.getEsquina2().getY() < rectB.getEsquina1().getY();
        return xDisjoint || yDisjoint;
    }
}