package model;

import processing.core.PApplet;

public class BoxCover extends Object{
	
	public BoxCover (int x, int y, PApplet app) {
		super(x, y, app);
		object=app.loadImage("../resources/boxCover.png");
		shine=app.loadImage("../resources/boxCoverShine.png");
	}
	protected void paintObject() {
		app.image(object, x, y);
	}
	protected void paintShine(){
		app.image(shine, x, y);
	}
	@Override
	protected void dragObject() {
		// TODO Auto-generated method stub
		setY(app.mouseY);
		setX(app.mouseX);
	}
	}