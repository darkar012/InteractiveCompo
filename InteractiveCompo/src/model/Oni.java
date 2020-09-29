package model;

import processing.core.PApplet;

public class Oni extends Object{

	public Oni (int x, int y, PApplet app) {
		super(x, y, app);
		object=app.loadImage("../resources/Oni.png");
		shine=app.loadImage("../resources/oniShine.png");
	}
	protected void paintObject() {
		app.image(object, 900, 300);
	}
	protected void paintShine() {
		app.image(shine, 900, 300);
	}
}