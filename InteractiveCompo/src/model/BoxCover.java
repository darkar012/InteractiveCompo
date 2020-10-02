package model;

import processing.core.PApplet;

public class BoxCover extends Object{
	//daughter class BoxCover
	public BoxCover (int x, int y, PApplet app) {
		super(x, y, app);
		object=app.loadImage("../resources/boxCover.png");
		shine=app.loadImage("../resources/boxCoverShine.png");
	}
	//methods
	protected void paintObject() {
		app.image(object, x, y);
	}
	protected void paintShine(){
		app.image(shine, x, y);
	}
	//method to drag the object in x and y depending of mouseX and mouseY
	protected void dragObject() {
		// TODO Auto-generated method stub
		setY(app.mouseY);
		setX(app.mouseX);
	}
	}