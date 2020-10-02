package model;

import processing.core.PApplet;
import processing.core.PImage;

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
	public void paintLeaf() {
		app.image(leaf, x, y);
		x+=5;
		y+=5;
	}
}
