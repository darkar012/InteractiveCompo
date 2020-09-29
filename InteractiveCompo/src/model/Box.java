package model;

import processing.core.PApplet;

public class Box extends Object{
	
	public Box (int x, int y,PApplet app) {
		super(x, y, app);
		object=app.loadImage("../resources/box.png");
	}
	public void paintObject() {
		app.image(object, 863, 400);
	}
}

