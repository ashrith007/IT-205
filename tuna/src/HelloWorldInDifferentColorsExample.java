import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class HelloWorldInDifferentColorsExample extends Applet {

	public void paint(Graphics g) {

		Color c[] = { Color.blue, Color.cyan, Color.darkGray, Color.gray, Color.green, Color.lightGray, Color.magenta,
				Color.orange, Color.pink, Color.red, Color.white, Color.yellow };

		for (int i = 0; i < c.length; i++) {
			g.setColor(c[i]);
			g.drawString("Hello Ashrith", 20, 20 + (i * 20));
		}
	}
}
