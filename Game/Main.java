package Game;

/**
 * Ventana
 */
public class Main {

    public static int nivel = 1; //Max 7                            //Pasarian 126 cambios de alineacion
    public static int cantDragones = 10; //Max 30

    public static CreadorDeOleadas creador = new CreadorDeOleadas();

    public static Lista oleada;


    public static void main(String Args[]){


        System.out.println("\nTest CreadorDeOleadas:\n");
        System.out.println("Test Lista Dragones Aleatorios:\n");

        oleada = creador.newOleada();

        oleada.print();


        System.out.println(" \n");

        System.out.println("Test AVLTree:\n");

        AVLTree avlTree = creador.turnToAVLTree(oleada);

        avlTree.preOrder();


        System.out.println(" \n");

        System.out.println("Test BinaryTree:\n");

        BinaryTree binaryTree = creador.turnToBinaryTree(oleada);

        binaryTree.preOrder();

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
