package com.blackpensoftware.world_war.handlers;

import java.awt.Color;
import java.util.Random;

public class ColorSelector {
	
	Color hex_color = Color.BLACK;
	
	Random ran = new Random();
	
	public void generateColor(){
		int color_red = 0,
			color_green = ran.nextInt(256),
			color_blue = (color_green - 255) * -1;
		
		if(color_blue <= 230){
			color_blue = 0;
			color_green = ran.nextInt(156) + 100;
		}else{
			color_blue = ran.nextInt(156) + 100;
		}
		
		hex_color = new Color(color_red, color_green, color_blue);
	}
	
	public Color getColor(){
		return hex_color;
	}
}
