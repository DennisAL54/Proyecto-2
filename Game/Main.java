package Game;

public class Main {

    public static int nivel = 1;
    public static int cantDragones = 10;

    public static CreadorDeOleadas creador = new CreadorDeOleadas();

    public static Lista oleada;

    public static void main(String Args[]){


        System.out.println("\nTest CreadorDeOleadas:\n");
        System.out.println("Test Lista Dragones Aleatorios:\n");

        oleada = creador.newOleada();

        oleada.print();

        System.out.println(" \n");

        System.out.println("Test AVLTree:\n");

        AVLTree arbol = creador.turnToAVLTree(oleada);

        arbol.preOrder();


        /*
        Lista l = new Lista();

        Dragon d1 = new Dragon("",0,1,0,"");
        Dragon d2 = new Dragon("",0,2,0,"");
        Dragon d3 = new Dragon("",0,3,0,"");
        Dragon d4 = new Dragon("",0,4,0,"");
        Dragon d5 = new Dragon("",0,5,0,"");
        Dragon d6 = new Dragon("",0,6,0,"");
        Dragon d7 = new Dragon("",0,7,0,"");
        Dragon d8 = new Dragon("",0,8,0,"");
        Dragon d9 = new Dragon("",0,9,0,"");
        Dragon d10 = new Dragon("",0,10,0,"");

        l.add(d5);
        l.add(d3);
        l.add(d4);
        l.add(d2);
        l.add(d6);
        //l.add(d6);
        //l.add(d7);
        //l.add(d8);
        //l.add(d9);
        //l.add(d10);

        l.print();

        System.out.println(" \n \n");

        System.out.println("Test AVLTree:\n");

        AVLTree arbol = creador.turnToAVLTree(l);

        arbol.preOrder();
         */


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
