public class Verificador {
    public static void main(String[] args) {
        Coordenada c1A = new Coordenada(0, 0);
        Coordenada c2A = new Coordenada(3, 3);
        Rectangulo rectA = new Rectangulo(c1A, c2A);
        Coordenada c1B = new Coordenada(2, 2);
        Coordenada c2B = new Coordenada(5, 5);
        Rectangulo rectB = new Rectangulo(c1B, c2B);
        if (esSobrePos(rectA, rectB)) {
            System.out.println("Estan sobrepuestos");
        } else if (esJunto(rectA, rectB)) {
            System.out.println("Estan juntos");
        } else if (esDisjunto(rectA, rectB)) {
            System.out.println("Estan disjuntos");
        }
    }

    public static boolean esSobrePos(Rectangulo rectA, Rectangulo rectB) {
        boolean xOverlap = rectA.getEsquina1().getX() < rectB.getEsquina2().getX()
                && rectA.getEsquina2().getX() > rectB.getEsquina1().getX();
        boolean yOverlap = rectA.getEsquina1().getY() < rectB.getEsquina2().getY()
                && rectA.getEsquina2().getY() > rectB.getEsquina1().getY();
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