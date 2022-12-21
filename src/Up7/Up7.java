package Up7;

import javax.swing.*;
import java.awt.*;

class DrawingComponent extends JPanel {
    int xg[] =  Up7.x;
    int yg[] =  Up7.y;
    int ng = Up7.n;

    @Override
    protected void paintComponent(Graphics gh) {
        Graphics2D drp = (Graphics2D)gh;
        drp.drawLine(20, 340, 20, 20);
        drp.drawLine(20, 340, 460, 340);
        drp.drawPolyline(xg, yg, ng);

        for (int i=1; i<790;i++){

            drp.drawLine(i+10, (int)(400-350*Math.cos(i*0.05)), i+11, (int)(400-350*Math.cos(0.05*(i+1))));
        }
        drp.drawString("350*cos(i*0.05)", 15, 40);

    }
}

public class Up7 extends JFrame{
    public  static int x[] =  {50, 100, 150, 200, 250};
    public  static int y[] =  {80, 200, 150, 320, 100};
    public static int n = 5;

    public Up7 () {
        super("График по точкам");
        JPanel jcp = new JPanel(new BorderLayout());
        setContentPane(jcp);
        jcp.add(new DrawingComponent (), BorderLayout.CENTER);
        jcp.setBackground(Color.gray);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args)   {
        new Up7().setVisible(true);
    }
}