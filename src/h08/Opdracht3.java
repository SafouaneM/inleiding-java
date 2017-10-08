package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Applet {
    double berekening;
    TextField tekstvak;
    Button Knop;

    public void init(){
        tekstvak = new TextField("", 30);
        Knop = new Button ("21%");
        KnopListener Kl = new KnopListener();
        Knop.addActionListener ( Kl );
        add (Knop);
        add (tekstvak);
    }



    public void paint (Graphics g) {
        g.drawString("Vul een bedrag in" + " en druk op 21% om het btw erbij te berekenen", 50, 50);
        g.drawString("Prijs: " + berekening, 10, 125);



    }


    class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            double berekening2 = Double.parseDouble(tekstvak.getText());
            berekening = round(berekening2 * 1.21, 2 );
            repaint();

        }

    }
    public static double round(double Waarde, int rij) {
        if (rij < 0) throw new IllegalArgumentException();
        long Factor = (long) Math.pow(10, rij);
        Waarde = Waarde * Factor;
        long tmp = Math.round(Waarde);
        return (double) tmp / Factor;
    }

    }
