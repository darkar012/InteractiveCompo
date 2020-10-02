package model;

import processing.core.PApplet;

public class Box extends Object{
	//daughter class box
	
	public Box (int x, int y,PApplet app) {
		super(x, y, app);
		object=app.loadImage("../resources/box.png");
	}
	//methods
	protected void paintObject() {
		app.image(object, x+863, y+400);
	}
	protected void dragObject() {		
	}
}

