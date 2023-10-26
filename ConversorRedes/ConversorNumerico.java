package ConversorRedes;
import java.util.Scanner;

public class ConversorNumerico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Convertir de hexadecimal a decimal");
            System.out.println("2. Convertir de hexadecimal a binario");
            System.out.println("3. Convertir de decimal a hexadecimal");
            System.out.println("4. Convertir de decimal a binario");
            System.out.println("5. Convertir de binario a decimal");
            System.out.println("6. Convertir de binario a hexadecimal");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el número hexadecimal a convertir:");
                    String hex = scanner.next();
                    int decimal = Integer.parseInt(hex, 16);
                    System.out.println("El número decimal es: " + decimal);
                    break;
                case 2:
                    System.out.println("Ingrese el número hexadecimal a convertir:");
                    String hex2 = scanner.next();
                    int decimal2 = Integer.parseInt(hex2, 16);
                    String binario = Integer.toBinaryString(decimal2);
                    System.out.println("El número binario es: " + binario);
                    break;
                case 3:
                    System.out.println("Ingrese el número decimal a convertir:");
                    int decimal3 = scanner.nextInt();
                    String hex3 = Integer.toHexString(decimal3);
                    System.out.println("El número hexadecimal es: " + hex3);
                    break;
                case 4:
                    System.out.println("Ingrese el número decimal a convertir:");
                    int decimal4 = scanner.nextInt();
                    String binario2 = Integer.toBinaryString(decimal4);
                    System.out.println("El número binario es: " + binario2);
                    break;
                case 5:
                    System.out.println("Ingrese el número binario a convertir:");
                    String binario3 = scanner.next();
                    int decimal5 = Integer.parseInt(binario3, 2);
                    System.out.println("El número decimal es: " + decimal5);
                    break;
                case 6:
                    System.out.println("Ingrese el número binario a convertir:");
                    String binario4 = scanner.next();
                    int decimal6 = Integer.parseInt(binario4, 2);
                    String hex4 = Integer.toHexString(decimal6);
                    System.out.println("El número hexadecimal es: " + hex4);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 0);
        scanner.close();
    }
}