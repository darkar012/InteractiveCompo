package model;

import processing.core.PApplet;


public class Bamboo extends Object{
	
		public Bamboo (PApplet app) {
			super(app);
			object=app.loadImage("../resources/bamboo.png");
		}
		public void paintObject() {
			app.image(object, 685, 0);
		}
	}

