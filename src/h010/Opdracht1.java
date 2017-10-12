package h010;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1 extends Applet {
    int Grote;
    int cijfers;
    TextField tekstvak;
    String tekst;


    public void init() {
        setSize(600,300);
        tekstvak = new TextField("Type hier steeds een groter getal", 50);
        Tekstvaklistener kl = new Tekstvaklistener();
        tekstvak.addActionListener(kl);
        add(tekstvak);
        tekst = "";

    }


    public void paint(Graphics g) {
        g.drawString("Het grootste getal is: " + Grote,20,50);
    }

    class Tekstvaklistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            cijfers = Integer.parseInt(s);
            if (Grote < cijfers) {
                Grote = cijfers;
                repaint();

            }
        }
    }

}