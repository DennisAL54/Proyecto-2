package GameofSorts;

import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author Bryan
 */
public class Dragon {
    private Image image;
    private int x,y,dx,dy,lanzarFuegoPosib;
    private final int Velocidad;
    private ArrayList lanzarFuego;
    private Random random;
    private boolean visible; 
    
    /**
     * Constructor del Dragon 
     * @param x - posición en x
     */
    public Dragon(int x){
        ImageIcon ii = new ImageIcon(this.getClass().getResource("images/dragon1.gif"));
        image = ii.getImage();
        this.x = x;
        this.y = y;
        Velocidad = 1;        
        visible = true;
        y = 200;
        x =1050-image.getWidth(null)/2;
        dx = 0;
        dy = 0;
        lanzarFuegoPosib = 100;
        lanzarFuego = new ArrayList();
        random = new Random();
    }
    
    //Métodos setters y getters
    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }
    
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
    
    public int getVelocidad(){
        return Velocidad;
    }
    

    public Image getImage(){
        return image;
    }
    
    public void setVisible(boolean visible){
        this.visible = visible;
    }
    
    public boolean isVisible(){
        return visible;
    }
    
    /**
     * Acciones de movimiento de los dragones  
     */
    public void logic(){
        if((x>0 && dx<0) || (x<795 && dx>-10)) // Límites de la pantalla en y
            x += dx;
            dx = Velocidad * -1;
            
        if((y>0 && dy<0) || (y<370 && dy>0)) // Límites de la pantalla en x
            y += dy;
        
        if(random.nextInt()% lanzarFuegoPosib == 1 && x > 0) // fuego dragones
            lanzarFuego.add(new Fuego(x, y));
    }
    /**
     * Arreglo en donde se crean los proyectiles 
     * @return 
     */
    public ArrayList getFuegos(){
        return lanzarFuego;
    }
    /**
     * Dimenciones de la imagen (Hitbox)
     * @return 
     */
    public Rectangle getBounds(){
        return new Rectangle(x, y, image.getWidth(null), image.getHeight(null));
    }
}
