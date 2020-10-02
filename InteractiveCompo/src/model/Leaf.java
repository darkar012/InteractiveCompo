package model;

import processing.core.PApplet;
import processing.core.PImage;
//class leaf, to pain leaf like an interaction of bamboo object
public class Leaf {
	int x;
	int y;
	PApplet app;
	PImage leaf;
	public Leaf (int x, int y, PApplet app) {
		this.app = app;
		this.x=x;
		this.y=y;
		leaf=app.loadImage("../resources/leaf.png");
	}
	//method to paint the leaf and makes it move
	public void paintLeaf() {
		app.image(leaf, x, y);
		x+=5;
		y+=5;
	}
}
