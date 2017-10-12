package h010;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht2 extends Applet {
    int Grote;
    int Klein;
    int cijfers;
    TextField tekstvak;
    String tekst;


    public void init() {
        setSize(400, 300);
        Grote = Integer.MIN_VALUE;
        Klein= Integer.MAX_VALUE;
        tekstvak = new TextField("", 50);
        Tekstvaklistener Tl = new Tekstvaklistener();
        tekstvak.addActionListener(Tl);
        add(tekstvak);
        tekst = "";

    }


    public void paint(Graphics g) {
        if (Grote > Integer.MIN_VALUE) {
            g.drawString("Grootste: " + Grote, 20, 50);
            g.drawString("Kleinste: " + Klein, 20, 65);
        }
    }

    class Tekstvaklistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            cijfers = Integer.parseInt(s);
            if (Grote < cijfers) {
                Grote = cijfers;

            }
            if (Klein > cijfers) {
                Klein = cijfers;
            }
            repaint();
        }
    }

}