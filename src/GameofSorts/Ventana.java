package GameofSorts;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
//import java.awt.Color;

// timer
import javax.swing.Timer;

// teclas y timer
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// teclas
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import java.util.ArrayList;
import javax.swing.ImageIcon;


public class Ventana extends JPanel implements ActionListener {
    private Image image;
    private Timer timer;
    private CaballeroMedieval caballeroMedieval;
    
    public Ventana(){
        setFocusable(true);
        addKeyListener(new Listener());
        
        ImageIcon ii = new ImageIcon(this.getClass().getResource("images/Castillo.jpg"));
        image = ii.getImage();
        
        
        caballeroMedieval = new CaballeroMedieval();

        timer = new Timer(15, this);
        timer.start();
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        
        g.drawImage(image, 0, 0, getWidth(), getHeight(),this);

        g2d.drawImage(caballeroMedieval.getImage(), caballeroMedieval.getX(), caballeroMedieval.getY(), this);

        ArrayList<Fuego> fuego = caballeroMedieval.getfuego();
        for(int i = 0; i < fuego.size(); i++){
            Fuego l = fuego.get(i);
            g2d.drawImage(l.getImage(), l.getX(), l.getY(), this);
        }
        g.dispose();
    }

    public void actionPerformed(ActionEvent e){
        // Updates
        caballeroMedieval.logic();
        
        ArrayList<Fuego> fuego = caballeroMedieval.getfuego();
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
}
