package Challenge;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Challengejava extends Applet{

    private int hJeroen;
    private int hValerie;
    private int hHans;
    private int yValerie;
    private int yJeroen;
    private int yHans;

    private TextField valerie, jeroen, hans;


    public void init() {
        valerie = new TextField(10);
        Label label = new Label("Valerie");
        add (label);
        add(valerie);

        jeroen = new TextField(10);
        label = new Label("Jeroen");
        add (label);
        add(jeroen);

        hans = new TextField(10);
        label = new Label("Hans");
        add (label);
        add(hans);

        Button Toon = new Button("Toon");
        ToonListener Tl = new ToonListener();
        Toon.addActionListener(Tl);
        add (Toon);
    }

    public void paint(Graphics g) {
        setBackground(Color.lightGray);
        g.setColor(Color.black);
        g.drawLine(10, 29,10,200);
        g.setColor(Color.gray);

        //valerie lijn
        g.drawString("Valerie", 50, 225);
        g.setColor(Color.gray);
        g.fillRect(80, yValerie, 50, hValerie*2);
        g.setColor(Color.orange);

        //jeroen lijn
        g.drawString("Jeroen", 110, 225);
        g.setColor(Color.green);
        g.fillRect(150, yJeroen, 50, hJeroen*2);

        //hans
        g.setColor(Color.cyan);
        g.drawString("Hans",200 , 225);
        g.setColor(Color.cyan);
        g.fillRect(220, yHans, 50, hHans*2);

        //getallen lijn
        g.setColor(Color.black);
        g.drawString("0",  10, 200);
        g.drawString("20", 10, 185);
        g.drawString("40", 10, 165);
        g.drawString("60", 10, 145);
        g.drawString("80", 10, 125);
        g.drawString("100",10, 105);
        g.drawString("120",10, 85);
        g.drawString("140",10,65);
        g.drawString("160",10,45);
        g.drawString("180",10,25);
    }

    class ToonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int beginpunt = 200;


            hValerie = Integer.parseInt(valerie.getText());
            yValerie= beginpunt -hValerie*2;
            repaint();

            hJeroen = Integer.parseInt(jeroen.getText());
            yJeroen= beginpunt -hJeroen*2;
            repaint();

            hHans = Integer.parseInt(hans.getText());
            yHans= beginpunt -hHans*2;
            repaint();
        }
    }
}