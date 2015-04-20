package com.blackpensoftware.world_war.handlers;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.Random;

public class GenerateBorders {
	
	static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();		// Gets the dimension of the whole screen 
	static double screenwidth = screenSize.getWidth();	// Creates a double with the value of the screen width
	static double screenheight = screenSize.getHeight();	// Creates a double with the value of the screen height 
	
	public void genBorder(Graphics g){
		Random ran = new Random();
		
		int start_xPos = ran.nextInt((int)screenwidth);
		int start_yPos = ran.nextInt((int)screenheight);
		
		Hexagon hex = new Hexagon();
		
	}// End of GenerateBoarders method
}// End of Class
