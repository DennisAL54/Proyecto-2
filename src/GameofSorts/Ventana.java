package GameofSorts;

import static GameofSorts.Main.creador;
import static GameofSorts.Main.oleada;
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
import java.awt.event.MouseEvent;
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
    private Layout layout;
    
    private Font font;
    private String vida, layoutActual, dragonStarts, nombre, edad, clase, padre, velocidad;
    static int Vidas;
    
    /**
     * Constructor del juego
     */
    public Ventana(){
        setFocusable(true);
        addKeyListener(new Listener());
        
        ImageIcon ii = new ImageIcon(this.getClass().getResource("images/Castillo.jpg"));
        image = ii.getImage();
        
        layout = new Layout();
        
        caballeroMedieval = new CaballeroMedieval(); 
        
        oleada = creador.newOleada();        
              
        
        Vidas = 3;
        font = new Font("Monospaced", Font.TYPE1_FONT,25); // Características de la letra
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
        Dragon temp = oleada.getHead();
        while (temp != null){
            g2d.drawImage(temp.getImage(), temp.getX(),temp.getY(),this);
            temp = temp.getNext();
        }    
            
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
        
        //g2d.drawString(layoutActual, 1100, 250);
        //g2d.drawString(dragonStarts, 1100, 350);
        //g2d.drawString(nombre, 1050, 390);
        //g2d.drawString(velocidad, 1050, 420);
        //g2d.drawString(edad, 1050, 450);
        //g2d.drawString(resistencia, 320, 480);
        //g2d.drawString(clase, 1050, 510);
        //g2d.drawString(padre, 1050, 540);
        
        
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
        Dragon temp = oleada.getHead();
        while (temp != null){
            temp.logic();
            
            if(temp.getX() == 0)
                    if (temp.isVisible() == true)
                        Vidas -= 1;
                        if (Vidas == 0)
                            gameOver(0);
            
            
            //Hit Fuego
            for(int li = 0; li < fuego.size(); li++){
                Fuego l = fuego.get(li);
                if(l.getLimites().intersects(temp.getBounds()) && l.isVisible() && temp.isVisible()){
                    temp.setVisible(false);
                    oleada.destroyEnemy(temp.getName());
                    l.setVisible(false);
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
