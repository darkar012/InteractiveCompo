package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Object extends PApplet{
	PImage object;
	PApplet app;
	public Object (PApplet app) {
		this.app=app;
	}
	protected void paintObject () {
		app.image(object, 0, 0);
	}
}
