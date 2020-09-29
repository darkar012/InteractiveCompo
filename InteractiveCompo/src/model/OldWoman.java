package model;

import processing.core.PApplet;

public class OldWoman extends Object{
	
		public OldWoman (int x, int y, PApplet app) {
			super(x, y, app);
			object=app.loadImage("../resources/oldWoman.png");
			shine = app.loadImage("../resources/shineOldWoman.png");
		}
		protected void paintObject() {
			app.image(object, 600, 399);
		}
		protected void paintShine() {
			app.image(shine, 600, 399);
		}
	}