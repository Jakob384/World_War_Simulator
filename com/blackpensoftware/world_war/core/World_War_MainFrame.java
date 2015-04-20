package com.blackpensoftware.world_war.core;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import com.blackpensoftware.world_war.handlers.FrameHandler;
import com.blackpensoftware.world_war.handlers.StatHandler;

public class World_War_MainFrame{

	static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();		// Gets the dimension of the whole screen 
	static double width = screenSize.getWidth();	// Creates a double with the value of the screen width
	static double height = screenSize.getHeight();	// Creates a double with the value of the screen height 
	
	public static void main(String[] args){
		int frame_x_pos = 0,
			frame_y_pos = 0,
			frame_width = (int)width, 
			frame_height = (int)height;
		Color frame_color = Color.DARK_GRAY;
		String frame_title = "World War Simulator v0.0.3";
		
		FrameHandler.generateFrame(frame_x_pos, frame_y_pos, frame_width, frame_height, frame_color, frame_title);
	}// End of main method
}// End of class