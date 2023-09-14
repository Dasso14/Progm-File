import java.util.Scanner;

public class PromedioEstudiantes {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese la cantidad de estudiantes: ");
            int cantidadEstudiantes = scanner.nextInt();
            
            String[] nombres = new String[cantidadEstudiantes];
            int[] notasMatematica = new int[cantidadEstudiantes];
            int[] notasFisica = new int[cantidadEstudiantes];
            
            // Solicitar nombres y notas para cada estudiante
            for (int i = 0; i < cantidadEstudiantes; i++) {
                System.out.print("Ingrese el nombre del estudiante " + (i+1) + ": ");
                nombres[i] = scanner.next();
                System.out.print("Ingrese la nota de Matemática para " + nombres[i] + ": ");
                notasMatematica[i] = scanner.nextInt();
                System.out.print("Ingrese la nota de Física para " + nombres[i] + ": ");
                notasFisica[i] = scanner.nextInt();
            }
            
            // Calcular promedio por estudiante
            double[] promedios = new double[cantidadEstudiantes];
            double promedioGeneral = 0;
            double promedioMaximo = Double.MIN_VALUE;
            double promedioMinimo = Double.MAX_VALUE;
            String estudiantePromedioMaximo = "";
            String estudiantePromedioMinimo = "";
            
            for (int i = 0; i < cantidadEstudiantes; i++) {
                promedios[i] = (notasMatematica[i] + notasFisica[i]) / 2.0;
                promedioGeneral += promedios[i];
                
                if (promedios[i] > promedioMaximo) {
                    promedioMaximo = promedios[i];
                    estudiantePromedioMaximo = nombres[i];
                }
                
                if (promedios[i] < promedioMinimo) {
                    promedioMinimo = promedios[i];
                    estudiantePromedioMinimo = nombres[i];
                }
            }
            
            promedioGeneral /= cantidadEstudiantes;
            
            // Mostrar información ingresada para cada estudiante
            System.out.println("Nombre\tMatemática\tFísica\tPromedio");
            for (int i = 0; i < cantidadEstudiantes; i++) {
                System.out.println(nombres[i] + "\t" + notasMatematica[i] + "\t\t" + notasFisica[i] + "\t\t" + promedios[i]);
            }
            
            // Mostrar resultados finales
            System.out.println("\nEstudiante con Promedio más Alto: " + estudiantePromedioMaximo);
            System.out.println("Estudiante con Promedio más Bajo: " + estudiantePromedioMinimo);
            System.out.println("Promedio General: " + promedioGeneral);
        }
    }
}
