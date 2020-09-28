package model;

import processing.core.PApplet;

public class Interactive extends PApplet{
	PApplet app;
	Object sparrow;
	
	public Interactive (PApplet app){
		this.app=app;
		sparrow = new Sparrow(app);
	}

	public void drawSparrow() {
		sparrow.paintObject();
	}

	
}
