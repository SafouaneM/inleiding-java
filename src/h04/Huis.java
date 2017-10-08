package h04;

import java.applet.Applet;
import java.awt.*;

public class Huis extends Applet {

    public void init() {
        setBackground(Color.white);
    }
    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.blue);
        g.drawRect(100, 80, 200, 125);
        g.fillRect(100,80,200,125);

        g.setColor(Color.black);
        g.drawRect(200,125,30,80);
        g.fillRect(200,125,30,80);

        g.setColor(Color.YELLOW);
        g.drawRect(250,135,40,25);
        g.fillRect(250,135,40,25);
    }
}








