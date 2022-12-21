package Up7;

import java.applet.*; // пакет, содержащий класс Applet
import java.awt.*; // пакет, содержащий класс Graphics


public class MyApplet extends Applet {
// рисование апплета

    public void paint(Graphics g)
    {
        this.setSize(800, 800);
        g.drawLine(10, 0, 10, 800);
        g.drawLine(0, 400, 800, 400);
        for (int i=1; i<790;i++){
            g.drawLine(i+10, (int)(400-350*Math.cos(i*0.05)), i+11, (int)(400-350*Math.cos(0.05*(i+1))));
        }

        g.drawString("350*cos(i*0.05)", 15, 40);
    }
}