package h04;

import java.applet.Applet;
import java.awt.*;

public class Stoplicht extends Applet {


    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawRect(100, 100, 40, 120);
        g.setColor(Color.red);
        g.fillOval(100,100,40,40);
        g.setColor(Color.orange);
        g.fillOval(100,140,40,40);
        g.setColor(Color.green);
        g.fillOval(100,180,40,40);

    }}





