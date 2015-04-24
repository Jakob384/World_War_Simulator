package com.blackpensoftware.world_war.core;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

public class Hexagon{
	
	static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();		// Gets the dimension of the whole screen 
	static double screenwidth = screenSize.getWidth();	// Creates a double with the value of the screen width
	static double screenheight = screenSize.getHeight();	// Creates a double with the value of the screen height 
	
	int size_apothm = 5;	// Sets the apothm size for the hexagons to be generated
	int diameter = size_apothm * 2;		// Creates and sets the value for the diameter of the hexagons 
	int side_length = diameter + (size_apothm / 2);	// Creates and sets the value for the side length of the hexagon to be generated
	int height = diameter * 2;	// Creates and sets the value of the total height of the hexagons
	int width = (size_apothm * 2) + side_length;	// Calculates the total width of the hexagons 
	int number_to_gen_width = (int)screenwidth / width;		// Calculates the number of hexagons to be generated in the frame on the x axis
	int number_to_gen_height = (int)screenheight / height + 20;	// Calculates the number of hexagons to be generated on the y axis
	
	int[] xPoints = new int[6];		// Creates an integer array for the x points of the hexagons to be generated
	int[] yPoints = new int[6];		// Creates an integer array for the y points of the hexagons to be generated 
	
	int xPos = 0;	// Sets the base x Position 
	int yPos = 0;	// Sets the base y Position 
	
	public void drawHex(Graphics g, int xPos, int yPos){
		
		this.xPos = xPos;	// Sets the xPos in the class to equal the xPos of the method for hexagon generation 
		this.yPos = xPos;	// Sets the xPos in the class to equal the xPos of the method for hexagon generation 
		
		/** Sets the x Positions to create a hexagon **/
		xPoints[0] = xPos + size_apothm;	
		xPoints[1] = xPos + (size_apothm + side_length);
		xPoints[2] = xPos + (2 * size_apothm + side_length);
		xPoints[3] = xPos + (size_apothm + side_length);
		xPoints[4] = xPos + size_apothm;
		xPoints[5] = xPos;
		
		/** Sets the y Positions to create a hexagon **/
		yPoints[0] = yPos;
		yPoints[1] = yPos;
		yPoints[2] = yPos + diameter;
		yPoints[3] = yPos + height;
		yPoints[4] = yPos + height;
		yPoints[5] = yPos + diameter;
		
		g.drawPolygon(xPoints, yPoints, 6);		// Draws the polygon that will create a hexagon 
	}// End of Hexagon method
	
public void fillHex(Graphics g, int xPos, int yPos){
		
		/** Sets the x Positions to create a hexagon **/
		xPoints[0] = xPos + size_apothm;
		xPoints[1] = xPos + (size_apothm + side_length);
		xPoints[2] = xPos + (2 * size_apothm + side_length);
		xPoints[3] = xPos + (size_apothm + side_length);
		xPoints[4] = xPos + size_apothm;
		xPoints[5] = xPos;
		
		/** Sets the y Positions to create a hexagon **/
		yPoints[0] = yPos;
		yPoints[1] = yPos;
		yPoints[2] = yPos + diameter;
		yPoints[3] = yPos + height;
		yPoints[4] = yPos + height;
		yPoints[5] = yPos + diameter;
		
		g.fillPolygon(xPoints, yPoints, 6);		// Fills the polygon that will create a hexagon 
	}// End of Hexagon method
	
	public int getSize(){
		return side_length;		// Returns the value of side_length
	}
	
	public int getSizeApothm(){
		return size_apothm;		// Returns the value of side_apothum
	}
	
	public int getDiameter(){
		return diameter;	//	Returns the value of diameter
	}
	
	public int getHeight(){
		return height;	// Returns the value of height
	}
	
	public int getHex_xPos(){
		return xPos;	// Returns the value of xPos
	}
	
	public int getHex_yPos(){
		return yPos;	// Returns the value of yPos
	}
	
	public int getNumberToGenX(){
		return number_to_gen_width;
	}
	
	public int getNumberToGenY(){
		return number_to_gen_height;
	}
}// End of class