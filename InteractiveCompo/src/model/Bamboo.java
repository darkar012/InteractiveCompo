package model;

import processing.core.PApplet;
//daughter class bamboo
public class Bamboo extends Object{
	
		public Bamboo (int x, int y, PApplet app) {
			super(x, y, app);
			object=app.loadImage("../resources/bamboo.png");
			shine=app.loadImage("../resources/bambooShine.png");
		}
		//methods
		protected void paintObject() {
			app.image(object, x, y);
		}
		protected void paintShine() {
			app.image(shine,x,y);
		}
		protected void dragObject() {
			
		}
	}

