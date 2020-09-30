package model;

import processing.core.PApplet;

public class Box extends Object{
	
	public Box (int x, int y,PApplet app) {
		super(x, y, app);
		object=app.loadImage("../resources/box.png");
	}
	protected void paintObject() {
		app.image(object, x+863, y+400);
	}
	@Override
	protected void dragObject() {
		// TODO Auto-generated method stub
		
	}
}

