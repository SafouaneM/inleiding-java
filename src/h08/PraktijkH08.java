import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class PraktijkH08 extends Applet {
    TextField tekstvak;
    TextField tekstvak2;

    Button plus;
    Button min;
    Button delen;
    Button keer;
    Label label;
    double getal;
    double getaldos;

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
        this.setSize(450, 100);
    }

    class plusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String a = tekstvak.getText();
            getal = Double.parseDouble(a);
            String b = tekstvak2.getText();
            getaldos = Double.parseDouble(b);
            double uitkomst = getal + getaldos;
            tekstvak.setText(String.valueOf(uitkomst));
            tekstvak2.setText("");
            repaint();
        }

    }

    class minListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String c = tekstvak.getText();
            getal = Double.parseDouble(c);
            String d = tekstvak2.getText();
            getaldos = Double.parseDouble(d);
            double uitkomst = getal - getaldos;
            tekstvak.setText(String.valueOf(uitkomst));
            tekstvak2.setText("");
            repaint();
        }
    }
    class delenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String f = tekstvak.getText();
            getal = Double.parseDouble("");
            String g = tekstvak2.getText();
            getaldos = Double.parseDouble("");
            double uitkomst = getal / getaldos;
            tekstvak.setText(String.valueOf(uitkomst));
            tekstvak2.setText("");
        }
    }

    class keerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String h = tekstvak.getText();
            getal = Double.parseDouble(h);
            String i = tekstvak2.getText();
            getaldos = Double.parseDouble(i);
            double uitkomst = getal * getaldos;
            tekstvak.setText(String.valueOf(uitkomst));
            tekstvak2.setText("");
            repaint();
        }
    }
}

