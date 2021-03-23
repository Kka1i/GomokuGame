import java.awt.Color;
import java.awt.Graphics;

public class Circle {
	private int x;
	private int y;
	private int d;
	private Color color;
	
	public Circle(int x, int y, int d, Color color) {
		super();
		this.x = x;
		this.y = y;
		this.d = d;
		this.color = color;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getD() {
		return d;
	}
	public Color getC() {
		return color;
	}
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillOval(x, y, d, d);
	}
	
}
