package view;

import java.util.ArrayList;

import processing.core.PApplet;

public class Screen extends PApplet{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Screen.class.getName());
	}
	CompoScreen compo;
	String [] story;
	ArrayList <String> words;
	int state;
	public void settings() {
		size (1171,659);
		compo = new CompoScreen(this);
		state = 1;
	}
	public void setup() {
		story = loadStrings("../resources/story.txt");
		words = new ArrayList<String>();
		for (int i = 0; i < story.length; i++) {
			String [] tempArray = story[i].split(" ");
			for (int j = 0; j < tempArray.length; j++) {
				words.add(tempArray[j]);
				System.out.println(words);
			}
		}
	}


	public void draw(){
		switch(state) {
		case 1 :

			compo.paintCompo();
			if (mouseX > 658 && mouseX < 658 + 227
					&& mouseY > 430 && mouseY < 430+225 ) {
				compo.drawShineOld();
		} else if (mouseX > 849 && mouseX < 849 + 321
				&& mouseY > 0 && mouseY < 0+283 ) {
			compo.drawShineBamboo();
		}else if (mouseX > 0 && mouseX < 0 + 323
				&& mouseY > 291 && mouseY < 291 +120 ) {
			compo.drawShineSparrow();
		}else if (mouseX > 896 && mouseX < 896 + 275
				&& mouseY > 312 && mouseY < 312 +235 ) {
			compo.drawShineBoxCover();
			}
			
			for (int i = 0; i < words.size(); i++) {
				if (words.get(i).equals("GORRIÓN(1)")) {
					compo.drawSparrow();
				}else if (words.get(i).equals("reían(1)")) {
					compo.drawOni();
				}else if (words.get(i).equals("iré(1)")) {
					compo.drawBamboo();
				}else if (words.get(i).equals("ella(1),")) {
					compo.drawOldWoman();
				}else if (words.get(i).equals("cesta(1)")) {
					compo.drawBox();
				}else if (words.get(i).equals("tapa")) {
					compo.drawBoxCover();
				}
				System.out.println(mouseX);
				System.out.println(mouseY);
				
				//System.out.println(element);
			}
		}

	}
	/*public void mouseDragged() {
		if (mouseX > 658 && mouseX < 658 + 227
				&& mouseY > 430 && mouseY < 430+225 ) {
			compo.lessX();
		}
	}*/
}
