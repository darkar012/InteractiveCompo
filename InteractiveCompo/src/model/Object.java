package model;

import processing.core.PApplet;
import processing.core.PImage;

public abstract class Object extends PApplet{
	PImage object;
	PApplet app;
	PImage shine;
	public Object (PApplet app) {
		this.app=app;
	}
	protected void paintObject () {
		app.image(object, 0, 0);
	}
	protected void paintShine () {
		app.image(shine, 0, 0);
	}
}
