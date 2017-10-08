package h06;

import java.applet.Applet;
import java.awt.*;


public class Opdracht1 extends Applet {
    int a;
    int b;
    double berekening;

    public void init() {
        a = 113;
        b = 4;
        berekening = (a / b);
    }
    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + berekening, 20, 30);
        g.drawString("Jan = 28,00", 20, 40);
        g.drawString("Ali = 28,00", 20, 60);
        g.drawString("Jeannette = 28,00", 20, 80);
        g.drawString("Kevin = 28,00", 20, 100);
    }
}