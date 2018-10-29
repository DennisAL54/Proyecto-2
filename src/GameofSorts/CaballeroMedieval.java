package GameofSorts;

import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.Rectangle;
import java.util.ArrayList;

/**
 *
 * @author Bryan
 */
public class CaballeroMedieval {
    private Image image;
    private int x,y,dx,dy;
    private final int Velocidad = 3;
    private ArrayList fuego;
    
    /**
     * Constructor del CaballeroMedieval
     */
    public CaballeroMedieval(){
        ImageIcon ii = new ImageIcon(this.getClass().getResource("images/Hipogrifo.gif"));
        image = ii.getImage();
        y = 200;
        x = 50-image.getWidth(null)/2;
        dx = 0;
        dy = 0;
        fuego = new ArrayList();
    }
    
    //Métodos setters y getters
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public Image getImage(){
        return image;
    }

    public ArrayList getfuego(){
        return fuego;
    }
    
    /**
     * Límites de movimiento del CaballeroMedieval en la ventana de juego 
     */
    public void logic(){
        if((y>0 && dy<0) || (y<370 && dy>0))
            y += dy;
        if((x>0 && dx<0) || (x<695 && dx>0))
            x += dx;
    }
    /**
     * Movimiento del Límites CaballeroMedieval al presionar una tecla  
     * @param e 
     */
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_RIGHT)
            dx = Velocidad;
        if(key == KeyEvent.VK_LEFT)
            dx = Velocidad * -1;
        if(key == KeyEvent.VK_UP)
            dy = Velocidad * -1;
        if(key == KeyEvent.VK_DOWN)
            dy = Velocidad;      
        if(key == KeyEvent.VK_SPACE)
            fuego.add(new Fuego(x + image.getWidth(null)/2, y));
        
    }
    /**
     * Movimiento del Límites CaballeroMedieval al soltar una tecla  
     * @param e 
     */
    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_LEFT && dx<0)
            dx = 0;
        if(key == KeyEvent.VK_RIGHT && dx>0)
            dx = 0;
        if(key == KeyEvent.VK_KP_UP && dy>0)
            dy = 0;
        if(key == KeyEvent.VK_KP_DOWN && dy<0)
            dy = 0;
    }
    /**
     * Dimenciones de la imagen (Hitbox)
     * @return 
     */
    public Rectangle getBounds(){
        return new Rectangle(x, y, image.getWidth(null), image.getHeight(null));
    }
}
