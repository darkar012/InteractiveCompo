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
	int x;
	int y;
	public Interactive (PApplet app){
		this.app=app;
		sparrow = new Sparrow(x, y, app);
		bamboo = new Bamboo(x, y, app);
		oldWoman = new OldWoman(x, y, app);
		oni = new Oni (x, y, app);
		box = new Box (x, y, app);
		boxCover = new BoxCover(x, y, app);
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

	/*public void lessX() {
		x--;
	}*/
	
	
}
