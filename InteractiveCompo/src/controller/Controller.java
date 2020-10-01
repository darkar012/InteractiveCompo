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
	public void drawShineOld() {
		interactive.drawShineOld();
	}
	public void drawShineBamboo(){
		interactive.drawShineBamboo();
	}
	public void drawShineSparrow(){
		interactive.drawShineSparrow();
	}
	public void drawShineBoxCover() {
		interactive.drawShineBoxCover();
	}
	public void drawShineOni() {
		interactive.drawShineOni();
	}
	public void drawLeaf() {
		interactive.drawLeaf();
	}
	public void drawLaugh() {
		interactive.drawLaugh();
	}
	/*public void dragOld() {
		interactive.dragOld();
	
	}*/
}
