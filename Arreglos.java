class Arreglos{
    public static void main(String[] args){
        int[] arreA = new int[5];
        arreA[0]=1;
        arreA[1]=2;
        arreA[2]=3;
        arreA[3]=4;
        arreA[4]=5;

        int[] arreB = {50,80,90,200};

        System.out.println("Forma Clásica");
        for(int c=0; c < arreA.length; c++){ //Forma Clásica
            arreA[c] = arreA[c]+20;     //Puedes cambiar el valor de los arreglos
            System.out.println("Indice: "+c+" Valor: "+arreA[c]);
        }

        System.out.println("-------------------------------");

        System.out.println("Forma Simplificada");
        for(int pivote : arreB){ //Forma Simplificada
            System.out.println("Valor: "+pivote);       //No puedes cambiar el valor de los arreglos
        }

        System.out.println("-------------------------------");

        System.out.println("Arreglos bidimensionales, tridimensionales");
        int[][] bidi = { {8,9,2},{3,4},{6} };
        for(int fila=0; fila < bidi.length; fila++){
            for(int columna=0; columna < bidi[fila].length; columna++){
                System.out.printf("|%d|", bidi[fila][columna]);
            }
            System.out.println("");
        }
    }
}