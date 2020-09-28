package model;

import processing.core.PApplet;

public class Sparrow extends Object{
	public Sparrow (PApplet app) {
		super(app);
		object=app.loadImage("../resources/Sparrows.png");
	}
	public void paintObject() {
		app.image(object, 0, 0);
	}
}
