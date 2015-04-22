package com.blackpensoftware.world_war.handlers;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class LandHandler extends JPanel{
	
	static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();		// Gets the dimension of the whole screen 
	static double width = screenSize.getWidth();	// Creates a double with the value of the screen width
	static double height = screenSize.getHeight();	// Creates a double with the value of the screen height 
	
	@Override
	public void paint(Graphics g) {
		this.setBackground(FrameHandler.game_panel_color);	// Sets the background color for the panel to be drawn 
		Graphics2D g2d = (Graphics2D) g;	// Converts the graphics to the Graphics2D system
		g2d.setColor(Color.RED);	// Sets the active debug color to red
		
		Hexagon hex = new Hexagon();	// Creates an accessible instance of the hexagon class
		GenerateSea sea = new GenerateSea();	// Creates an accessible instance of the GenerateSea class
		//StatHandler stat = new StatHandler();	// Creates an accessible instance of the StatHandler class
		ColorSelector selector = new ColorSelector();	// Creates an accessible instance of the ColorSelector class
		
		int base_xPos = (hex.getSize() / 2) * -1;	// Centers the master Hexagon at 0 on the x axis 
		int base_yPos = (hex.getDiameter()) * -1;	// Centers the master Hexagon at 0 on the y axis
		int xPos = base_xPos;	// Sets the xPos variable to the base_xPos;
		int yPos = base_yPos;	// Sets the yPos variable to the base_yPos;
		
		for(int n = 0; n < hex.number_to_gen_width; n++){	// For the number of hexagons to draw on the x axis
			for(int i = 0; i < hex.number_to_gen_width; i++){	// For the number of hexagons to draw on the y axis
				selector.generateColor();	// Generate a color for the hexagon to be drawn 
				g2d.setColor(selector.getColor());	// Set the graphics color to the color that was generated
				hex.fillHex(g2d, xPos, yPos);	// Fill a hexagon at x, y
				g2d.setColor(Color.BLACK);	// Set the outline color to black 
				hex.drawHex(g2d, xPos, yPos);	// draw a hexagon over the drawn hexagon 
				xPos += hex.getSize() * 2 + hex.getSizeApothm() * 2;	// Move to the next line on the x axis
			}
			xPos = base_xPos;	// Reset the x axis
			yPos += hex.getHeight();	// Go to the next y axis line 
		}
		
		xPos = base_xPos + hex.getSize() + hex.getSizeApothm();		// Sets the new starting x point 
		yPos = base_yPos - hex.getDiameter();	// Sets the new starting y point
		
		for(int n = 0; n < hex.number_to_gen_height; n++){		// For the number of hexagons to draw on the y 
			for(int i = 0; i < hex.number_to_gen_height; i++){	// For the number of hexagons to draw on the x
				selector.generateColor();	// Generate the color for the next hexagon to be generated
				g2d.setColor(selector.hex_color);	// Sets the hexagon draw color to what was generated
				hex.fillHex(g2d, xPos, yPos);	// Fills a hexagon of that color
				g2d.setColor(Color.BLACK);	// Sets the outline color of the hexagon 
				hex.drawHex(g2d, xPos, yPos);	// Draws a hexagon on top of the pre-drawn hexagon 
				xPos += hex.getSizeApothm() * 2 + hex.getSize() * 2;	// Moves the xPos to the next xPos line 
			}
			xPos = base_xPos + hex.getSize() + hex.getSizeApothm();	// Resets the xPos
			yPos += hex.getHeight();	// Increments the yPos
		}
		sea.genSea(g2d);	// Generates the sea of the map
	}//	End of paint method
}// End of class
