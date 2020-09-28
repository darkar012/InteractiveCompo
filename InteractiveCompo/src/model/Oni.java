package model;

import processing.core.PApplet;

public class Oni extends Object{
	
	public Oni (PApplet app) {
		super(app);
		object=app.loadImage("../resources/Oni.png");
	}
	public void paintObject() {
		app.image(object, 600, 399);
	}
}