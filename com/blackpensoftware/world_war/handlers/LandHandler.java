package com.blackpensoftware.world_war.handlers;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.util.Random;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class LandHandler extends JPanel{
	
	static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();		// Gets the dimension of the whole screen 
	static double width = screenSize.getWidth();	// Creates a double with the value of the screen width
	static double height = screenSize.getHeight();	// Creates a double with the value of the screen height 
	
	@Override
	public void paint(Graphics g) {
		this.setBackground(FrameHandler.game_panel_color);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.RED);
		
		Hexagon hex = new Hexagon();
		GenerateBorders gen = new GenerateBorders();
		StatHandler stat = new StatHandler();
		ColorSelector selector = new ColorSelector();
		
		int base_xPos = (hex.getSize() / 2) * -1;
		int base_yPos = (hex.getDiameter()) * -1;
		int xPos = base_xPos;
		int yPos = base_yPos;
		
		Random ran = new Random();
		
		for(int n = 0; n < hex.number_to_gen_width; n++){
			for(int i = 0; i < hex.number_to_gen_width; i++){
				selector.generateColor();
				g2d.setColor(selector.getColor());
				hex.fillHex(g2d, xPos, yPos);
				g2d.setColor(Color.BLACK);
				hex.drawHex(g2d, xPos, yPos);
				xPos += hex.getSize() * 2 + hex.getSizeApothm() * 2;
			}
			xPos = base_xPos;
			yPos += hex.getHeight();
		}
		
		xPos = base_xPos + hex.getSize() + hex.getSizeApothm();
		yPos = base_yPos - hex.getDiameter();
		
		for(int n = 0; n < hex.number_to_gen_height; n++){
			for(int i = 0; i < hex.number_to_gen_height; i++){
				selector.generateColor();
				g2d.setColor(selector.hex_color);
				hex.fillHex(g2d, xPos, yPos);
				g2d.setColor(Color.BLACK);
				hex.drawHex(g2d, xPos, yPos);
				xPos += hex.getSizeApothm() * 2 + hex.getSize() * 2;
			}
			xPos = base_xPos + hex.getSize() + hex.getSizeApothm();
			yPos += hex.getHeight();
		}
		
		g.setColor(Color.BLACK);
		gen.genBorder(g2d);
		// stat.displayStats(g2d, 200, 200);
		
	}//	End of paint method
}// End of class
