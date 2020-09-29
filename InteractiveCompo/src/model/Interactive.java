package model;

import processing.core.PApplet;

public class Interactive extends PApplet{
	PApplet app;
	Object sparrow;
	Object bamboo;
	Object oldWoman;
	Object oni;
	Object box;
	Object boxCover;

	public Interactive (PApplet app){
		this.app=app;
		sparrow = new Sparrow(app);
		bamboo = new Bamboo(app);
		oldWoman = new OldWoman(app);
		oni = new Oni (app);
		box = new Box (app);
		boxCover = new BoxCover(app);
	}

	public void drawSparrow() {
		sparrow.paintObject();
	}
	public void drawBamboo() {
		bamboo.paintObject();
	}
	public void drawOldWoman() {
		oldWoman.paintObject();
	}
	public void drawOni() {
		oni.paintObject();
	}
	public void drawBox() {
		box.paintObject();
	}
	public void drawBoxCover(){
		boxCover.paintObject();
	}
	public void drawShineOld() {
		oldWoman.paintShine();
	}
	public void drawShineBamboo() {
		bamboo.paintShine();
	}
	public void drawShineSparrow() {
		sparrow.paintShine();
	}
	public void drawShineBoxCover() {
		boxCover.paintShine();
	}
	public void drawShineOni() {
		oni.paintShine();
	}

}
