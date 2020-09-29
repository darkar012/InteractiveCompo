package model;

import processing.core.PApplet;

public class BoxCover extends Object{
	
	public BoxCover (PApplet app) {
		super(app);
		object=app.loadImage("../resources/boxCover.png");
	}
	public void paintObject() {
		app.image(object, 863, 300);
	}
}