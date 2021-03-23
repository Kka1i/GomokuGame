import java.awt.Graphics;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JPanel;

public class CirclePanel extends JPanel{

	private List<Circle> circles = new LinkedList<Circle>();
	
	public void addC(Circle circle) {
		circles.add(circle);
	}
	
	public void paint(Graphics g) {
		for(Circle c : circles) {
			c.draw(g);
		}
	}
}
