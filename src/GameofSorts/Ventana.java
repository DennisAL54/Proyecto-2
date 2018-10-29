package GameofSorts;

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
    private Image image;
    private Timer timer;
    private CaballeroMedieval caballeroMedieval;
    private Dragon dragon [];
    private final int DragonColum, DragonFila, Dragon_inicioX, Dragon_inicioY, Dragon_Relleno;
    static int Vidas;
    private Font font;
    private String vida, layoutActual, dragonStarts, nombre, edad, clase, padre; 
    
    
    /**
     * Constructor del juego
     */
    public Ventana(){
        setFocusable(true);
        addKeyListener(new Listener());
        
        ImageIcon ii = new ImageIcon(this.getClass().getResource("images/Castillo3.jpg"));
        image = ii.getImage();
        
        caballeroMedieval = new CaballeroMedieval(); 
                
        DragonColum = 8; // Cantidad de dragones
        DragonFila = 3; // Posicion en Y
        Dragon_inicioX = 600;
        Dragon_inicioY = 90;
        Dragon_Relleno = 1; // hitbox dragon
        
        dragon = new Dragon[DragonColum];
        for(int i = 0; i < DragonColum; i++){
            //for(int j = 0; j < DragonFila; j++){
            dragon[i]= new Dragon(DragonColum);
            dragon[i].setX(Dragon_inicioX + i*dragon[i].getImage().getWidth(null) + i*Dragon_Relleno);
                //dragon[i].setY(Dragon_inicioY + j*dragon[i].getImage().getHeight(null) + j*Dragon_Relleno);
            }
        
        Vidas = 3;
        font = new Font("Monospaced", Font.TYPE1_FONT,20); // Características de la letra
        vida = "Vidas: " + Vidas;
        
        timer = new Timer(15, this);
        timer.start();
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        // draw Castillo fondo
        g.drawImage(image, 0, 0, getWidth(), getHeight(),this);
        // draw caballeroMedieval
        g2d.drawImage(caballeroMedieval.getImage(), caballeroMedieval.getX(), caballeroMedieval.getY(), this);
        // draw Dragones
        for(int i = 0; i < DragonColum; i++)
            for(int j = 0; j < DragonFila; j++){
                if(dragon[i].isVisible())
                    g2d.drawImage(dragon[i].getImage(), dragon[i].getX(), dragon[i].getY(), this);
            }
        
        // draw Fuego
        ArrayList<Fuego> fuego = caballeroMedieval.getfuego();
        for(int i = 0; i < fuego.size(); i++){
            Fuego l = fuego.get(i);
            g2d.drawImage(l.getImage(), l.getX(), l.getY(), this);
        }
        
        // draw text
        g2d.setColor(Color.black);
        g2d.setFont(font);
        g2d.drawString(vida, 10, 470);
        g2d.drawString(layoutActual, 10, 510);
        g2d.drawString(dragonStarts, 320, 470);
        g2d.drawString(nombre, 320, 490);
        //g2d.drawString(velocidad, 320, 505);
        g2d.drawString(edad, 320, 520);
        //g2d.drawString(resistencia, 320, 535);
        g2d.drawString(clase, 320, 550);
        g2d.drawString(padre, 320, 565);
        
        g.dispose();
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
        for(int i = 0; i < DragonColum; i++){
            for(int j = 0; j < DragonFila; j++){
                dragon[i].logic(); // Updates
                if(dragon[i].getX() == 0)
                    if (dragon[i].isVisible() == true)
                        Vidas -= 1;
                        if (Vidas == 0)
                            gameOver(0);
                        
                        ArrayList<Fuego> lanzarFuego = dragon[i].getFuegos();
                        for(int k=0; k < lanzarFuego.size(); k++){
                            Fuego f = lanzarFuego.get(k);
                            if(f.isVisible())
                                f.update();
                            else
                                lanzarFuego.remove(k); 
                        }
                       
                //Hit Fuego
                for(int li = 0; li < fuego.size(); li++){
                    Fuego l = fuego.get(li);
                    if(l.getLimites().intersects(dragon[i].getBounds()) && l.isVisible() && dragon[i].isVisible()){
                        dragon[i].setVisible(false);
                        l.setVisible(false);  
                    }
                }
            }
        }
        
        for(int i = 0; i < fuego.size(); i++){
            Fuego l = fuego.get(i);
            if(l.isVisible())
                l.update();
            else
                fuego.remove(i);
        }
        vida = "Vidas: " + Vidas; // Actualiza las vidas en pantalla
        layoutActual = "Layout Actual: "; // Actualizacion de posición de dragones
        dragonStarts = "Dragon Starts";
        nombre = "Nombre: ";
        //Velocidad = "Velocidad: ";
        edad = "Edad: ";
        //resistencia = "Resistencia: ";
        clase = "Clase: ";
        padre = "Padre: ";
        
        repaint();
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
    /**
     * Estado de juego mientras esta activo
     * @param status 
     */
    public void gameOver(int status){
        timer.stop();
    }
}

