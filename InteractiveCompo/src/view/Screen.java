package view;

import java.util.ArrayList;
import processing.core.PApplet;

public class Screen extends PApplet{


public static void main(String[] args) {
	// TODO Auto-generated method stub
	PApplet.main(Screen.class.getName());
}
String [] story;
ArrayList <String> words;
public void settings() {
	size (200,200);
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
	background (0);
	for (String element : words) {
		if (element.equals("gorrión"));
		ellipse(40, 50, 40, 40);
	}
}
}