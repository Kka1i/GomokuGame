import javax.swing.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.LinkedList;
import java.util.List;

public class WuZiQi extends JPanel{
	final static int heigth = 1000;
	final static int width = 1000;
	private static JLabel label;
	private List<Circle> circles = new LinkedList<Circle>();
	
	public void addC(Circle circle) {
		circles.add(circle);
		this.repaint();
	}
	public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLACK);
			g.drawLine(50,50, 950,50);
			g.drawLine(950,50, 950,950);
			g.drawLine(50,50, 50,950);
			g.drawLine(50,950, 950,950);
			for(int i = 110; i <= 900; i = i + 60) {
				g.drawLine(i,50, i,950);
				g.drawLine(50, i, 950, i);
			}
			for(Circle c : circles) {
				c.draw(g);
			}
			//Cliker temp = new Cliker();
			//frame.getContentPane().addMouseListener(temp);
			//super.addMouseListener(temp);
			
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		WuZiQi k = new WuZiQi();
		label = new JLabel("ChessGameVersion 2.0");
		Cliker temp = new Cliker(k);
		frame.getContentPane().addMouseListener(temp);
		//CirclePanel temp = new CirclePanel();
		//frame.setContentPane(temp);
		//temp.addMouseListener(new Cliker(temp));
		frame.setTitle("Test");
		frame.setSize(heigth, width);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.add(k);
		k.add(label);
		k.setBackground(Color.GRAY);
		//panel.add(test2);
		
	}
	
	
	
}


