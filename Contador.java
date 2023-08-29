public class Contador {
    static int acumulador = 0; /* Variable de clase */
    static int nContadores;
    static int ultimoContador;
    final static int VALOR_INCIAL = 10;
    private int valor; /* Variable de instancia */

    public static int acumulador(){ /* Metodo de clase */
        return acumulador;
    }

    public Contador (int valor){ /* Metodo de instacia */
        this.valor =  valor;
        Contador.acumulador += valor;
    }

    public Contador(){
        this(Contador.VALOR_INCIAL);
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