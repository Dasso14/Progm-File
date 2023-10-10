public class PruebaInterfazPorPagar {
    public static void main(String[] args) {
        PorPagar[] ObjetosPorPagar = new PorPagar[6];

        ObjetosPorPagar[0] = new Factura("01234", "asiento", 2, 375.00);
        ObjetosPorPagar[1] = new Factura("56789", "llanta", 4, 79.95);
        ObjetosPorPagar[2] = new EmpleadoAsalariado("Jhon", "Smith", "111-11-1111", 800.00);
        ObjetosPorPagar[3] = new EmpleadoAsalariado("Lisa", "Barner", "888-88-8888", 1200.00);
        ObjetosPorPagar[4] = new EmpleadoAsalariado("Kelvin", "Frezzer", "99-999-9999", 1990.00);
        ObjetosPorPagar[5] = new Prestamo(12, 1000);

        System.out.println("Facturas y Empleados procesados en forma polimorfica:\n");

        for (PorPagar porPagarActual : ObjetosPorPagar) {
            System.out.printf("%s \n%s: $%,.2f\n\n", porPagarActual.toString(), "Pago vencido",
                    porPagarActual.obtenerMontoPago());
        }
    }
}
