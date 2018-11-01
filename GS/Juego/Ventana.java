package Juego;

import Ordenamiento.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
/**
 *
 * @author Bryan
 */
public class Ventana extends JPanel implements ActionListener {
    public static int nivel = 1; //Max 7                            //Pasarian 126 cambios de alineacion
    public static int cantDragones = 6; //Max 30
    public static CreadorDeOleadas creador = new CreadorDeOleadas();
    public static Lista oleada = new Lista();
    
    private Image image;
    private Timer timer;
    private CaballeroMedieval caballeroMedieval;
    private Layout layout;
    private AVLTree avlTree = new AVLTree();
    private BinaryTree binary = new BinaryTree();
    private static int numOrden = 1;
    static Graphics2D g2d;
    
    private Font font;
    private String vida, layoutActual, lay, dragonStarts, nombre,n, edad,resistencia, clase, padre, velocidad;
    static int Vidas;
    
    
    /**
     * Constructor del juego
     */
    public Ventana(){
        setFocusable(true);
        addKeyListener(new Listener());
        
        ImageIcon ii = new ImageIcon(this.getClass().getResource("/images/Castillo.jpg"));
        image = ii.getImage();
        
        layout = new Layout();
        
        caballeroMedieval = new CaballeroMedieval(); 
        
        oleada = creador.newOleada();        
              
        lay = "al";
        Vidas = 3;
        font = new Font("Monospaced", Font.TYPE1_FONT,25); // Características de la letra
        vida = "Vidas: " + Vidas;
        
        timer = new Timer(15, this);
        timer.start();
    }

    public static int getCantDragones() {
        return cantDragones;
    }

    public static void setCantDragones(int cantDragones) {
        Ventana.cantDragones = cantDragones;
    }
    
    

    @Override
    public void paint(Graphics g){
        super.paint(g);
        g2d = (Graphics2D)g;
        
        
        // draw Castillo fondo
        g.drawImage(image, 0, 0, getWidth(), getHeight(),this);
        // draw caballeroMedieval
        g2d.drawImage(caballeroMedieval.getImage(), caballeroMedieval.getX(), caballeroMedieval.getY(), this);
        
        draw(oleada);
        /*
        // draw Dragones
        Dragon temp = oleada.getHead();
        while (temp != null){
            g2d.drawImage(temp.getImage(), temp.getX(),temp.getY(),this);
            temp = temp.getNext();
        }
        */
            
        // draw Fuego
        ArrayList<Fuego> fuego = caballeroMedieval.getfuego();
        for(int i = 0; i < fuego.size(); i++){
            Fuego l = fuego.get(i);
            g2d.drawImage(l.getImage(), l.getX(), l.getY(), this);
        }
        
        g2d.drawImage(layout.getImage(), layout.getX(),layout.getY(),this);
        
        // draw text
        g2d.setColor(Color.black);
        g2d.setFont(font);
        g2d.drawString(vida, 1100, 100);
        
        g2d.setColor(Color.black);
        g2d.setFont(font);
        g2d.drawString(vida, 1100, 100);
        g2d.drawString(layoutActual, 1100, 250);
        g2d.drawString(nombre, 1050, 390);
        g2d.drawString(velocidad, 1050, 420);
        g2d.drawString(edad, 1050, 450);
        g2d.drawString(resistencia, 1050, 480);
        g2d.drawString(clase, 1050, 510);
        g2d.drawString(padre, 1050, 540);
        
        
        g.dispose();
    }
    
    
    private void draw(Lista oleada){
        // draw Dragones
        Dragon temp = oleada.getHead();
        while (temp != null){
            g2d.drawImage(temp.getImage(), temp.getX(),temp.getY(),this);
            temp = temp.getNext();
        }
        
    }
    
    private void drawTree (Dragon tree){
        g2d.drawImage(tree.getImage(), tree.getX(),tree.getY(),this);
        if (tree.getLeft() != null)
            drawTree(tree.getLeft());
        if (tree.getRight() != null)
        drawTree(tree.getRight());
    }
    
    
    
