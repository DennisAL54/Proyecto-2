package GameofSorts;

import javax.swing.JFrame;
/**
 *
 * @author Bryan
 */
public class Main extends JFrame {
    public static int nivel = 1; //Max 7                            //Pasarian 126 cambios de alineacion
    public static int cantDragones = 10; //Max 30
    public static CreadorDeOleadas creador = new CreadorDeOleadas();
    public static Lista oleada;
    
    /**
     * Constructor de la ventana de juego
     */
    public Main(){
        add(new Ventana());
        setTitle("Game of Sorts");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1350,645);  //950, 600
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args) {
        new Main();
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
