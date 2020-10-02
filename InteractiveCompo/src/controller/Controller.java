package controller;
//import model.Interactive
import model.Interactive;
import processing.core.PApplet;

//controller package , controller class
public class Controller {
	// declaration model.Interactive
	public Interactive interactive;
	PApplet app;

	public Controller (PApplet app) {
		this.app = app;
		//initialization model.Interactive
		interactive = new Interactive(app);
	}
	//methods called of the interactive class in the model package to the controller class in the controller class
	//sparrow methods
	public void drawSparrow() {
		interactive.drawSparrow();
	}
	public void drawShineSparrow(){
		interactive.drawShineSparrow();
	}
	public void drawLaugh() {
		interactive.drawLaugh();
	}
	//bamboo methods
	public void drawBamboo() {
		interactive.drawBamboo();
	}
	public void drawShineBamboo(){
		interactive.drawShineBamboo();
	}
	public void drawLeaf() {
		interactive.drawLeaf();
	}
	//old woman methods
	public void drawOldWoman() {
		interactive.drawOldWoman();
	}
	public void drawShineOld() {
		interactive.drawShineOld();
	}
	public void dragOld() {
		interactive.dragOld();
	}
	//Oni methods
	public void drawOni() {
		interactive.drawOni();
	}
	public void drawShineOni() {
		interactive.drawShineOni();
	}
	public void dragOni(){
		interactive.dragOni();
	}	
	//box methods
	public void drawBox() {
		interactive.drawBox();
	}
	//box cover methods
	public void drawBoxCover() {
		interactive.drawBoxCover();
	}	
	public void drawShineBoxCover() {
		interactive.drawShineBoxCover();
	}	
	public void dragBoxCover(){
		interactive.dragBoxCover();
	}	
}
