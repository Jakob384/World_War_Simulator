package com.blackpensoftware.world_war.handlers;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JOptionPane;

public class StatHandler {
	
	int oil_value = 1000, 
		military_value = 2000, 
		navy_value = 100, 
		total_value = oil_value + military_value + navy_value;
	
	String country_name = "Base Country";
	
	public void displayStats(Graphics g, int xPos, int yPos){
		g.setColor(Color.WHITE);
		displayIcon(g, yPos, yPos);
		displayCountryName(g, yPos, yPos);
		displayOilIcon(g, yPos, yPos);
		displayOilValue(g, yPos, yPos);
		displayMilitaryIcon(g, yPos, yPos);
		displayMilitaryValue(g, yPos, yPos);
		displayNavyIcon(g, yPos, yPos);
		displayNavyValue(g, yPos, yPos);
		displayTotalValue(g, yPos, yPos);
	}// End of displayStats method
	
	public void displayIcon(Graphics g, int xPos, int yPos){
		
	}// End of displayIcon method
	
	public void setCountryName(){
		country_name = JOptionPane.showInputDialog(FrameHandler.main_frame, "Enter the name of your country");
	}
	
	public void displayCountryName(Graphics g, int xPos, int yPos){
		Font country_font = new Font("Times", Font.BOLD, 20);
		g.setFont(country_font);
		g.drawString(country_name, xPos, yPos);
	}// End of displayCountryName method
	
	public void displayOilIcon(Graphics g, int xPos, int yPos){
		
	}// End of displayOilIcon method
	
	public void displayOilValue(Graphics g, int xPos, int yPos){
		g.drawString("Oil: " + oil_value, xPos, yPos + 20);
	}// End of displayOilValue method
	
	public void displayMilitaryIcon(Graphics g, int xPos, int yPos){
		
	}// End of displayMilitaryIcon method
	
	public void displayMilitaryValue(Graphics g, int xPos, int yPos){
		g.drawString("Military: " + military_value, xPos, yPos + 40);
	}// End of displayMilitaryValue method
	
	public void displayNavyIcon(Graphics g, int xPos, int yPos){
		
	}// End of displayNavyIcon method
	
	public void displayNavyValue(Graphics g, int xPos, int yPos){
		g.drawString("Navy: " + navy_value, xPos, yPos + 60);
	}// End of displayNavyValue method
	
	public void displayTotalValue(Graphics g, int xPos, int yPos){
		g.drawString("Total Points: " + total_value, xPos, yPos + 80);
	}// End of displayTotalValue method
	
	public int getOilValue(){
		return oil_value;
	}
	
	public int getMilitaryValue(){
		return military_value;
	}
	
	public int getNavyValue(){
		return navy_value;
	}
	
	public void setOilValue(int valueToSet){
		oil_value = valueToSet;
	}
	
	public void setMilitaryValue(int valueToSet){
		military_value = valueToSet;
	}
	
	public void setNavyValue(int valueToSet){
		navy_value = valueToSet;
	}
}// End of class