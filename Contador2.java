public class Contador2 {
    static int acumulador = 0; /* Variable de clase */
    final static int VALOR_INCIAL = 10;
    private int valor; /* Variable de instancia */

    public static int acumulador(){ /* Metodo de clase */
        return acumulador;
    }

    public Contador2 (int valor){ /* Metodo de instacia */
        this.valor =  valor;
        Contador2.acumulador += valor;
    }

    public Contador2 (){
        this(Contador2.VALOR_INCIAL);
    }

    public void inc(){ /* Metodo de instacia */
        this.valor++;
        acumulador++;
    }

    public int getValor(){ /* Metodo de instacia */
        return this.valor;
    }

    @Override
    public String toString() { /* Metodo de instacia */
        return "Contador [valor=" + valor + "]";
    }
}
