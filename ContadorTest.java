public class ContadorTest {
    public static void main(String[] args) { /* Metodo de clase */
        Contador c1, c2;
        System.out.println(Contador.acumulador());
        c1 = new Contador(3);
        c2 = new Contador(10);
        c1.inc();
        c2.inc();
        System.out.println(c1.getValor());
        System.out.println(c2.getValor());
        System.out.println(Contador.acumulador);

        System.out.println("---------------------------");
        Contador2 c3, c4;
        c3 = new Contador2(6);
        c4 = new Contador2(10);
        c3.inc();
        c4.inc();

        System.out.println(c3.getValor());
        System.out.println(c4.getValor());
        System.out.println(Contador2.acumulador);
    }
}
