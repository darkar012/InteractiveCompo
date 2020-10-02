package model;

import processing.core.PApplet;
import processing.core.PImage;
//daughter class Sparrow
public class Sparrow extends Object{
	//PImage to paint a unique image for this object
	PImage laugh;
	public Sparrow (int x,int y,PApplet app) {
		super(x, y, app);
		object=app.loadImage("../resources/Sparrows.png");
		shine = app.loadImage("../resources/sparrowShine.png");
		laugh = app.loadImage("../resources/sparrowLaugh.png");
	}
	//methods
	protected void paintObject() {
		app.image(object, x, y);
	}
	protected void paintShine() {
		app.image(shine,x,y);
	}
	protected void dragObject() {
	}
	//method to paint a image, that's the interaction
	public void paintLaugh() {
		app.image(laugh, x, y);
	}
}
