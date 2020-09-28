package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Interactive extends PApplet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Interactive.class.getName());
	}
	Sparrow sparrow;
	public void settings() {
		sparrow = new Sparrow(this);
	}
	public void setup() {

	}
	public void draw() {
		sparrow.paintObject();
	}
	public void mousePressed() {
		
	}
	
}
