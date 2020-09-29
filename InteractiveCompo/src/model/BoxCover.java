package model;

import processing.core.PApplet;

public class BoxCover extends Object{
	
	public BoxCover (PApplet app) {
		super(app);
		object=app.loadImage("../resources/boxCover.png");
		shine=app.loadImage("../resources/boxCoverShine.png");
	}
	protected void paintObject() {
		app.image(object, 863, 300);
	}
	protected void paintShine(){
		app.image(shine, 863, 300);
	}
	}