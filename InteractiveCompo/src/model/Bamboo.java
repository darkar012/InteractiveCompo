package model;

import processing.core.PApplet;


public class Bamboo extends Object{
	
		public Bamboo (int x, int y, PApplet app) {
			super(x, y, app);
			object=app.loadImage("../resources/bamboo.png");
			shine=app.loadImage("../resources/bambooShine.png");
		}
		protected void paintObject() {
			app.image(object, x+685, y+0);
		}
		protected void paintShine() {
			app.image(shine,685,0);
		}
		@Override
		protected void dragObject() {
			// TODO Auto-generated method stub
			
		}
	}

