package view;

import processing.core.PApplet;
import processing.core.PImage;


public class CompoScreen extends PApplet{
	PApplet app;
	PImage compo;
	public CompoScreen(PApplet app) {
	this.app = app;
	compo = app.loadImage("../resources/screenBackground.png");
	}
public void PaintCompo() {
	app.image(compo,0,0);
}
}