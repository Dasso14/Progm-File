public class TestComposicion extends Persona{

    public TestComposicion(int numero, double saldo, int id, String nombre, String apellido, Cuenta cuenta) {
        super(numero, saldo, id, nombre, apellido, cuenta);
    }

    public static void main(String[] args) {
    
        Persona p1 = new Persona(0, 0, 0, null, null, null);

        p1.setApellido("Martinez");
        System.out.println(p1.getApellido());

        p1.setNombre("Jose");
        System.out.println(p1.getNombre());

        p1.setSaldo("890.00");

        System.out.println(p1.getCuenta());
    }
}
