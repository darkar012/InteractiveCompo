package model;

import processing.core.PApplet;
import processing.core.PImage;

public abstract class Object extends PApplet{
	PImage object;
	PApplet app;
	PImage shine;
	protected int x;
	protected int y;
	public Object (int x, int y, PApplet app) {
		this.app=app;
		this.x = x;
		this.y = y;
		
	}
	protected void paintObject () {
		app.image(object, 0, 0);
	}
	protected void paintShine () {
		app.image(shine, 0, 0);
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	protected abstract void dragObject();
	
}
