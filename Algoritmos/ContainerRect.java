import java.text.DecimalFormat;

public class ContainerRect {
    // declaración de atributos
    private Rectangulo[] rectangulos;
    private double[] distancias;
    private double[] areas;
    private int n;
    private static int numRec;

    // Constructor
    public ContainerRect(int n) {
        this.n = n;
        rectangulos = new Rectangulo[n];
        distancias = new double[n];
        areas = new double[n];
        // incializa los atributos del contenedor
    }

    // Metodo que agrega rectangulos al contenedor
    public void addRectangulo(Rectangulo rectangulo) {
        if (numRec < n) {
            rectangulos[numRec] = rectangulo;
            distancias[numRec] = rectangulo.getEsquina1().distancia(rectangulo.getEsquina2());
            areas[numRec] = rectangulo.calculoArea();
            numRec++;
        } else {
            System.out.println("Capacidad máxima alcanzada.");
        }
        // Este método permite agregar un rectángulo al contenedor. Si aún no se ha
        // alcanzado la capacidad
        // máxima del contenedor, el rectángulo se agrega al arreglo rectangulos, y se
        // calculan y almacenan la
        // distancia y el área correspondientes.
    }

    // Se muestran los rectangulos guardados
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.###"); // Limitacion de decimales de los double
        StringBuilder sb = new StringBuilder(); // se crea un objeto para construir la cadena
        System.out.format("%5s%25s%25s%10s%n", "Rectangulo", "Coordenadas", "Distancia", "Area\n");
        // se utiliza el bucle for para iterar sobre los rectangulos, coordenadas,
        // distancias y areas
        // almacenados en el contenedor
        for (int i = 0; i < numRec; i++) {
            sb.append(String.format("%5d%35s%15s%15s%n", (i + 1) // N° de rectangulo
                    , rectangulos[i].getEsquina1().toString() + "," + rectangulos[i].getEsquina2().toString()// Coords
                    , df.format(distancias[i])// Distancia
                    , df.format(areas[i]) + "\n"));// Area
        }

        return sb.toString();
    }
}