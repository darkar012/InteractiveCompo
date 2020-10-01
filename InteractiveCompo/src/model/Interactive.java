package model;

import processing.core.PApplet;

public class Interactive extends PApplet{
	PApplet app;
	Sparrow sparrow;
	Object bamboo;
	Object oldWoman;
	Object oni;
	Object box;
	Object boxCover;
	Leaf leaf;
public int x;
public int y;
	public Interactive (PApplet app){
		this.app=app;
		sparrow = new Sparrow(0, 0, app);
		bamboo = new Bamboo(685, 0, app);
		leaf = new Leaf (600,0, app);
		oldWoman = new OldWoman(600, 399, app);
		oni = new Oni (900, 300, app);
		box = new Box (0, 0, app);
		boxCover = new BoxCover(0, 0, app);
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
	public void drawLeaf() {
		leaf.paintLeaf();
	}
	public void drawLaugh() {
		sparrow.paintLaugh();
	}

	public void dragOld() {
		oldWoman.dragObject();
	}
	
	
}
