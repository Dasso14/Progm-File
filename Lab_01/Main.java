import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Se pide al usuario los datos del primer rectangulo tanto x como y
            System.out.println("Ingrese una esquina del 1er rectángulo: ");
            System.out.println("Ingrese x: ");
            double tempx = sc.nextDouble();
            System.out.println("Ingrese y: ");
            double tempy = sc.nextDouble();

            // se crea una coordenada con las x, y ingresadas
            Coordenada c1 = new Coordenada(tempx, tempy);

            // Se solicita al usuario los datos del segundo rectangulo tanto x como y
            System.out.println("Ingrese la esquina opuesta: ");
            System.out.println("Ingrese x: ");
            tempx = sc.nextDouble();
            System.out.println("Ingrese y: ");
            tempy = sc.nextDouble();
            // se crea una nueva coordenada con los datos ingresados
            Coordenada c2 = new Coordenada(tempx, tempy);

            // se crea un nuevo rectangulo con las coordenas correspondientes
            Rectangulo rect1 = new Rectangulo(c1, c2);

            // se solicita los datos del rectangulo de las x como de las y
            System.out.println("Ingrese una esquina del 2do rectángulo: ");
            System.out.println("Ingrese x: ");
            tempx = sc.nextDouble();
            System.out.println("Ingrese y: ");
            tempy = sc.nextDouble();
            // se crea una coordenada con los datos ingresados
            Coordenada c3 = new Coordenada(tempx, tempy);

            // se solicita los datos del rectangulo
            System.out.println("Ingrese la esquina opuesta: ");
            System.out.println("Ingrese x: ");
            tempx = sc.nextDouble();
            System.out.println("Ingrese y: ");
            tempy = sc.nextDouble();
            // se crea una coordenada con los datos de las x como de las y
            Coordenada c4 = new Coordenada(tempx, tempy);
            // se crea el segundo rectangulo con sus coordenadas correspondientes
            Rectangulo rect2 = new Rectangulo(c3, c4);

            mostrarInformacionRectangulo(rect1, "A");
            mostrarInformacionRectangulo(rect2, "B");

            mostrarCasoRectangulos(rect1, rect2);
        }
    }

    // Método para mostrar la información de un rectángulo
    public static void mostrarInformacionRectangulo(Rectangulo rectangulo, String etiqueta) {
        System.out.println("Rectángulo " + etiqueta + " = " + rectangulo.toString());
        // toma un objeto Rectangulo y una etiqueta como parámetros y muestra la
        // información del rectángulo
        // utilizando su método toString()
    }

    // Método para mostrar el caso en que se encuentran los dos rectángulos
    // toma dos objetos Rectangulo como parámetros y determina la relación entre
    // ellos
    // utilizando métodos de la clase Verificador.
    public static void mostrarCasoRectangulos(Rectangulo rect1, Rectangulo rect2) {
        if (Verificador.esSobrePos(rect1, rect2)) {
            System.out.println("Rectángulos A y B se sobreponen.");
            Rectangulo areaSobreposicion = rectanguloSobre(rect1, rect2);
            double area = areaSobreposicion.calculoArea();
            System.out.println("El área de sobreposición es: " + area);
        } else if (Verificador.esJunto(rect1, rect2)) {
            System.out.println("Rectángulos A y B se juntan.");
        } else if (Verificador.esDisjunto(rect1, rect2)) {
            System.out.println("Rectángulos A y B son disjuntos.");
        }
        // si los rectángulos se sobreponen, calcula el área de sobreposición utilizando
        // el método rectanguloSobre y muestra esta información.
    }

    // Método para obtener el rectángulo que representa el área de sobreposición
    public static Rectangulo rectanguloSobre(Rectangulo rect1, Rectangulo rect2) {
        // toma dos objetos Rectangulo como parámetros y calcula el rectángulo que
        // representa
        // el área de sobreposición entre ellos.
        double minX = Math.max(rect1.getEsquina1().getX(), rect2.getEsquina1().getX());
        double minY = Math.max(rect1.getEsquina1().getY(), rect2.getEsquina1().getY());
        double maxX = Math.min(rect1.getEsquina2().getX(), rect2.getEsquina2().getX());
        double maxY = Math.min(rect1.getEsquina2().getY(), rect2.getEsquina2().getY());

        // Utiliza las coordenadas de las esquinas de ambos rectángulos para calcular
        // las coordenadas de las esquinas del nuevo rectángulo, que es el área de
        // sobreposición.
        Coordenada esquina1 = new Coordenada(minX, minY);
        Coordenada esquina2 = new Coordenada(maxX, maxY);

        return new Rectangulo(esquina1, esquina2);
    }
}