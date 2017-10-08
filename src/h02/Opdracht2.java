package h02;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString("Safouane", 50, 60);
        g.setColor(Color.red);
        g.drawString("Messaoudi", 60, 70);
    }
}