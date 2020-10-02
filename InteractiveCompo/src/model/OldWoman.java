package model;

import processing.core.PApplet;

public class OldWoman extends Object{
//daughter class old Woman
	public OldWoman (int x, int y, PApplet app) {
		super(x, y, app);
		object=app.loadImage("../resources/oldWoman.png");
		shine = app.loadImage("../resources/shineOldWoman.png");
	}
	protected void paintObject() {
		app.image(object, x, y);
	}
	protected void paintShine() {
		app.image(shine, x, y);
	}
	//this method modify X to be the same position of the mouse in X
	public void dragObject() {
		setX(app.mouseX);
	}
}