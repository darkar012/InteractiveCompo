package view;

import controller.Controller;
import processing.core.PApplet;
import processing.core.PImage;


public class CompoScreen extends PApplet{
	PApplet app;
	PImage compo;
	public Controller control;
	public CompoScreen(PApplet app) {
	this.app = app;
	compo = app.loadImage("../resources/screenBackground.png");
	control = new Controller (app);
	}
public void paintCompo() {
	app.image(compo,0,0);
}
public void drawSparrow() {
	control.drawSparrow();
}
}