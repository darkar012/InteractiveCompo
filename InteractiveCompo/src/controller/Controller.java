package controller;

import model.Interactive;
import processing.core.PApplet;

public class Controller {
	public Interactive interactive;
	PApplet app;

	public Controller (PApplet app) {
		this.app = app;
		interactive = new Interactive(app);
	}
	public void drawSparrow() {
		interactive.drawSparrow();
	}
	public void drawBamboo() {
		interactive.drawBamboo();
	}
	public void drawOldWoman() {
		interactive.drawOldWoman();
	}
	public void drawOni() {
		interactive.drawOni();
	}
	public void drawBox() {
		interactive.drawBox();
	}
	public void drawBoxCover() {
		interactive.drawBoxCover();
	}
}
