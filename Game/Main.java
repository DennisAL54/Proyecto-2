package Game;

public class Main {

    public static int nivel = 1;
    public static int cantDragones = 10;

    public static void main(String Args[]){

        System.out.println("\nTest CreadorDeOleadas:\n");

        CreadorDeOleadas creador = new CreadorDeOleadas();

        Lista oleada = creador.newOleada();

        oleada.print();


    }

    public static int getNivel() {
        return nivel;
    }

    public static void setNivel(int nivel) {
        Main.nivel = nivel;
    }

    public static int getCantDragones() {
        return cantDragones;
    }

    public static void setDragones(int cantDragones) {
        Main.cantDragones = cantDragones;
    }
}
