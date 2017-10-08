package h04;

import java.applet.Applet;
import java.awt.*;

public class Vlag extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.lightGray);
        g.fillRect(80,170,10,80);
        g.setColor(Color.red);
        g.drawRect(90,170,85,10);
        g.fillRect(90,170,85,10);
        g.setColor(Color.white);
        g.drawRect(90,180,85,10);
        g.fillRect(90,180, 85,10);
        g.setColor(Color.blue);
        g.drawRect(90,190,85,10) ;
        g.fillRect(90,190,85,10);
    }
}