package model;
//father class
import processing.core.PApplet;
import processing.core.PImage;

public abstract class Object extends PApplet{
	//the variables of the class
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
	//the methods of the class
	protected void paintObject () {
		app.image(object, 0, 0);
	}
	//this method is used to paint a shine that makes easy for the user
	//to recognize the interactions
	protected void paintShine () {
		app.image(shine, 0, 0);
	}
	//abstract method to drag some objects
	protected abstract void dragObject();
	
	//getters and setters
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

	
}
