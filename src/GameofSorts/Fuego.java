package GameofSorts;

import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Rectangle;

/**
 *
 * @author 
 */
public class Fuego {
    protected Image image;
    protected int x,y;
    private final int Velocidad = 7;
    private boolean visible;

    public Fuego(int x, int y){
        ImageIcon ii = new ImageIcon(this.getClass().getResource("images/fuego.gif"));
        image = ii.getImage();
        visible = true;
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public Image getImage(){
        return image;
    }


    public Rectangle getLimites(){
        return new Rectangle(x, y, image.getWidth(null), image.getHeight(null));
    }

    public boolean isVisible(){
        return visible;
    }

    public void setVisible(boolean visible){
        this.visible = visible;
    }

    public void update(){
        x += Velocidad;
        if(x<0)
            visible = false;
    }
}
