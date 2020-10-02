package view;

import processing.core.PApplet;
import processing.core.PImage;

public class FinalScreen extends PApplet{
	PApplet app;
	PImage end;
	public FinalScreen(PApplet app) {
		this.app = app;
		end=app.loadImage("../resources/Exit.png");
	}

	public void paintFinalScreen() {
		app.image(end, 0, 0);
	}
}