    /**
     * Acciones al presionar una tecla 
     * @param e 
     */
    public void actionPerformed(ActionEvent e){
        ArrayList<Fuego> fuego = caballeroMedieval.getfuego();
        // Updates
        caballeroMedieval.logic();     
        // Dragon
        Dragon temp = oleada.getHead();
        while (temp != null){
            temp.logic();
            
            if(temp.getX() == -80)
                    if (temp.isVisible() == true)
                        Vidas -= 1;
                        if (Vidas == 0)
                            gameOver(0);
            
            
            //Hit Fuego
            for(int li = 0; li < fuego.size(); li++){
                Fuego l = fuego.get(li);
                if(l.getLimites().intersects(temp.getBounds()) && l.isVisible() && temp.isVisible()){
                    oleada.print();
                   
                        temp.setVisible(false);
                        oleada.destroyEnemy(temp.getName());
                        l.setVisible(false);
                        //String ubicacionXML = creador.oleadaToXML(oleada);
                        
                        if (oleada.getHead() == null) {
                            System.out.println("Empty");
                            levelUp();
                            oleada = creador.newOleada();
                            draw(oleada);
                            break;
                        } else {
                           reorganice(oleada); 
                        }
                        
                        
                        //Enviar servidor ubicacionXML
                    
                    
                }
            }
        temp = temp.getNext();
        }
                
        for(int i = 0; i < fuego.size(); i++){
            Fuego l = fuego.get(i);
            if(l.isVisible())
                l.update();
            else
                fuego.remove(i);
        }
        
        /**
         * 
         * caracteristicas dragon
         * 
         */
        
        
        vida = "Vidas: " + Vidas; // Actualiza las vidas en pantalla
        layoutActual = lay; // Actualizacion de posición de dragones
        
        nombre = "Nombre: " + oleada.getHead().getName();
        velocidad = "Velocidad: " + oleada.getHead().getVelocidad() ;
        edad = "Edad: " + oleada.getHead().getAge();
        resistencia = "Resistencia: " + oleada.getHead().getResistance();
        clase = "Clase: " + oleada.getHead().getClassType();
        padre = "Padre: " + oleada.getHead().getPadre();
        
        repaint();
    }
    
    public void mousePressed(){
        
    }
    public void mouseReleased(){

    }

    private class Listener extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){
            caballeroMedieval.keyPressed(e);
                    timer.start();
        }
        @Override
        public void keyReleased(KeyEvent e){
            caballeroMedieval.keyReleased(e);       
        }
    }
    
    private void reorganice(Lista oleada){
        System.out.println(oleada.getHead());
        int i = (numOrden + 3) % 3;
        
        switch (i) {
            case 1:
                System.out.println("1: " + i);
                //oleada = creador.selectionSort(oleada);
                oleada = creador.recreateOleada(oleada);
                draw(oleada);
                lay = "Selection Sort";
                break;
            case 2:
                System.out.println("2: " + i);
                //oleada = creador.insertionSort(oleada);
                oleada = creador.recreateOleada(oleada);
                draw(oleada);
                lay = "Insertion Sort";
                break;
            //case 3:
            default:
                System.out.println("3: " + i);
                //oleada = creador.quickSort(oleada);
                oleada = creador.recreateOleada(oleada);
                draw(oleada);
                lay = "Quick Sort";
                break;
            /*case 4:
                System.out.println("4: " + i);
                binary = creador.turnToBinaryTree(oleada);
                drawTree(binary.getRoot());
                break;*/
           /* default:
                System.out.println("5: " + i);
                avlTree = creador.turnToAVLTree(oleada);
                drawTree(avlTree.getRoot());
                break;*/
        }
        numOrden+=1;
        System.out.println("NumOrden: " + numOrden);
                    
    }
    
    public void levelUp(){
        this.nivel = this.nivel + 1;
        cantDragones = (int)(this.cantDragones + (this.cantDragones*0.2));
    }
    
    /**
     * Estado de juego mientras esta activo
     * @param status 
     */
    public void gameOver(int status){
        timer.stop();
    }
}
