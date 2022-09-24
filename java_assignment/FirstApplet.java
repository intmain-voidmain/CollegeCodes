package java_assignment;

import java.applet.Applet;
import java.awt.Graphics;

/*
<applet code="FirstApplet" width=200 height=60>
</applet>
*/

// HelloWorld class extends Applet
public class FirstApplet extends Applet
{
    // Overriding paint() method
    @Override
    public void paint(Graphics g)
    {
        g.drawString("Hello World", 20, 20);
    }
     
}