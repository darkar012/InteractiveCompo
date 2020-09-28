package model;

import processing.core.PApplet;

public class OldWoman extends Object{
	
		public OldWoman (PApplet app) {
			super(app);
			object=app.loadImage("../resources/oldWoman.png");
		}
		public void paintObject() {
			app.image(object, 600, 399);
		}
	}