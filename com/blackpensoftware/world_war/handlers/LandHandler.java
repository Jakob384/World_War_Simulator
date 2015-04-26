package com.blackpensoftware.world_war.handlers;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;

import javax.swing.JPanel;

import com.blackpensoftware.world_war.core.Hexagon;
import com.blackpensoftware.world_war.generators.BorderGenerator;
import com.blackpensoftware.world_war.generators.LandGenerator;
import com.blackpensoftware.world_war.generators.SeaGenerator;

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
		SeaGenerator sea = new SeaGenerator();	// Creates an accessible instance of the GenerateSea class
		StatHandler stat = new StatHandler();	// Creates an accessible instance of the StatHandler class
		BorderGenerator border = new BorderGenerator();
		LandGenerator land = new LandGenerator();
		
		//border.genBorder(g2d);
		stat.setCountryName();
		land.genLand(g2d);
		sea.genSea(g2d);	// Generates the sea of the map
		stat.displayStats(g2d, 10, 20);
	}//	End of paint method
}// End of class
