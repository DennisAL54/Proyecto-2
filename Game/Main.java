package Game;

public class Main {

    public static int nivel = 1;
    public static int dragones = 100;

    public static void main(String Args[]){

        System.out.println("\nTest CreadorDeOleadas:\n");

        CreadorDeOleadas creador = new CreadorDeOleadas();

        Lista oleada = creador.newOleada();

        oleada.print();

    }



}
