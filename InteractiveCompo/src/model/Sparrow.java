package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Sparrow extends Object{
	PImage laugh;
	public Sparrow (int x,int y,PApplet app) {
		super(x, y, app);
		object=app.loadImage("../resources/Sparrows.png");
		shine = app.loadImage("../resources/sparrowShine.png");
		laugh = app.loadImage("../resources/sparrowLaugh.png");
	}
	protected void paintObject() {
		app.image(object, x, y);
	}
	protected void paintShine() {
		app.image(shine,x,y);
	}
	protected void dragObject() {
	}
	public void paintLaugh() {
		app.image(laugh, x, y);
	}
}
