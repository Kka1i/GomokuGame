import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Cliker extends MouseAdapter{
	private static JFrame result = new JFrame();
	private static JPanel result1 = new JPanel();
	//private static JLabel result2 = new JLabel();
	
	private WuZiQi panel;
	//private List<Integer> placed = new ArrayList<Integer>();
	private int[][] placed = new int[15][15];
	int count = 0;
	Color color = Color.BLACK;
	int color2 = 1;
	public Cliker(WuZiQi panel) {
		super();
		this.panel = panel;
	}
	public void mouseClicked(MouseEvent e) {
		if(count % 2 == 1) {
			color = Color.WHITE;
			color2 = 2;
		}
		if(count % 2 == 0) {
			color = Color.BLACK;
			color2 = 1;
		}
		int x = e.getX();
		int y = e.getY();
		///////////////////////////////////////////////1
		if(x >= 50 && x <= 110 && y >= 50 && y <= 110 ) {
			if(placed[0][0] != 0) {
				
			}
			else {
				panel.addC(new Circle(55, 55, 50, color));
				count ++;
				placed[0][0] = color2;
			}
		}
		if(x >= 110 && x <= 170 && y >= 50 && y <= 110) {
			if(placed[0][1] != 0) {
				
			}
			else {
				panel.addC(new Circle(115, 55, 50, color));
				count ++;
				placed[0][1] = color2;
			}
		}
		if(x >= 170 && x <= 230 && y >= 50 && y <= 110) {
			if(placed[0][2] != 0) {
				
			}
			else {
				panel.addC(new Circle(175, 55, 50, color));
				count ++;
				placed[0][2] = color2;
			}
		}
		if(x >= 230 && x <= 290 && y >= 50 && y <= 110) {
			if(placed[0][3] != 0) {
			
			}
			else {
				panel.addC(new Circle(235, 55, 50, color));
				count ++;
				placed[0][3] = color2;
			}
		}
		if(x >= 290 && x <= 350 && y >= 50 && y <= 110) {
			if(placed[0][4] != 0) {
			
			}
			else {
				panel.addC(new Circle(295, 55, 50, color));
				count ++;
				placed[0][4] = color2;
			}
		}
		if(x >= 350 && x <= 410 && y >= 50 && y <= 110) {
			if(placed[0][5] != 0) {
				
			}
			else {
				panel.addC(new Circle(355, 55, 50, color));
				count ++;
				placed[0][5] = color2;
			}
		}
		if(x >= 410 && x <= 470 && y >= 50 && y <= 110) {
			if(placed[0][6] != 0) {
				
			}
			else {
				panel.addC(new Circle(415, 55, 50, color));
				count ++;
				placed[0][6] = color2;
			}
		}
		if(x >= 470 && x <= 530 && y >= 50 && y <= 110) {
			if(placed[0][7] != 0) {
				
			}
			else {
				panel.addC(new Circle(475, 55, 50, color));
				count ++;
				placed[0][7] = color2;
			}
		}
		if(x >= 530 && x <= 590 && y >= 50 && y <= 110) {
			if(placed[0][8] != 0) {
				
			}
			else {
				panel.addC(new Circle(535, 55, 50, color));
				count ++;
				placed[0][8] = color2;
			}
		}
		if(x >= 590 && x <= 650 && y >= 50 && y <= 110) {
			if(placed[0][9] != 0 ) {
				
			}
			else {
				panel.addC(new Circle(595, 55, 50, color));
				count ++;
				placed[0][9] = color2;
			}
		}
		if(x >= 650 && x <= 710 && y >= 50 && y <= 110) {
			if(placed[0][10] != 0) {
				
			}
			else {
				panel.addC(new Circle(655, 55, 50, color));
				count ++;
				placed[0][10] = color2;
			}
		}
		if(x >= 710 && x <= 770 && y >= 50 && y <= 110) {
			if(placed[0][11] != 0) {
				
			}
			else {
				panel.addC(new Circle(715, 55, 50, color));
				count ++;
				placed[0][11] = color2;
			}
		}
		if(x >= 770 && x <= 830 && y >= 50 && y <= 110) {
			if(placed[0][12] != 0) {
				
			}
			else {
				panel.addC(new Circle(775, 55, 50, color));
				count ++;
				placed[0][12] = color2;
			}
		}
		if(x >= 830 && x <= 890 && y >= 50 && y <= 110) {
			if(placed[0][13] != 0) {
				
			}
			else {
				panel.addC(new Circle(835, 55, 50, color));
				count ++;
				placed[0][13] = color2;
			}
		}
		if(x >= 890 && x <= 950 && y >= 50 && y <= 110) {
			if(placed[0][14] != 0) {
				
			}
			else {
				panel.addC(new Circle(895, 55, 50, color));
				count ++;
				placed[0][14] = color2;
			}
		}
		
		///////////////////////////////////////////////2
		if(x >= 50 && x <= 110 && y >= 110 && y <= 170) {
			if(placed[2][0] != 0) {
				
			}
			else {
			panel.addC(new Circle(55, 115, 50, color));
			count ++;
			placed[1][0] = color2;
		}
		}
		if(x >= 110 && x <= 170 && y >= 110 && y <= 170) {
			if(placed[1][1] != 0) {
				
			}
			else {
			panel.addC(new Circle(115, 115, 50, color));
			count ++;
			placed[1][1] = color2;
		}
		}
		if(x >= 170 && x <= 230 && y >= 110 && y <= 170) {
			if(placed[1][2] != 0) {
				
			}
			else {
			panel.addC(new Circle(175, 115, 50, color));
			count ++;
			placed[1][2] = color2;
		}
		}
		if(x >= 230 && x <= 290 && y >= 110 && y <= 170) {
			if(placed[1][3] != 0) {
				
			}
			else {
			panel.addC(new Circle(235, 115, 50, color));
			count ++;
			placed[1][3] = color2;
		}
		}
		if(x >= 290 && x <= 350 && y >= 110 && y <= 170) {
			if(placed[1][4] != 0) {
				
			}
			else {
			panel.addC(new Circle(295, 115, 50, color));
			count ++;
			placed[1][4] = color2;
		}
		}
		if(x >= 350 && x <= 410 && y >= 110 && y <= 170) {
			if(placed[1][5] != 0) {
				
			}
			else {
			panel.addC(new Circle(355, 115, 50, color));
			count ++;
			placed[1][5] = color2;
		}
		}
		if(x >= 410 && x <= 470 && y >= 110 && y <= 170) {
			if(placed[1][6] != 0) {
				
			}
			else {
			panel.addC(new Circle(415, 115, 50, color));
			count ++;
			placed[1][6] = color2;
		}
		}
		if(x >= 470 && x <= 530 && y >= 110 && y <= 170) {
			if(placed[1][7] != 0) {
				
			}
			else {
			panel.addC(new Circle(475, 115, 50, color));
			count ++;
			placed[1][7] = color2;
		}
		}
		if(x >= 530 && x <= 590 && y >= 110 && y <= 170) {
			if(placed[1][8] != 0) {
				
			}
			else {
			panel.addC(new Circle(535, 115, 50, color));
			count ++;
			placed[1][8] = color2;
		}
		}
		if(x >= 590 && x <= 650 && y >= 110 && y <= 170) {
			if(placed[1][9] != 0) {
				
			}
			else {
			panel.addC(new Circle(595, 115, 50, color));
			count ++;
			placed[1][9] = color2;
		}
		}
		if(x >= 650 && x <= 710 && y >= 110 && y <= 170) {
			if(placed[1][10] != 0) {
				
			}
			else {
			panel.addC(new Circle(655, 115, 50, color));
			count ++;
			placed[1][10] = color2;
		}
		}
		if(x >= 710 && x <= 770 && y >= 110 && y <= 170) {
			if(placed[1][11] != 0) {
				
			}
			else {
			panel.addC(new Circle(715, 115, 50, color));
			count ++;
			placed[1][11] = color2;
		}
		}
		if(x >= 770 && x <= 830 && y >= 110 && y <= 170) {
			if(placed[1][12] != 0) {
				
			}
			else {
			panel.addC(new Circle(775, 115, 50, color));
			count ++;
			placed[1][12] = color2;
		}
		}
		if(x >= 830 && x <= 890 && y >= 110 && y <= 170) {
			if(placed[1][13] != 0) {
				
			}
			else {
			panel.addC(new Circle(835, 115, 50, color));
			count ++;
			placed[1][13] = color2;
		}
		}
		if(x >= 890 && x <= 950 && y >= 110 && y <= 170) {
			if(placed[1][14] != 0) {
				
			}
			else {
			panel.addC(new Circle(895, 115, 50, color));
			count ++;
			placed[1][14] = color2;
		}
		}
		
		///////////////////////////////////////////////3
		if(x >= 50 && x <= 110 && y >= 170 && y <= 230) {
			if(placed[2][0] != 0) {
				
			}
			else {
			panel.addC(new Circle(55, 175, 50, color));
			count ++;
			placed[2][0] = color2;
		}
		}
		if(x >= 110 && x <= 170 && y >= 170 && y <= 230) {
			if(placed[2][1] != 0) {
				
			}
			else {
			panel.addC(new Circle(115, 175, 50, color));
			count ++;
			placed[2][1] = color2;
		}
		}
		if(x >= 170 && x <= 230 && y >= 170 && y <= 230) {
			if(placed[2][2] != 0) {
				
			}
			else {
			panel.addC(new Circle(175, 175, 50, color));
			count ++;
			placed[2][2] = color2;
		}
		}
		if(x >= 230 && x <= 290 && y >= 170 && y <= 230) {
			if(placed[2][3] != 0) {
				
			}
			else {
			panel.addC(new Circle(235, 175, 50, color));
			count ++;
			placed[2][3] = color2;
		}
		}
		if(x >= 290 && x <= 350 && y >= 170 && y <= 230) {
			if(placed[2][4] != 0) {
				
			}
			else {
			panel.addC(new Circle(295, 175, 50, color));
			count ++;
			placed[2][4] = color2;
		}
		}
		if(x >= 350 && x <= 410 && y >= 170 && y <= 230) {
			if(placed[2][5] != 0) {
				
			}
			else {
			panel.addC(new Circle(355, 175, 50, color));
			count ++;
			placed[2][5] = color2;
		}
		}
		if(x >= 410 && x <= 470 && y >= 170 && y <= 230) {
			if(placed[2][6] != 0) {
				
			}
			else {
			panel.addC(new Circle(415, 175, 50, color));
			count ++;
			placed[2][6] = color2;
		}
		}
		if(x >= 470 && x <= 530 && y >= 170 && y <= 230) {
			if(placed[2][7] != 0) {
				
			}
			else {
			panel.addC(new Circle(475, 175, 50, color));
			count ++;
			placed[2][7] = color2;
		}
		}
		if(x >= 530 && x <= 590 && y >= 170 && y <= 230) {
			if(placed[2][8] != 0) {
				
			}
			else {
			panel.addC(new Circle(535, 175, 50, color));
			count ++;
			placed[2][8] = color2;
		}
		}
		if(x >= 590 && x <= 650 && y >= 170 && y <= 230) {
			if(placed[2][9] != 0) {
				
			}
			else {
			panel.addC(new Circle(595, 175, 50, color));
			count ++;
			placed[2][9] = color2;
		}
		}
		if(x >= 650 && x <= 710 && y >= 170 && y <= 230) {
			if(placed[2][10] != 0) {
				
			}
			else {
			panel.addC(new Circle(655, 175, 50, color));
			count ++;
			placed[2][10] = color2;
		}
		}
		if(x >= 710 && x <= 770 && y >= 170 && y <= 230) {
			if(placed[2][11] != 0) {
				
			}
			else {
			panel.addC(new Circle(715, 175, 50, color));
			count ++;
			placed[2][11] = color2;
		}
		}
		if(x >= 770 && x <= 830 && y >= 170 && y <= 230) {
			if(placed[2][12] != 0) {
				
			}
			else {
			panel.addC(new Circle(775, 175, 50, color));
			count ++;
			placed[2][12] = color2;
		}
		}
		if(x >= 830 && x <= 890 && y >= 170 && y <= 230) {
			if(placed[2][13] != 0) {
				
			}
			else {
			panel.addC(new Circle(835, 175, 50, color));
			count ++;
			placed[2][13] = color2;
		}
		}
		if(x >= 890 && x <= 950 && y >= 170 && y <= 230) {
			if(placed[2][14] != 0) {
				
			}
			else {
			panel.addC(new Circle(895, 175, 50, color));
			count ++;
			placed[2][14] = color2;
		}
		}
		
		///////////////////////////////////////////////4
		if(x >= 50 && x <= 110 && y >= 230 && y <= 290) {
			if(placed[3][0] != 0) {
				
			}
			else {
			panel.addC(new Circle(55, 235, 50, color));
			count ++;
			placed[3][0] = color2;
		}
		}
		if(x >= 110 && x <= 170 && y >= 230 && y <= 290) {
			if(placed[3][1] != 0) {
				
			}
			else {
			panel.addC(new Circle(115, 235, 50, color));
			count ++;
			placed[3][1] = color2;
		}
		}
		if(x >= 170 && x <= 230 && y >= 230 && y <= 290) {
			if(placed[3][2] != 0) {
				
			}
			else {
			panel.addC(new Circle(175, 235, 50, color));
			count ++;
			placed[3][2] = color2;
		}
		}
		if(x >= 230 && x <= 290 && y >= 230 && y <= 290) {
			if(placed[3][3] != 0) {
				
			}
			else {
			panel.addC(new Circle(235, 235, 50, color));
			count ++;
			placed[3][3] = color2;
		}
		}
		if(x >= 290 && x <= 350 && y >= 230 && y <= 290) {
			if(placed[3][4] != 0) {
				
			}
			else {
			panel.addC(new Circle(295, 235, 50, color));
			count ++;
			placed[3][4] = color2;
		}
		}
		if(x >= 350 && x <= 410 && y >= 230 && y <= 290) {
			if(placed[3][5] != 0) {
				
			}
			else {
			panel.addC(new Circle(355, 235, 50, color));
			count ++;
			placed[3][5] = color2;
		}
		}
		if(x >= 410 && x <= 470 && y >= 230 && y <= 290) {
			if(placed[3][6] != 0) {
				
			}
			else {
			panel.addC(new Circle(415, 235, 50, color));
			count ++;
			placed[3][6] = color2;
		}
		}
		if(x >= 470 && x <= 530 && y >= 230 && y <= 290) {
			if(placed[3][7] != 0) {
				
			}
			else {
			panel.addC(new Circle(475, 235, 50, color));
			count ++;
			placed[3][7] = color2;
		}
		}
		if(x >= 530 && x <= 590 && y >= 230 && y <= 290) {
			if(placed[3][8] != 0) {
				
			}
			else {
			panel.addC(new Circle(535, 235, 50, color));
			count ++;
			placed[3][8] = color2;
		}
		}
		if(x >= 590 && x <= 650 && y >= 230 && y <= 290) {
			if(placed[3][9] != 0) {
				
			}
			else {
			panel.addC(new Circle(595, 235, 50, color));
			count ++;
			placed[3][9] = color2;
		}
		}
		if(x >= 650 && x <= 710 && y >= 230 && y <= 290) {
			if(placed[3][10] != 0) {
				
			}
			else {
			panel.addC(new Circle(655, 235, 50, color));
			count ++;
			placed[3][10] = color2;
		}
		}
		if(x >= 710 && x <= 770 && y >= 230 && y <= 290) {
			if(placed[3][11] != 0) {
				
			}
			else {
			panel.addC(new Circle(715, 235, 50, color));
			count ++;
			placed[3][11] = color2;
		}
		}
		if(x >= 770 && x <= 830 && y >= 230 && y <= 290) {
			if(placed[3][12] != 0) {
				
			}
			else {
			panel.addC(new Circle(775, 235, 50, color));
			count ++;
			placed[3][12] = color2;
		}
		}
		if(x >= 830 && x <= 890 && y >= 230 && y <= 290) {
			if(placed[3][13] != 0) {
				
			}
			else {
			panel.addC(new Circle(835, 235, 50, color));
			count ++;
			placed[3][13] = color2;
		}
		}
		if(x >= 890 && x <= 950 && y >= 230 && y <= 290) {
			if(placed[3][14] != 0) {
				
			}
			else {
			panel.addC(new Circle(895, 235, 50, color));
			count ++;
			placed[3][14] = color2;
		}
		}
		
		///////////////////////////////////////////////5
		if(x >= 50 && x <= 110 && y >= 290 && y <= 350) {
			if(placed[4][0] != 0) {
				
			}
			else {
			panel.addC(new Circle(55, 295, 50, color));
			count ++;
			placed[4][0] = color2;
		}
		}
		if(x >= 110 && x <= 170 && y >= 290 && y <= 350) {
			if(placed[4][1] != 0) {
				
			}
			else {
			panel.addC(new Circle(115, 295, 50, color));
			count ++;
			placed[4][1] = color2;
		}
		}
		if(x >= 170 && x <= 230 && y >= 290 && y <= 350) {
			if(placed[4][2] != 0) {
				
			}
			else {
			panel.addC(new Circle(175, 295, 50, color));
			count ++;
			placed[4][2] = color2;
		}
		}
		if(x >= 230 && x <= 290 && y >= 290 && y <= 350) {
			if(placed[4][3] != 0) {
				
			}
			else {
			panel.addC(new Circle(235, 295, 50, color));
			count ++;
			placed[4][3] = color2;
		}
		}
		if(x >= 290 && x <= 350 && y >= 290 && y <= 350) {
			if(placed[4][4] != 0) {
				
			}
			else {
			panel.addC(new Circle(295, 295, 50, color));
			count ++;
			placed[4][4] = color2;
		}
		}
		if(x >= 350 && x <= 410 && y >= 290 && y <= 350) {
			if(placed[4][5] != 0) {
				
			}
			else {
			panel.addC(new Circle(355, 295, 50, color));
			count ++;
			placed[4][5] = color2;
		}
		}
		if(x >= 410 && x <= 470 && y >= 290 && y <= 350) {
			if(placed[4][6] != 0) {
				
			}
			else {
			panel.addC(new Circle(415, 295, 50, color));
			count ++;
			placed[4][6] = color2;
		}
		}
		if(x >= 470 && x <= 530 && y >= 290 && y <= 350) {
			if(placed[4][7] != 0) {
				
			}
			else {
			panel.addC(new Circle(475, 295, 50, color));
			count ++;
			placed[4][7] = color2;
		}
		}
		if(x >= 530 && x <= 590 && y >= 290 && y <= 350) {
			if(placed[4][8] != 0) {
				
			}
			else {
			panel.addC(new Circle(535, 295, 50, color));
			count ++;
			placed[4][8] = color2;
		}
		}
		if(x >= 590 && x <= 650 && y >= 290 && y <= 350) {
			if(placed[4][9] != 0) {
				
			}
			else {
			panel.addC(new Circle(595, 295, 50, color));
			count ++;
			placed[4][9] = color2;
		}
		}
		if(x >= 650 && x <= 710 && y >= 290 && y <= 350) {
			if(placed[4][10] != 0) {
				
			}
			else {
			panel.addC(new Circle(655, 295, 50, color));
			count ++;
			placed[4][10] = color2;
		}
		}
		if(x >= 710 && x <= 770 && y >= 290 && y <= 350) {
			if(placed[4][11] != 0) {
				
			}
			else {
			panel.addC(new Circle(715, 295, 50, color));
			count ++;
			placed[4][11] = color2;
		}
		}
		if(x >= 770 && x <= 830 && y >= 290 && y <= 350) {
			if(placed[4][12] != 0) {
				
			}
			else {
			panel.addC(new Circle(775, 295, 50, color));
			count ++;
			placed[4][12] = color2;
		}
		}
		if(x >= 830 && x <= 890 && y >= 290 && y <= 350) {
			if(placed[4][13] != 0) {
				
			}
			else {
			panel.addC(new Circle(835, 295, 50, color));
			count ++;
			placed[4][13] = color2;
		}
		}
		if(x >= 890 && x <= 950 && y >= 290 && y <= 350) {
			if(placed[4][14] != 0) {
				
			}
			else {
			panel.addC(new Circle(895, 295, 50, color));
			count ++;
			placed[4][14] = color2;
		}
		}
		
		///////////////////////////////////////////////6
		if(x >= 50 && x <= 110 && y >= 350 && y <= 410) {
			if(placed[5][0] != 0) {
				
			}
			else {
			panel.addC(new Circle(55, 355, 50, color));
			count ++;
			placed[5][0] = color2;
		}
		}
		if(x >= 110 && x <= 170 && y >= 350 && y <= 410) {
			if(placed[5][1] != 0) {
				
			}
			else {
			panel.addC(new Circle(115, 355, 50, color));
			count ++;
			placed[5][1] = color2;
		}
		}
		if(x >= 170 && x <= 230 && y >= 350 && y <= 410) {
			if(placed[5][2] != 0) {
				
			}
			else {
			panel.addC(new Circle(175, 355, 50, color));
			count ++;
			placed[5][2] = color2;
		}
		}
		if(x >= 230 && x <= 290 && y >= 350 && y <= 410) {
			if(placed[5][3] != 0) {
				
			}
			else {
			panel.addC(new Circle(235, 355, 50, color));
			count ++;
			placed[5][3] = color2;
		}
		}
		if(x >= 290 && x <= 350 && y >= 350 && y <= 410) {
			if(placed[5][4] != 0) {
				
			}
			else {
			panel.addC(new Circle(295, 355, 50, color));
			count ++;
			placed[5][4] = color2;
		}
		}
		if(x >= 350 && x <= 410 && y >= 350 && y <= 410) {
			if(placed[5][5] != 0) {
				
			}
			else {
			panel.addC(new Circle(355, 355, 50, color));
			count ++;
			placed[5][5] = color2;
		}
		}
		if(x >= 410 && x <= 470 && y >= 350 && y <= 410) {
			if(placed[5][6] != 0) {
				
			}
			else {
			panel.addC(new Circle(415, 355, 50, color));
			count ++;
			placed[5][6] = color2;
		}
		}
		if(x >= 470 && x <= 530 && y >= 350 && y <= 410) {
			if(placed[5][7] != 0) {
				
			}
			else {
			panel.addC(new Circle(475, 355, 50, color));
			count ++;
			placed[5][7] = color2;
		}
		}
		if(x >= 530 && x <= 590 && y >= 350 && y <= 410) {
			if(placed[5][8] != 0) {
				
			}
			else {
			panel.addC(new Circle(535, 355, 50, color));
			count ++;
			placed[5][8] = color2;
		}
		}
		if(x >= 590 && x <= 650 && y >= 350 && y <= 410) {
			if(placed[5][9] != 0) {
				
			}
			else {
			panel.addC(new Circle(595, 355, 50, color));
			count ++;
			placed[5][9] = color2;
		}
		}
		if(x >= 650 && x <= 710 && y >= 350 && y <= 410) {
			if(placed[5][10] != 0) {
				
			}
			else {
			panel.addC(new Circle(655, 355, 50, color));
			count ++;
			placed[5][10] = color2;
		}
		}
		if(x >= 710 && x <= 770 && y >= 350 && y <= 410) {
			if(placed[5][11] != 0) {
				
			}
			else {
			panel.addC(new Circle(715, 355, 50, color));
			count ++;
			placed[5][11] = color2;
		}
		}
		if(x >= 770 && x <= 830 && y >= 350 && y <= 410) {
			if(placed[5][12] != 0) {
				
			}
			else {
			panel.addC(new Circle(775, 355, 50, color));
			count ++;
			placed[5][12] = color2;
		}
		}
		if(x >= 830 && x <= 890 && y >= 350 && y <= 410) {
			if(placed[5][13] != 0) {
				
			}
			else {
			panel.addC(new Circle(835, 355, 50, color));
			count ++;
			placed[5][13] = color2;
		}
		}
		if(x >= 890 && x <= 950 && y >= 350 && y <= 410) {
			if(placed[5][14] != 0) {
				
			}
			else {
			panel.addC(new Circle(895, 355, 50, color));
			count ++;
			placed[5][14] = color2;
		}
		}
		
		///////////////////////////////////////////////7
		if(x >= 50 && x <= 110 && y >= 410 && y <= 470) {
			if(placed[6][0] != 0) {
				
			}
			else {
			panel.addC(new Circle(55, 415, 50, color));
			count ++;
			placed[6][0] = color2;
		}
		}
		if(x >= 110 && x <= 170 && y >= 410 && y <= 470) {
			if(placed[6][1] != 0) {
				
			}
			else {
			panel.addC(new Circle(115, 415, 50, color));
			count ++;
			placed[6][1] = color2;
		}
		}
		if(x >= 170 && x <= 230 && y >= 410 && y <= 470) {
			if(placed[6][2] != 0) {
				
			}
			else {
			panel.addC(new Circle(175, 415, 50, color));
			count ++;
			placed[6][2] = color2;
		}
		}
		if(x >= 230 && x <= 290 && y >= 410 && y <= 470) {
			if(placed[6][3] != 0) {
				
			}
			else {
			panel.addC(new Circle(235, 415, 50, color));
			count ++;
			placed[6][3] = color2;
		}
		}
		if(x >= 290 && x <= 350 && y >= 410 && y <= 470) {
			if(placed[6][4] != 0) {
				
			}
			else {
			panel.addC(new Circle(295, 415, 50, color));
			count ++;
			placed[6][4] = color2;
		}
		}
		if(x >= 350 && x <= 410 && y >= 410 && y <= 470) {
			if(placed[6][5] != 0) {
				
			}
			else {
			panel.addC(new Circle(355, 415, 50, color));
			count ++;
			placed[6][5] = color2;
		}
		}
		if(x >= 410 && x <= 470 && y >= 410 && y <= 470) {
			if(placed[6][6] != 0) {
				
			}
			else {
			panel.addC(new Circle(415, 415, 50, color));
			count ++;
			placed[6][6] = color2;
		}
		}
		if(x >= 470 && x <= 530 && y >= 410 && y <= 470) {
			if(placed[6][7] != 0) {
				
			}
			else {
			panel.addC(new Circle(475, 415, 50, color));
			count ++;
			placed[6][7] = color2;
		}
		}
		if(x >= 530 && x <= 590 && y >= 410 && y <= 470) {
			if(placed[6][8] != 0) {
				
			}
			else {
			panel.addC(new Circle(535, 415, 50, color));
			count ++;
			placed[6][8] = color2;
		}
		}
		if(x >= 590 && x <= 650 && y >= 410 && y <= 470) {
			if(placed[6][9] != 0) {
				
			}
			else {
			panel.addC(new Circle(595, 415, 50, color));
			count ++;
			placed[6][9] = color2;
		}
		}
		if(x >= 650 && x <= 710 && y >= 410 && y <= 470) {
			if(placed[6][10] != 0) {
				
			}
			else {
			panel.addC(new Circle(655, 415, 50, color));
			count ++;
			placed[6][10] = color2;
		}
		}
		if(x >= 710 && x <= 770 && y >= 410 && y <= 470) {
			if(placed[6][11] != 0) {
				
			}
			else {
			panel.addC(new Circle(715, 415, 50, color));
			count ++;
			placed[6][11] = color2;
		}
		}
		if(x >= 770 && x <= 830 && y >= 410 && y <= 470) {
			if(placed[6][12] != 0) {
				
			}
			else {
			panel.addC(new Circle(775, 415, 50, color));
			count ++;
			placed[6][12] = color2;
		}
		}
		if(x >= 830 && x <= 890 && y >= 410 && y <= 470) {
			if(placed[6][13] != 0) {
				
			}
			else {
			panel.addC(new Circle(835, 415, 50, color));
			count ++;
			placed[6][13] = color2;
		}
		}
		if(x >= 890 && x <= 950 && y >= 410 && y <= 470) {
			if(placed[6][14] != 0) {
				
			}
			else {
			panel.addC(new Circle(895, 415, 50, color));
			count ++;
			placed[6][14] = color2;
		}
		}
		
		///////////////////////////////////////////////8
		if(x >= 50 && x <= 110 && y >= 470 && y <= 530) {
			if(placed[7][0] != 0) {
				
			}
			else {
			panel.addC(new Circle(55, 475, 50, color));
			count ++;
			placed[7][0] = color2;
		}
		}
		if(x >= 110 && x <= 170 && y >= 470 && y <= 530) {
			if(placed[7][1] != 0) {
				
			}
			else {
			panel.addC(new Circle(115, 475, 50, color));
			count ++;
			placed[7][1] = color2;
		}
		}
		if(x >= 170 && x <= 230 && y >= 470 && y <= 530) {
			if(placed[7][2] != 0) {
				
			}
			else {
			panel.addC(new Circle(175, 475, 50, color));
			count ++;
			placed[7][2] = color2;
		}
		}
		if(x >= 230 && x <= 290 && y >= 470 && y <= 530) {
			if(placed[7][3] != 0) {
				
			}
			else {
			panel.addC(new Circle(235, 475, 50, color));
			count ++;
			placed[7][3] = color2;
		}
		}
		if(x >= 290 && x <= 350 && y >= 470 && y <= 530) {
			if(placed[7][4] != 0) {
				
			}
			else {
			panel.addC(new Circle(295, 475, 50, color));
			count ++;
			placed[7][4] = color2;
		}
		}
		if(x >= 350 && x <= 410 && y >= 470 && y <= 530) {
			if(placed[7][5] != 0) {
				
			}
			else {
			panel.addC(new Circle(355, 475, 50, color));
			count ++;
			placed[7][5] = color2;
		}
		}
		if(x >= 410 && x <= 470 && y >= 470 && y <= 530) {
			if(placed[7][6] != 0) {
				
			}
			else {
			panel.addC(new Circle(415, 475, 50, color));
			count ++;
			placed[7][6] = color2;
		}
		}
		if(x >= 470 && x <= 530 && y >= 470 && y <= 530) {
			if(placed[7][7] != 0) {
				
			}
			else {
			panel.addC(new Circle(475, 475, 50, color));
			count ++;
			placed[7][7] = color2;
		}
		}
		if(x >= 530 && x <= 590 && y >= 470 && y <= 530) {
			if(placed[7][8] != 0) {
				
			}
			else {
			panel.addC(new Circle(535, 475, 50, color));
			count ++;
			placed[7][8] = color2;
		}
		}
		if(x >= 590 && x <= 650 && y >= 470 && y <= 530) {
			if(placed[7][9] != 0) {
				
			}
			else {
			panel.addC(new Circle(595, 475, 50, color));
			count ++;
			placed[7][9] = color2;
		}
		}
		if(x >= 650 && x <= 710 && y >= 470 && y <= 530) {
			if(placed[7][10] != 0) {
				
			}
			else {
			panel.addC(new Circle(655, 475, 50, color));
			count ++;
			placed[7][10] = color2;
		}
		}
		if(x >= 710 && x <= 770 && y >= 470 && y <= 530) {
			if(placed[7][11] != 0) {
				
			}
			else {
			panel.addC(new Circle(715, 475, 50, color));
			count ++;
			placed[7][11] = color2;
		}
		}
		if(x >= 770 && x <= 830 && y >= 470 && y <= 530) {
			if(placed[7][12] != 0) {
				
			}
			else {
			panel.addC(new Circle(775, 475, 50, color));
			count ++;
			placed[7][12] = color2;
		}
		}
		if(x >= 830 && x <= 890 && y >= 470 && y <= 530) {
			if(placed[7][13] != 0) {
				
			}
			else {
			panel.addC(new Circle(835, 475, 50, color));
			count ++;
			placed[7][13] = color2;
		}
		}
		if(x >= 890 && x <= 950 && y >= 470 && y <= 530) {
			if(placed[7][14] != 0) {
				
			}
			else {
			panel.addC(new Circle(895, 475, 50, color));
			count ++;
			placed[7][14] = color2;
		}
		}
		
		///////////////////////////////////////////////9
		if(x >= 50 && x <= 110 && y >= 530 && y <= 590) {
			if(placed[8][0] != 0) {
				
			}
			else {
			panel.addC(new Circle(55, 535, 50, color));
			count ++;
			placed[8][0] = color2;
		}
		}
		if(x >= 110 && x <= 170 && y >= 530 && y <= 590) {
			if(placed[8][1] != 0) {
				
			}
			else {
			panel.addC(new Circle(115, 535, 50, color));
			count ++;
			placed[8][1] = color2;
		}
		}
		if(x >= 170 && x <= 230 && y >= 530 && y <= 590) {
			if(placed[8][2] != 0) {
				
			}
			else {
			panel.addC(new Circle(175, 535, 50, color));
			count ++;
			placed[8][2] = color2;
		}
		}
		if(x >= 230 && x <= 290 && y >= 530 && y <= 590) {
			if(placed[8][3] != 0) {
				
			}
			else {
			panel.addC(new Circle(235, 535, 50, color));
			count ++;
			placed[8][3] = color2;
		}
		}
		if(x >= 290 && x <= 350 && y >= 530 && y <= 590) {
			if(placed[8][4] != 0) {
				
			}
			else {
			panel.addC(new Circle(295, 535, 50, color));
			count ++;
			placed[8][4] = color2;
		}
		}
		if(x >= 350 && x <= 410 && y >= 530 && y <= 590) {
			if(placed[8][5] != 0) {
				
			}
			else {
			panel.addC(new Circle(355, 535, 50, color));
			count ++;
			placed[8][5] = color2;
		}
		}
		if(x >= 410 && x <= 470 && y >= 530 && y <= 590) {
			if(placed[8][6] != 0) {
				
			}
			else {
			panel.addC(new Circle(415, 535, 50, color));
			count ++;
			placed[8][6] = color2;
		}
		}
		if(x >= 470 && x <= 530 && y >= 530 && y <= 590) {
			if(placed[8][7] != 0) {
				
			}
			else {
			panel.addC(new Circle(475, 535, 50, color));
			count ++;
			placed[8][7] = color2;
		}
		}
		if(x >= 530 && x <= 590 && y >= 530 && y <= 590) {
			if(placed[8][8] != 0) {
				
			}
			else {
			panel.addC(new Circle(535, 535, 50, color));
			count ++;
			placed[8][8] = color2;
		}
		}
		if(x >= 590 && x <= 650 && y >= 530 && y <= 590) {
			if(placed[8][9] != 0) {
				
			}
			else {
			panel.addC(new Circle(595, 535, 50, color));
			count ++;
			placed[8][9] = color2;
		}
		}
		if(x >= 650 && x <= 710 && y >= 530 && y <= 590) {
			if(placed[8][10] != 0) {
				
			}
			else {
			panel.addC(new Circle(655, 535, 50, color));
			count ++;
			placed[8][10] = color2;
		}
		}
		if(x >= 710 && x <= 770 && y >= 530 && y <= 590) {
			if(placed[8][11] != 0) {
				
			}
			else {
			panel.addC(new Circle(715, 535, 50, color));
			count ++;
			placed[8][11] = color2;
		}
		}
		if(x >= 770 && x <= 830 && y >= 530 && y <= 590) {
			if(placed[8][12] != 0) {
				
			}
			else {
			panel.addC(new Circle(775, 535, 50, color));
			count ++;
			placed[8][12] = color2;
		}
		}
		if(x >= 830 && x <= 890 && y >= 530 && y <= 590) {
			if(placed[8][13] != 0) {
				
			}
			else {
			panel.addC(new Circle(835, 535, 50, color));
			count ++;
			placed[8][13] = color2;
		}
		}
		if(x >= 890 && x <= 950 && y >= 530 && y <= 590) {
			if(placed[8][14] != 0) {
				
			}
			else {
			panel.addC(new Circle(895, 535, 50, color));
			count ++;
			placed[8][14] = color2;
		}
		}
		
		///////////////////////////////////////////////10
		if(x >= 50 && x <= 110 && y >= 590 && y <= 650) {
			if(placed[9][0] != 0) {
				
			}
			else {
			panel.addC(new Circle(55, 595, 50, color));
			count ++;
			placed[9][0] = color2;
		}
		}
		if(x >= 110 && x <= 170 && y >= 590 && y <= 650) {
			if(placed[9][1] != 0) {
				
			}
			else {
			panel.addC(new Circle(115, 595, 50, color));
			count ++;
			placed[9][1] = color2;
		}
		}
		if(x >= 170 && x <= 230 && y >= 590 && y <= 650) {
			if(placed[9][2] != 0) {
				
			}
			else {
			panel.addC(new Circle(175, 595, 50, color));
			count ++;
			placed[9][2] = color2;
		}
		}
		if(x >= 230 && x <= 290 && y >= 590 && y <= 650) {
			if(placed[9][3] != 0) {
				
			}
			else {
			panel.addC(new Circle(235, 595, 50, color));
			count ++;
			placed[9][3] = color2;
		}
		}
		if(x >= 290 && x <= 350 && y >= 590 && y <= 650) {
			if(placed[9][4] != 0) {
				
			}
			else {
			panel.addC(new Circle(295, 595, 50, color));
			count ++;
			placed[9][4] = color2;
		}
		}
		if(x >= 350 && x <= 410 && y >= 590 && y <= 650) {
			if(placed[9][5] != 0) {
				
			}
			else {
			panel.addC(new Circle(355, 595, 50, color));
			count ++;
			placed[9][5] = color2;
		}
		}
		if(x >= 410 && x <= 470 && y >= 590 && y <= 650) {
			if(placed[9][6] != 0) {
				
			}
			else {
			panel.addC(new Circle(415, 595, 50, color));
			count ++;
			placed[9][6] = color2;
		}
		}
		if(x >= 470 && x <= 530 && y >= 590 && y <= 650) {
			if(placed[9][7] != 0) {
				
			}
			else {
			panel.addC(new Circle(475, 595, 50, color));
			count ++;
			placed[9][7] = color2;
		}
		}
		if(x >= 530 && x <= 590 && y >= 590 && y <= 650) {
			if(placed[9][8] != 0) {
				
			}
			else {
			panel.addC(new Circle(535, 595, 50, color));
			count ++;
			placed[9][8] = color2;
		}
		}
		if(x >= 590 && x <= 650 && y >= 590 && y <= 650) {
			if(placed[9][9] != 0) {
				
			}
			else {
			panel.addC(new Circle(595, 595, 50, color));
			count ++;
			placed[9][9] = color2;
		}
		}
		if(x >= 650 && x <= 710 && y >= 590 && y <= 650) {
			if(placed[9][10] != 0) {
				
			}
			else {
			panel.addC(new Circle(655, 595, 50, color));
			count ++;
			placed[9][10] = color2;
		}
		}
		if(x >= 710 && x <= 770 && y >= 590 && y <= 650) {
			if(placed[9][11] != 0) {
				
			}
			else {
			panel.addC(new Circle(715, 595, 50, color));
			count ++;
			placed[9][11] = color2;
		}
		}
		if(x >= 770 && x <= 830 && y >= 590 && y <= 650) {
			if(placed[9][12] != 0) {
				
			}
			else {
			panel.addC(new Circle(775, 595, 50, color));
			count ++;
			placed[9][12] = color2;
		}
		}
		if(x >= 830 && x <= 890 && y >= 590 && y <= 650) {
			if(placed[9][13] != 0) {
				
			}
			else {
			panel.addC(new Circle(835, 595, 50, color));
			count ++;
			placed[9][13] = color2;
		}
		}
		if(x >= 890 && x <= 950 && y >= 590 && y <= 650) {
			if(placed[9][14] != 0) {
				
			}
			else {
			panel.addC(new Circle(895, 595, 50, color));
			count ++;
			placed[9][14] = color2;
		}
		}
		
		///////////////////////////////////////////////11
		if(x >= 50 && x <= 110 && y >= 650 && y <= 710) {
			if(placed[10][0] != 0) {
				
			}
			else {
			panel.addC(new Circle(55, 655, 50, color));
			count ++;
			placed[10][0] = color2;
		}
		}
		if(x >= 110 && x <= 170 && y >= 650 && y <= 710) {
			if(placed[10][1] != 0) {
				
			}
			else {
			panel.addC(new Circle(115, 655, 50, color));
			count ++;
			placed[10][1] = color2;
		}
		}
		if(x >= 170 && x <= 230 && y >= 650 && y <= 710) {
			if(placed[10][2] != 0) {
				
			}
			else {
			panel.addC(new Circle(175, 655, 50, color));
			count ++;
			placed[10][2] = color2;
		}
		}
		if(x >= 230 && x <= 290 && y >= 650 && y <= 710) {
			if(placed[10][3] != 0) {
				
			}
			else {
			panel.addC(new Circle(235, 655, 50, color));
			count ++;
			placed[10][3] = color2;
		}
		}
		if(x >= 290 && x <= 350 && y >= 650 && y <= 710) {
			if(placed[10][4] != 0) {
				
			}
			else {
			panel.addC(new Circle(295, 655, 50, color));
			count ++;
			placed[10][4] = color2;
		}
		}
		if(x >= 350 && x <= 410 && y >= 650 && y <= 710) {
			if(placed[10][5] != 0) {
				
			}
			else {
			panel.addC(new Circle(355, 655, 50, color));
			count ++;
			placed[10][5] = color2;
		}
		}
		if(x >= 410 && x <= 470 && y >= 650 && y <= 710) {
			if(placed[10][6] != 0) {
				
			}
			else {
			panel.addC(new Circle(415, 655, 50, color));
			count ++;
			placed[10][6] = color2;
		}
		}
		if(x >= 470 && x <= 530 && y >= 650 && y <= 710) {
			if(placed[10][7] != 0) {
				
			}
			else {
			panel.addC(new Circle(475, 655, 50, color));
			count ++;
			placed[10][7] = color2;
		}
		}
		if(x >= 530 && x <= 590 && y >= 650 && y <= 710) {
			if(placed[10][8] != 0) {
				
			}
			else {
			panel.addC(new Circle(535, 655, 50, color));
			count ++;
			placed[10][8] = color2;
		}
		}
		if(x >= 590 && x <= 650 && y >= 650 && y <= 710) {
			if(placed[10][9] != 0) {
				
			}
			else {
			panel.addC(new Circle(595, 655, 50, color));
			count ++;
			placed[10][9] = color2;
		}
		}
		if(x >= 650 && x <= 710 && y >= 650 && y <= 710) {
			if(placed[10][10] != 0) {
				
			}
			else {
			panel.addC(new Circle(655, 655, 50, color));
			count ++;
			placed[10][10] = color2;
		}
		}
		if(x >= 710 && x <= 770 && y >= 650 && y <= 710) {
			if(placed[10][11] != 0) {
				
			}
			else {
			panel.addC(new Circle(715, 655, 50, color));
			count ++;
			placed[10][11] = color2;
		}
		}
		if(x >= 770 && x <= 830 && y >= 650 && y <= 710) {
			if(placed[10][12] != 0) {
				
			}
			else {
			panel.addC(new Circle(775, 655, 50, color));
			count ++;
			placed[10][12] = color2;
		}
		}
		if(x >= 830 && x <= 890 && y >= 650 && y <= 710) {
			if(placed[10][13] != 0) {
				
			}
			else {
			panel.addC(new Circle(835, 655, 50, color));
			count ++;
			placed[10][13] = color2;
		}
		}
		if(x >= 890 && x <= 950 && y >= 650 && y <= 710) {
			if(placed[10][14] != 0) {
				
			}
			else {
			panel.addC(new Circle(895, 655, 50, color));
			count ++;
			placed[10][14] = color2;
		}
		}
		
		///////////////////////////////////////////////12
		if(x >= 50 && x <= 110 && y >= 710 && y <= 770) {
			if(placed[11][0] != 0) {
				
			}
			else {
			panel.addC(new Circle(55, 715, 50, color));
			count ++;
			placed[11][0] = color2;
		}
		}
		if(x >= 110 && x <= 170 && y >= 710 && y <= 770) {
			if(placed[11][1] != 0) {
				
			}
			else {
			panel.addC(new Circle(115, 715, 50, color));
			count ++;
			placed[11][1] = color2;
		}
		}
		if(x >= 170 && x <= 230 && y >= 710 && y <= 770) {
			if(placed[11][2] != 0) {
				
			}
			else {
			panel.addC(new Circle(175, 715, 50, color));
			count ++;
			placed[11][2] = color2;
		}
		}
		if(x >= 230 && x <= 290 && y >= 710 && y <= 770) {
			if(placed[11][3] != 0) {
				
			}
			else {
			panel.addC(new Circle(235, 715, 50, color));
			count ++;
			placed[11][3] = color2;
		}
		}
		if(x >= 290 && x <= 350 && y >= 710 && y <= 770) {
			if(placed[11][4] != 0) {
				
			}
			else {
			panel.addC(new Circle(295, 715, 50, color));
			count ++;
			placed[11][4] = color2;
		}
		}
		if(x >= 350 && x <= 410 && y >= 710 && y <= 770) {
			if(placed[11][5] != 0) {
				
			}
			else {
			panel.addC(new Circle(355, 715, 50, color));
			count ++;
			placed[11][5] = color2;
		}
		}
		if(x >= 410 && x <= 470 && y >= 710 && y <= 770) {
			if(placed[11][6] != 0) {
				
			}
			else {
			panel.addC(new Circle(415, 715, 50, color));
			count ++;
			placed[11][6] = color2;
		}
		}
		if(x >= 470 && x <= 530 && y >= 710 && y <= 770) {
			if(placed[11][7] != 0) {
				
			}
			else {
			panel.addC(new Circle(475, 715, 50, color));
			count ++;
			placed[11][7] = color2;
		}
		}
		if(x >= 530 && x <= 590 && y >= 710 && y <= 770) {
			if(placed[11][8] != 0) {
				
			}
			else {
			panel.addC(new Circle(535, 715, 50, color));
			count ++;
			placed[11][8] = color2;
		}
		}
		if(x >= 590 && x <= 650 && y >= 710 && y <= 770) {
			if(placed[11][9] != 0) {
				
			}
			else {
			panel.addC(new Circle(595, 715, 50, color));
			count ++;
			placed[11][9] = color2;
		}
		}
		if(x >= 650 && x <= 710 && y >= 710 && y <= 770) {
			if(placed[11][10] != 0) {
				
			}
			else {
			panel.addC(new Circle(655, 715, 50, color));
			count ++;
			placed[11][10] = color2;
		}
		}
		if(x >= 710 && x <= 770 && y >= 710 && y <= 770) {
			if(placed[11][11] != 0) {
				
			}
			else {
			panel.addC(new Circle(715, 715, 50, color));
			count ++;
			placed[11][11] = color2;
		}
		}
		if(x >= 770 && x <= 830 && y >= 710 && y <= 770) {
			if(placed[11][12] != 0) {
				
			}
			else {
			panel.addC(new Circle(775, 715, 50, color));
			count ++;
			placed[11][12] = color2;
		}
		}
		if(x >= 830 && x <= 890 && y >= 710 && y <= 770) {
			if(placed[11][13] != 0) {
				
			}
			else {
			panel.addC(new Circle(835, 715, 50, color));
			count ++;
			placed[11][13] = color2;
		}
		}
		if(x >= 890 && x <= 950 && y >= 710 && y <= 770) {
			if(placed[11][14] != 0) {
				
			}
			else {
			panel.addC(new Circle(895, 715, 50, color));
			count ++;
			placed[11][14] = color2;
		}
		}
		
		///////////////////////////////////////////////13
		if(x >= 50 && x <= 110 && y >= 770 && y <= 830) {
			if(placed[12][0] != 0) {
				
			}
			else {
			panel.addC(new Circle(55, 775, 50, color));
			count ++;
			placed[12][0] = color2;
		}
		}
		if(x >= 110 && x <= 170 && y >= 770 && y <= 830) {
			if(placed[12][1] != 0) {
				
			}
			else {
			panel.addC(new Circle(115, 775, 50, color));
			count ++;
			placed[12][1] = color2;
		}
		}
		if(x >= 170 && x <= 230 && y >= 770 && y <= 830) {
			if(placed[12][2] != 0) {
				
			}
			else {
			panel.addC(new Circle(175, 775, 50, color));
			count ++;
			placed[12][2] = color2;
		}
		}
		if(x >= 230 && x <= 290 && y >= 770 && y <= 830) {
			if(placed[12][3] != 0) {
				
			}
			else {
			panel.addC(new Circle(235, 775, 50, color));
			count ++;
			placed[12][3] = color2;
		}
		}
		if(x >= 290 && x <= 350 && y >= 770 && y <= 830) {
			if(placed[12][4] != 0) {
				
			}
			else {
			panel.addC(new Circle(295, 775, 50, color));
			count ++;
			placed[12][4] = color2;
		}
		}
		if(x >= 350 && x <= 410 && y >= 770 && y <= 830) {
			if(placed[12][5] != 0) {
				
			}
			else {
			panel.addC(new Circle(355, 775, 50, color));
			count ++;
			placed[12][5] = color2;
		}
		}
		if(x >= 410 && x <= 470 && y >= 770 && y <= 830) {
			if(placed[12][6] != 0) {
				
			}
			else {
			panel.addC(new Circle(415, 775, 50, color));
			count ++;
			placed[12][6] = color2;
		}
		}
		if(x >= 470 && x <= 530 && y >= 770 && y <= 830) {
			if(placed[12][7] != 0) {
				
			}
			else {
			panel.addC(new Circle(475, 775, 50, color));
			count ++;
			placed[12][7] = color2;
		}
		}
		if(x >= 530 && x <= 590 && y >= 770 && y <= 830) {
			if(placed[12][8] != 0) {
				
			}
			else {
			panel.addC(new Circle(535, 775, 50, color));
			count ++;
			placed[12][8] = color2;
		}
		}
		if(x >= 590 && x <= 650 && y >= 770 && y <= 830) {
			if(placed[12][9] != 0) {
				
			}
			else {
			panel.addC(new Circle(595, 775, 50, color));
			count ++;
			placed[12][9] = color2;
		}
		}
		if(x >= 650 && x <= 710 && y >= 770 && y <= 830) {
			if(placed[12][10] != 0) {
				
			}
			else {
			panel.addC(new Circle(655, 775, 50, color));
			count ++;
			placed[12][10] = color2;
		}
		}
		if(x >= 710 && x <= 770 && y >= 770 && y <= 830) {
			if(placed[12][11] != 0) {
				
			}
			else {
			panel.addC(new Circle(715, 775, 50, color));
			count ++;
			placed[12][11] = color2;
		}
		}
		if(x >= 770 && x <= 830 && y >= 770 && y <= 830) {
			if(placed[12][12] != 0) {
				
			}
			else {
			panel.addC(new Circle(775, 775, 50, color));
			count ++;
			placed[12][12] = color2;
		}
		}
		if(x >= 830 && x <= 890 && y >= 770 && y <= 830) {
			if(placed[12][13] != 0) {
				
			}
			else {
			panel.addC(new Circle(835, 775, 50, color));
			count ++;
			placed[12][13] = color2;
		}
		}
		if(x >= 890 && x <= 950 && y >= 770 && y <= 830) {
			if(placed[12][14] != 0) {
				
			}
			else {
			panel.addC(new Circle(895, 775, 50, color));
			count ++;
			placed[12][14] = color2;
		}
		}
		
		///////////////////////////////////////////////14
		if(x >= 50 && x <= 110 && y >= 830 && y <= 890) {
			if(placed[13][0] != 0) {
				
			}
			else {
			panel.addC(new Circle(55, 835, 50, color));
			count ++;
			placed[13][0] = color2;
		}
		}
		if(x >= 110 && x <= 170 && y >= 830 && y <= 890) {
			if(placed[13][1] != 0) {
				
			}
			else {
			panel.addC(new Circle(115, 835, 50, color));
			count ++;
			placed[13][1] = color2;
		}
		}
		if(x >= 170 && x <= 230 && y >= 830 && y <= 890) {
			if(placed[13][2] != 0) {
				
			}
			else {
			panel.addC(new Circle(175, 835, 50, color));
			count ++;
			placed[13][2] = color2;
		}
		}
		if(x >= 230 && x <= 290 && y >= 830 && y <= 890) {
			if(placed[13][3] != 0) {
				
			}
			else {
			panel.addC(new Circle(235, 835, 50, color));
			count ++;
			placed[13][3] = color2;
		}
		}
		if(x >= 290 && x <= 350 && y >= 830 && y <= 890) {
			if(placed[13][4] != 0) {
				
			}
			else {
			panel.addC(new Circle(295, 835, 50, color));
			count ++;
			placed[13][4] = color2;
		}
		}
		if(x >= 350 && x <= 410 && y >= 830 && y <= 890) {
			if(placed[13][5] != 0) {
				
			}
			else {
			panel.addC(new Circle(355, 835, 50, color));
			count ++;
			placed[13][5] = color2;
		}
		}
		if(x >= 410 && x <= 470 && y >= 830 && y <= 890) {
			if(placed[13][6] != 0) {
				
			}
			else {
			panel.addC(new Circle(415, 835, 50, color));
			count ++;
			placed[13][6] = color2;
		}
		}
		if(x >= 470 && x <= 530 && y >= 830 && y <= 890) {
			if(placed[13][7] != 0) {
				
			}
			else {
			panel.addC(new Circle(475, 835, 50, color));
			count ++;
			placed[13][7] = color2;
		}
		}
		if(x >= 530 && x <= 590 && y >= 830 && y <= 890) {
			if(placed[13][8] != 0) {
				
			}
			else {
			panel.addC(new Circle(535, 835, 50, color));
			count ++;
			placed[13][8] = color2;
		}
		}
		if(x >= 590 && x <= 650 && y >= 830 && y <= 890) {
			if(placed[13][9] != 0) {
				
			}
			else {
			panel.addC(new Circle(595, 835, 50, color));
			count ++;
			placed[13][9] = color2;
		}
		}
		if(x >= 650 && x <= 710 && y >= 830 && y <= 890) {
			if(placed[13][10] != 0) {
				
			}
			else {
			panel.addC(new Circle(655, 835, 50, color));
			count ++;
			placed[13][10] = color2;
		}
		}
		if(x >= 710 && x <= 770 && y >= 830 && y <= 890) {
			if(placed[13][11] != 0) {
				
			}
			else {
			panel.addC(new Circle(715, 835, 50, color));
			count ++;
			placed[13][11] = color2;
		}
		}
		if(x >= 770 && x <= 830 && y >= 830 && y <= 890) {
			if(placed[13][12] != 0) {
				
			}
			else {
			panel.addC(new Circle(775, 835, 50, color));
			count ++;
			placed[13][12] = color2;
		}
		}
		if(x >= 830 && x <= 890 && y >= 830 && y <= 890) {
			if(placed[13][13] != 0) {
				
			}
			else {
			panel.addC(new Circle(835, 835, 50, color));
			count ++;
			placed[13][13] = color2;
		}
		}
		if(x >= 890 && x <= 950 && y >= 830 && y <= 890) {
			if(placed[13][14] != 0) {
				
			}
			else {
			panel.addC(new Circle(895, 835, 50, color));
			count ++;
			placed[13][14] = color2;
		}
		}
		
		///////////////////////////////////////////////15
		if(x >= 50 && x <= 110 && y >= 890 && y <= 950) {
			if(placed[14][0] != 0) {
				
			}
			else {
			panel.addC(new Circle(55, 895, 50, color));
			count ++;
			placed[14][0] = color2;
		}
		}
		if(x >= 110 && x <= 170 && y >= 890 && y <= 950) {
			if(placed[14][1] != 0) {
				
			}
			else {
			panel.addC(new Circle(115, 895, 50, color));
			count ++;
			placed[14][1] = color2;
		}
		}
		if(x >= 170 && x <= 230 && y >= 890 && y <= 950) {
			if(placed[14][2] != 0) {
				
			}
			else {
			panel.addC(new Circle(175, 895, 50, color));
			count ++;
			placed[14][2] = color2;
		}
		}
		if(x >= 230 && x <= 290 && y >= 890 && y <= 950) {
			if(placed[14][3] != 0) {
				
			}
			else {
			panel.addC(new Circle(235, 895, 50, color));
			count ++;
			placed[14][3] = color2;
		}
		}
		if(x >= 290 && x <= 350 && y >= 890 && y <= 950) {
			if(placed[14][4] != 0) {
				
			}
			else {
			panel.addC(new Circle(295, 895, 50, color));
			count ++;
			placed[14][4] = color2;
		}
		}
		if(x >= 350 && x <= 410 && y >= 890 && y <= 950) {
			if(placed[14][5] != 0) {
				
			}
			else {
			panel.addC(new Circle(355, 895, 50, color));
			count ++;
			placed[14][5] = color2;
		}
		}
		if(x >= 410 && x <= 470 && y >= 890 && y <= 950) {
			if(placed[14][6] != 0) {
				
			}
			else {
			panel.addC(new Circle(415, 895, 50, color));
			count ++;
			placed[14][6] = color2;
		}
		}
		if(x >= 470 && x <= 530 && y >= 890 && y <= 950) {
			if(placed[14][7] != 0) {
				
			}
			else {
			panel.addC(new Circle(475, 895, 50, color));
			count ++;
			placed[14][7] = color2;
		}
		}
		if(x >= 530 && x <= 590 && y >= 890 && y <= 950) {
			if(placed[14][8] != 0) {
				
			}
			else {
			panel.addC(new Circle(535, 895, 50, color));
			count ++;
			placed[14][8] = color2;
		}
		}
		if(x >= 590 && x <= 650 && y >= 890 && y <= 950) {
			if(placed[14][9] != 0) {
				
			}
			else {
			panel.addC(new Circle(595, 895, 50, color));
			count ++;
			placed[14][9] = color2;
		}
		}
		if(x >= 650 && x <= 710 && y >= 890 && y <= 950) {
			if(placed[14][10] != 0) {
				
			}
			else {
			panel.addC(new Circle(655, 895, 50, color));
			count ++;
			placed[14][10] = color2;
		}
		}
		if(x >= 710 && x <= 770 && y >= 890 && y <= 950) {
			if(placed[14][11] != 0) {
				
			}
			else {
			panel.addC(new Circle(715, 895, 50, color));
			count ++;
			placed[14][11] = color2;
		}
		}
		if(x >= 770 && x <= 830 && y >= 890 && y <= 950) {
			if(placed[14][12] != 0) {
				
			}
			else {
			panel.addC(new Circle(775, 895, 50, color));
			count ++;
			placed[14][12] = color2;
		}
		}
		if(x >= 830 && x <= 890 && y >= 890 && y <= 950) {
			if(placed[14][13] != 0) {
				
			}
			else {
			panel.addC(new Circle(835, 895, 50, color));
			count ++;
			placed[14][13] = color2;
		}
		}
		if(x >= 890 && x <= 950 && y >= 890 && y <= 950) {
			if(placed[14][14] != 0) {
				
			}
			else {
			panel.addC(new Circle(895, 895, 50, color));
			count ++;
			placed[14][14] = color2;
		}
		}
		winnerCheck(placed);
	}
	public static void winnerCheck(int[][] gameboard) {
		
		for(int i = 0; i <= 14; i ++) {
			for(int j = 0; j <= 14; j ++) {
				int temp = gameboard[i][j];
				int countc = 0;
				if(temp == 0) {
					//break;
				}
				else {
					for(int i1 = i; i1 >= 0; i1 --) {
								
						if(gameboard[i1][j] == temp) {
							countc ++;
							if(countc == 5 && temp == 1) {
								//System.out.println("Player1 wins!");
								result.setTitle("Result");
								result.setSize(300, 100);
								result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								result.setLocationRelativeTo(null);
								result.setVisible(true);
								JLabel result2 = new JLabel("Player1 wins!");
								result1.add(result2);
								result.add(result1);
							}
							if(countc == 5 && temp == 2) {
								//System.out.println("Cpu wins!");
								result.setTitle("Result");
								result.setSize(300, 100);
								result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								result.setLocationRelativeTo(null);
								result.setVisible(true);
								JLabel result2 = new JLabel("Player2 wins!");
								result1.add(result2);
								result.add(result1);
							}	
						}
						else {
							break;
						}
					}
				}
			}
		}
		for(int i = 0; i <= 14; i ++) {
			for(int j = 0; j <= 14; j ++) {
				int temp = gameboard[i][j];
				int countr = 0;
				if(temp == 0) {
					//break;
				}
				else {
					for(int j1 = j; j1 >= 0; j1 --) {
								
						if(gameboard[i][j1] == temp) {
							countr ++;
							if(countr == 5 && temp == 1) {
								//System.out.println("Player1 wins!");
								result.setTitle("Result");
								result.setSize(300, 100);
								result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								result.setLocationRelativeTo(null);
								result.setVisible(true);
								JLabel result2 = new JLabel("Player1 wins!");
								result1.add(result2);
								result.add(result1);
							}
							if(countr == 5 && temp == 2) {
								//System.out.println("Cpu wins!");
								result.setTitle("Result");
								result.setSize(300, 100);
								result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								result.setLocationRelativeTo(null);
								result.setVisible(true);
								JLabel result2 = new JLabel("Player2 wins!");
								result1.add(result2);
								result.add(result1);
							}	
						}
						else {
							break;
						}
					}
				}
			}
		}
		for(int i = 0; i <= 14; i ++) {
			for(int j = 0; j <= 14; j ++) {
				int temp = gameboard[i][j];
				int countr = 0;
				if(temp == 0) {
					//break;
				}
				else {
					for(int j1 = j, i1 = i; j1 >= 0 && i1 >= 0; j1 --, i1 --) {
								
						if(gameboard[i1][j1] == temp) {
							countr ++;
							if(countr == 5 && temp == 1) {
								//System.out.println("Player1 wins!");
								result.setTitle("Result");
								result.setSize(300, 100);
								result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								result.setLocationRelativeTo(null);
								result.setVisible(true);
								JLabel result2 = new JLabel("Player1 wins!");
								result1.add(result2);
								result.add(result1);
							}
							if(countr == 5 && temp == 2) {
								//System.out.println("Cpu wins!");
								result.setTitle("Result");
								result.setSize(300, 100);
								result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								result.setLocationRelativeTo(null);
								result.setVisible(true);
								JLabel result2 = new JLabel("Player2 wins!");
								result1.add(result2);
								result.add(result1);
							}	
						}
						else {
							break;
						}
					}
				}
			}
		}
		for(int i = 0; i <= 14; i ++) {
			for(int j = 0; j <= 14; j ++) {
				int temp = gameboard[i][j];
				int countr = 0;
				if(temp == 0) {
					//break;
				}
				else {
					for(int j1 = j, i1 = i; j1 >= 0 && i1 <= 14; j1 --, i1  ++) {
								
						if(gameboard[i1][j1] == temp) {
							countr ++;
							if(countr == 5 && temp == 1) {
								//System.out.println("Player1 wins!");
								result.setTitle("Result");
								result.setSize(300, 100);
								result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								result.setLocationRelativeTo(null);
								result.setVisible(true);
								JLabel result2 = new JLabel("Player1 wins!");
								result1.add(result2);
								result.add(result1);
							}
							if(countr == 5 && temp == 2) {
								//System.out.println("Cpu wins!");
								result.setTitle("Result");
								result.setSize(300, 100);
								result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								result.setLocationRelativeTo(null);
								result.setVisible(true);
								JLabel result2 = new JLabel("Player2 wins!");
								result1.add(result2);
								result.add(result1);
							}	
						}
						else {
							break;
						}
					}
				}
			}
		}
	}
}
