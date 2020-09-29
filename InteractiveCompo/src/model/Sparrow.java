package model;

import processing.core.PApplet;

public class Sparrow extends Object{
	public Sparrow (int x,int y,PApplet app) {
		super(x, y, app);
		object=app.loadImage("../resources/Sparrows.png");
		shine = app.loadImage("../resources/sparrowShine.png");
	}
	protected void paintObject() {
		app.image(object, 0, 0);
	}
	protected void paintShine() {
		app.image(shine,0,0);
	}
}
