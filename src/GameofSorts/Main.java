package GameofSorts;

import javax.swing.JFrame;

public class Main extends JFrame {

    public Main(){
        add(new Ventana());
        setTitle("Game of Sorts");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(950,600);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args) {
        new Main();
    }

}
