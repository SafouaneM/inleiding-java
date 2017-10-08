package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht2 extends Applet {
  int man, vrouw, women,oldman, totaal;
  Button Man, ManellijkeListner;
  Button Vrouw, VrouwListner ;
  Button Women, WomenListner ;
  Button Oldman, Oldmanlistner ;

public void init(){

    man=0;

    ManellijkeListner = new Button("Man");
    ManellijkeListener Ml = new ManellijkeListener ();
    ManellijkeListner.addActionListener(Ml);
    add (ManellijkeListner);

    vrouw=0;

    VrouwListner = new Button ("Vrouw");
    VrouwListner Vl = new VrouwListner ();
    VrouwListner.addActionListener(Vl);
    add (VrouwListner);

    women=0;

    WomenListner = new Button ("Potientele man");
    WomenListner Wl = new WomenListner ();
    WomenListner.addActionListener(Wl);
    add (WomenListner);

    oldman=0;

    Oldmanlistner = new Button ("Potientele vrouw");
    Oldmanlistner Ol = new Oldmanlistner ();
    Oldmanlistner.addActionListener(Ol);
    add (Oldmanlistner);

}

public void paint (Graphics g){
    g.drawString("Aantal mannen : " + man,50,60);
    g.drawString("Aantal vrouwen : " + vrouw,50,80) ;
    g.drawString("Potientele mannen : " + women,50,100) ;
    g.drawString("Potientele vrouwen : " + oldman,50,120) ;
        totaal = man + vrouw + women + oldman;
        g.drawString("Alles bij elkaar is : " + totaal, 50, 140);
}

class ManellijkeListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
        man++;
        repaint();
    }
}
    class VrouwListner implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            vrouw++;
            repaint();
        }
    }
    class WomenListner implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            women++;
            repaint();
        }
    }
    class Oldmanlistner implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            oldman++;
            repaint();
        }
    }




}
