package RelacionEntreClases.Composicion;
public class TestComposicion extends Persona{



    public TestComposicion(int numero, double saldo, int id, String nombre, String apellido, char c) {
        super(numero, saldo, id, nombre, apellido, c);
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
    
        Persona p1 = new Persona(0, 0, 0, null, null, 0);

        p1.setApellido("Martinez");
        System.out.println(p1.getApellido());

        p1.setNombre("Jose");
        System.out.println(p1.getNombre());

        System.out.println(p1.getCuenta());
    }
}
