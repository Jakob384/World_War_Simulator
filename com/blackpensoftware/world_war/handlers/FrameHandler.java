package com.blackpensoftware.world_war.handlers;

import java.awt.Color;

import javax.swing.JFrame;

public class FrameHandler{
	
	static JFrame main_frame = new JFrame();	// Creates the JFrame
	public static Color game_panel_color;
	
	public static void generateFrame(int xPos, int yPos, int width, int height, Color color, String frame_title){
		int main_frame_x_location = xPos; 	// Creates a variable that will be used to set the x location for the frame  
		int main_frame_y_location = yPos;	// Creates a variable that will be used to set the y location for the frame
		int main_frame_x_size = width;		// Used to set the x or width of the JFrame
		int main_frame_y_size = height;	// Used to set the y or height of the JFrame 
		
	    game_panel_color = color;	// sets the color of the game panel
		
		String main_frame_name = frame_title;	// Creates a variable that will serve as the title for the main_frame
		
		main_frame.setVisible(true);	// Sets the JFrame to a visible state
		main_frame.setTitle(main_frame_name);
		main_frame.setSize(main_frame_x_size, main_frame_y_size);	// Sets the size of the JFrame using the predefined width and height 
		main_frame.setLocation(main_frame_x_location, main_frame_y_location);	// Sets the location of the JFrame on the screen with the predefined x and y position
		main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// sets the default close operation to close the application on close
		
		main_frame.add(new LandHandler());
	}// End of main method
	
	public static JFrame getFrame(){	// Gets the frame to be used in the other classes
		return main_frame;		// Returns the JFrame main_frame
	}// End of getFrame method
}// End of class
