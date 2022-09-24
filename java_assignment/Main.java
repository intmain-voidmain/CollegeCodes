package java_assignment;

import java.applet.Applet;
import java.awt.*;

/*<applet code="java_assignment/Main.class" width="600" height="600"></applet>*/

public class Main extends Applet{
    public void init() {
        setBackground(Color.BLACK);
        setForeground(Color.YELLOW);
        Label l1 = new Label("Branch"); 
        Label l2 = new Label("College");
        add(l1);
        add(l2);
    }
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(40, 100, 400, 100);
    }
}
