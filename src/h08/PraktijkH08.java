package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkH08 extends Applet {
    TextField tekstvak;
    TextField tekstvak2;

    Button plus;
    Button min;
    Button delen;
    Button keer;
    Label label;
    double getal;

    public void init() {
        tekstvak = new TextField("", 20);
        add(tekstvak);
        tekstvak2 = new TextField("", 20);
        add(tekstvak2);

        plus = new Button("+");
        plusListener pl = new plusListener();
        plus.addActionListener(pl);
        add(plus);

        min = new Button("-");
        minListener ml = new minListener();
        min.addActionListener(ml);
        add(min);

        delen = new Button("/");
        delenListener dl = new delenListener();
        delen.addActionListener(dl);
        add(delen);

        keer = new Button("x");
        keerListener kl = new keerListener();
        keer.addActionListener(kl);
        add(keer);


    }

    public void paint(Graphics g) {
        g.drawString("Het uitkomst is " + getal, 150, 100);
        this.setSize(450, 100);
    }

    class plusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            repaint();
        }

    }

    class minListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            repaint();
        }

    }

    class delenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            repaint();
        }

    }

    class keerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            repaint();
        }
    }
}