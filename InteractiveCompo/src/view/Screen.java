package view;

import java.util.ArrayList;

import controller.Controller;
import processing.core.PApplet;

public class Screen extends PApplet{


public static void main(String[] args) {
	// TODO Auto-generated method stub
	PApplet.main(Screen.class.getName());
}
//public Controller controller;
CompoScreen compo;
String [] story;
ArrayList <String> words;
int state;
public void settings() {
	size (1171,659);
	//controller=new Controller();
	compo = new CompoScreen(this);
	state = 1;
}
public void setup() {
	story = loadStrings("../resources/story.txt");
	words = new ArrayList<String>();
	for (int i = 0; i < story.length; i++) {
		String [] tempArray = story[i].split(" ");
		for (int j = 0; j < tempArray.length; j++) {
			words.add(tempArray[j].trim());
		}
	}
}
public void draw(){
	switch(state) {
	case 1 :
	compo.PaintCompo();
	for (String element : words) {
		if (element.equals("gorrión"));
		//controller.draw();
	}
}
	
}
}