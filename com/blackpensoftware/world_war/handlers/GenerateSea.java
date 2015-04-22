package com.blackpensoftware.world_war.handlers;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.Random;

public class GenerateSea {
	
	static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();		// Gets the dimension of the whole screen 
	static double screenwidth = screenSize.getWidth();	// Creates a double with the value of the screen width
	static double screenheight = screenSize.getHeight();	// Creates a double with the value of the screen height 
	
	public void genSea(Graphics g){
		Random ran = new Random();	// Random instance call
		
		Hexagon hex = new Hexagon();	// Hexagon instance Call
	
		int number_of_strands = 3;	// Sets the number of strands that will be sent out form the origin point
		
		for(int i = 0; i < number_of_strands- 1; i++){
			int start_xPos = (hex.getSize() / 2) * -1;	// Sets the x origin point for the master Hexagon 
			int yPos = (hex.getDiameter()) * -1;	// Sets the y origin point for the master hexagon 
			while(yPos <= screenheight){	// while the yPosition of the hexagons to be generated is not equal to the bottom of the screen 
				int dir_x = ran.nextInt(2);		// Directional call for the x axis, left (0) or right (1) 
				int dir_y = ran.nextInt(3);		// Directional call for the y axis, up(0), no change (1), or down(2)
				if(dir_x == 0){		// if the directional call is 0 
					start_xPos -= hex.getSizeApothm() * 2 + hex.getSize() * 2;	// Moves the x Position left
					g.setColor(new Color(0, 0, ran.nextInt(156) + 100));	// Sets the color of the hexagon to be drawn 
					hex.fillHex(g, start_xPos, yPos);	// Fills the hexagon 
					g.setColor(Color.BLACK);	// Sets the outline color
					hex.drawHex(g, start_xPos, yPos);	// Draws the outline 
					g.setColor(new Color(0, 0, ran.nextInt(156) + 100));	// Sets the color for the hexagon to be drawn 
					hex.fillHex(g, start_xPos + hex.getSize() + hex.getSizeApothm(), yPos - hex.diameter);	// Draws the hexagon up and to the right 
				}else{	
					start_xPos += hex.getSizeApothm() * 2 + hex.getSize() * 2;	// Moves the x axis to the right
					g.setColor(new Color(0, 0, ran.nextInt(156) + 100));	// Sets the color of the hexgon to be drawn
					hex.fillHex(g, start_xPos, yPos);	// Draws the hexagon
					g.setColor(Color.BLACK);	// Sets the outline color of the hexagon 
					hex.drawHex(g, start_xPos, yPos);	// Outlines the hexagon 
					g.setColor(new Color(0, 0, ran.nextInt(156) + 100));	// Sets the color of the hexagon to be generated
					hex.fillHex(g, start_xPos + hex.getSize() + hex.getSizeApothm(), yPos - hex.diameter);	// Fills the hexagon on space up and to the right 
				}	// End of if 0
				
				if(dir_y == 0){		// if 0
					yPos -= hex.height;	// Move the y pos to the left
					g.setColor(new Color(0, 0, ran.nextInt(156) + 100));	// Set the color of the hexagon to be drawn 
					hex.fillHex(g, start_xPos, yPos);	// Draw the hexagon 
					g.setColor(Color.BLACK);	// Set the color of the outline 
					hex.drawHex(g, start_xPos, yPos);	// Draw the hexagon outline 
				}else if(dir_y == 1){	// if 1
					yPos += 0;	// Do not change the y 
				}else{
					yPos += hex.height;	// Move the y to the right 
				}// Ensd of else
			}// End of if 0
		}// End of while
	}// End of GenerateBoarders method
}// End of Class
