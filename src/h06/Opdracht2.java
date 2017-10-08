package h06;
import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    int a;
    int b;
    int c;
    int berekening;

    public void init() {
        a = 59;
        b = 24;
        c = 365;


        berekening = a * a;
    }

    public void paint(Graphics g) {
        g.drawString("Ongeveer " + berekening + " Seconden in een uur", 20, 20);

        berekening = a * a * b;
        g.setColor(Color.BLUE);
        g.drawString("En er zijn ook " + berekening + " Seconden in een dag", 20, 40);

        berekening = c * a * a * b;
        g.setColor(Color.green);
        g.drawString("En zoveel " + berekening + " Seconden in een jaar", 20, 60);

    }

}