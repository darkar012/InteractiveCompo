package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Sparrow extends Object{
	PImage laugh;
	public Sparrow (int x,int y,PApplet app) {
		super(x, y, app);
		object=app.loadImage("../resources/Sparrows.png");
		shine = app.loadImage("../resources/sparrowShine.png");
		//laugh = app.loadImage(filename);
	}
	protected void paintObject() {
		app.image(object, 0, 0);
	}
	protected void paintShine() {
		app.image(shine,0,0);
	}
	@Override
	protected void dragObject() {
		// TODO Auto-generated method stub
		
	}
}
