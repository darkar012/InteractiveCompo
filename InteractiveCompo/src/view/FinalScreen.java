package view;

import processing.core.PApplet;
import processing.core.PImage;
//final screen class
public class FinalScreen extends PApplet{
	//PApplet to paint the final screen
	PApplet app;
	PImage end;
	
	public FinalScreen(PApplet app) {
		this.app = app;
		end=app.loadImage("../resources/Exit.png");
	}
	//method to paint the class
	public void paintFinalScreen() {
		app.image(end, 0, 0);
	}
}
