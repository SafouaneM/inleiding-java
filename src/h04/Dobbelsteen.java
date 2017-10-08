package h04;

import java.applet.Applet;
import java.awt.*;

public class Dobbelsteen extends Applet {

 public void init() {
 }


 public void paint(Graphics g) {
     g.drawRect(100, 100, 150, 150);
     g.drawOval(110, 110, 50, 50);
     g.drawOval(110, 190, 50, 50);
     g.drawOval(190, 190, 50, 50);
     g.drawOval(190, 110, 50, 50);

 }
 }