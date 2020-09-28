package controller;

import model.Interactive;

public class Controller {
	protected Interactive interactive;
	
	public Controller () {
		interactive = new Interactive();
	}
	public void draw() {
		interactive.draw();
	}
}
