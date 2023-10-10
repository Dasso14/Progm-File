public class EmpleadoAsalariado extends Empleado{
    private double salarioSemanal;

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    public EmpleadoAsalariado(String nombre, String apellido, String nss, double salario) {
        super(nombre, apellido, nss);
        setSalarioSemanal(salario);
    }

    @Override
    public double obtenerMontoPago(){
        return getSalarioSemanal();
    }

    @Override
    public String toString() {
        return "EmpleadoAsalariado [salarioSemanal=" + salarioSemanal + "]";
    }

    
}
