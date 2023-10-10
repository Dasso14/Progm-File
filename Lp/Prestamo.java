/* Declare una nueva clase Prestamo que implemente la interfaz PorPagar. La clase
Prestamo deberá tener los atributos numeroDeCuotas y montoDeCuota. Cree el el
constructor respectivo, metodos get, set y toString. El valor retornado por el método
obtenerMontoPago de la clase Prestamo estará dado por el producto de numeroDeCuotas
y montoDeCuota. Modifique la clase principal para que en los resultados mostrados se
incluya también el del objeto de la clase Prestamo. */
public class Prestamo implements PorPagar{
    private int numeroDeCuotas;
    private int montoDeCuota;


    public Prestamo(int numeroDeCuotas, int montoDeCuota) {
        this.numeroDeCuotas = numeroDeCuotas;
        this.montoDeCuota = montoDeCuota;
    }

    public int getNumeroDeCuotas() {
        return numeroDeCuotas;
    }


    public void setNumeroDeCuotas(int numeroDeCuotas) {
        this.numeroDeCuotas = numeroDeCuotas;
    }


    public int getMontoDeCuota() {
        return montoDeCuota;
    }


    public void setMontoDeCuota(int montoDeCuota) {
        this.montoDeCuota = montoDeCuota;
    }

    @Override
    public double obtenerMontoPago() {
        return numeroDeCuotas * montoDeCuota;
    }

    @Override
    public String toString() {
        return "Prestamo [numeroDeCuotas=" + numeroDeCuotas + ", montoDeCuota=" + montoDeCuota + "]";
    }
}
