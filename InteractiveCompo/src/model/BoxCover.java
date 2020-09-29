package model;

import processing.core.PApplet;

public class BoxCover extends Object{
	
	public BoxCover (int x, int y, PApplet app) {
		super(x, y, app);
		object=app.loadImage("../resources/boxCover.png");
		shine=app.loadImage("../resources/boxCoverShine.png");
	}
	protected void paintObject() {
		app.image(object, getX()+863, getY()+300);
	}
	protected void paintShine(){
		app.image(shine, getX()+863, getY()+300);
	}
	}