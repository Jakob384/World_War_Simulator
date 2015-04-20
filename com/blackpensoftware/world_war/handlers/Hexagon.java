package com.blackpensoftware.world_war.handlers;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class Hexagon{
	
	static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();		// Gets the dimension of the whole screen 
	static double screenwidth = screenSize.getWidth();	// Creates a double with the value of the screen width
	static double screenheight = screenSize.getHeight();	// Creates a double with the value of the screen height 
	
	int size_apothm = 2;
	int diameter = size_apothm * 2;
	int side_length = diameter + (size_apothm / 2);
	int height = diameter * 2;
	int width = (size_apothm * 2) + side_length;
	int number_to_gen_width = (int)screenwidth / width;
	int number_to_gen_height = (int)screenheight / height;
	
	int[] xPoints = new int[6];
	int[] yPoints = new int[6];
	
	int xPos = 0;
	int yPos = 0;
	
	public void drawHex(Graphics g, int xPos, int yPos){
		
		this.xPos = xPos;
		this.yPos = xPos;
		
		xPoints[0] = xPos + size_apothm;
		xPoints[1] = xPos + (size_apothm + side_length);
		xPoints[2] = xPos + (2 * size_apothm + side_length);
		xPoints[3] = xPos + (size_apothm + side_length);
		xPoints[4] = xPos + size_apothm;
		xPoints[5] = xPos;
		
		yPoints[0] = yPos;
		yPoints[1] = yPos;
		yPoints[2] = yPos + diameter;
		yPoints[3] = yPos + height;
		yPoints[4] = yPos + height;
		yPoints[5] = yPos + diameter;
		
		g.drawPolygon(xPoints, yPoints, 6);
	}// End of Hexagon method
	
public void fillHex(Graphics g, int xPos, int yPos){
		
		xPoints[0] = xPos + size_apothm;
		xPoints[1] = xPos + (size_apothm + side_length);
		xPoints[2] = xPos + (2 * size_apothm + side_length);
		xPoints[3] = xPos + (size_apothm + side_length);
		xPoints[4] = xPos + size_apothm;
		xPoints[5] = xPos;
		
		yPoints[0] = yPos;
		yPoints[1] = yPos;
		yPoints[2] = yPos + diameter;
		yPoints[3] = yPos + height;
		yPoints[4] = yPos + height;
		yPoints[5] = yPos + diameter;
		
		g.fillPolygon(xPoints, yPoints, 6);
	}// End of Hexagon method
	
	public int getSize(){
		return side_length;
	}
	
	public int getSizeApothm(){
		return size_apothm;
	}
	
	public int getDiameter(){
		return diameter;
	}
	
	public int getHeight(){
		return height;
	}
	
	public int getHex_xPos(){
		return xPos;
	}
	
	public int getHex_yPos(){
		return yPos;
	}
}// End of class