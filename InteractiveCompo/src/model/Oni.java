package model;

import processing.core.PApplet;
//daughter class
public class Oni extends Object{

	public Oni (int x, int y, PApplet app) {
		super(x, y, app);
		object=app.loadImage("../resources/Oni.png");
		shine=app.loadImage("../resources/oniShine.png");
	}
	//methods
	protected void paintObject() {
		app.image(object, x, y);
	}
	protected void paintShine() {
		app.image(shine, x, y);
	}
	//the method set Y like the position of mouse in Y
	protected void dragObject() {
		setY(app.mouseY);
	}
}