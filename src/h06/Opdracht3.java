package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {
    int a;
    int b;
    double berekening;

    public void init() {
        a = 2147483647;
        b = 2147483647;
        berekening = a + b;
    }

    public void paint(Graphics g) {
        g.drawString("De negatieve uitkomst is" + berekening, 50, 65);
    }

}