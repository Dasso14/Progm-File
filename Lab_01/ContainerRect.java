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

    // Método para agregar un rectángulo al contenedor
    public void addRectangulo(Rectangulo rectangulo) {
        if (numRec < n) {
            rectangulos[numRec] = rectangulo;
            distancias[numRec] = rectangulo.getEsquina1().distancia(rectangulo.getEsquina2());
            areas[numRec] = rectangulo.calculoArea();
            numRec++;
        } else {
            System.out.println("Ya no es posible guardar más rectángulos. Capacidad máxima alcanzada.");
        }
        // Este método permite agregar un rectángulo al contenedor. Si aún no se ha
        // alcanzado la capacidad
        // máxima del contenedor, el rectángulo se agrega al arreglo rectangulos, y se
        // calculan y almacenan la
        // distancia y el área correspondientes.
    }

    // Método para mostrar los rectángulos almacenados en el contenedor
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(); // se crea un objeto para construir la cadena
        sb.append("Rectangulo\n");
        // se utiliza el bucle for para iterar sobre los rectangulos almacenados en el
        // contenedor
        for (int i = 0; i < numRec; i++) {
            sb.append((i + 1) + "\n");
        }
        sb.append("Coordenadas\n");
        // se itera sobre los rectangulos nuevamente y se agrega para cada uno las
        // coordenadas de sus esquinas utilizando
        // el todo toString() de la calse coordenada
        for (int i = 0; i < numRec; i++) {
            sb.append(rectangulos[i].getEsquina1().toString() + ", " + rectangulos[i].getEsquina2().toString() + "\n");
        }
        sb.append("Distancia\n");
        // se itera sobre el arreglo de distancias y agrega cada valor de distancia en
        // una nueva línea.
        for (int i = 0; i < numRec; i++) {
            sb.append(distancias[i] + "\n");
        }
        sb.append("Area\n");
        // se itera sobre el arreglo de áreas y agrega cada valor de área en una nueva
        // línea.
        for (int i = 0; i < numRec; i++) {
            sb.append(areas[i] + "\n");
        }
        return sb.toString();
    }
}
