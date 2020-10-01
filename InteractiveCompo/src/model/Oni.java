package model;

import processing.core.PApplet;

public class Oni extends Object{

	public Oni (int x, int y, PApplet app) {
		super(x, y, app);
		object=app.loadImage("../resources/Oni.png");
		shine=app.loadImage("../resources/oniShine.png");
	}
	protected void paintObject() {
		app.image(object, x, y);
	}
	protected void paintShine() {
		app.image(shine, x, y);
	}
	@Override
	protected void dragObject() {
		// TODO Auto-generated method stub
		setY(app.mouseY);
	}
}