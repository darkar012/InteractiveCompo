package view;

import java.util.ArrayList;

import processing.core.PApplet;
//main class in the view package to paint all the objects and the conditions to do the interactions
public class Screen extends PApplet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Screen.class.getName());
	}
	//declaration classes of the view package
	CompoScreen compo;
	FinalScreen end;
	//declaration string to import the text
	String [] story;
	//declaration of the arraylist to save all the words of the text
	ArrayList <String> words;
	//declaration of the variables
	int state;
	int interaction;
	int time;
	int interactionCounter;
	//declaration of the boolean variables
	boolean disable;
	boolean interact;
	boolean spar;
	boolean oni;
	boolean bamboo;
	boolean boxCover;
	boolean old;
	
	public void settings() {
		size (1171,659);
		//initialization of the classes
		compo = new CompoScreen(this);
		end = new FinalScreen(this);
		//initialization of the variables
		state = 1;
		interaction = 0;
		interactionCounter=0;
		//initialization of the booleans
		disable = false;
		interact=false;
		spar=false;
		oni=false;
		bamboo=false;
		boxCover=false;
		old=false;
	}
	
	public void setup() {
		//load of the text
		story = loadStrings("../resources/story.txt");
		//initialization of the arraylist
		words = new ArrayList<String>();
		//process to save the text words into the words arraylist
		for (int i = 0; i < story.length; i++) {
			String [] tempArray = story[i].split(" ");
			for (int j = 0; j < tempArray.length; j++) {
				words.add(tempArray[j]);
			}
			}
		}
	
	public void draw(){
		//switch of state to change of screen
		switch(state) {
		//composition screen
		case 1 :
			//paint of the background
			compo.paintCompo();
			//paint of the shine of the object to make the composition intuitive
			//old woman's shine paint
			// if () to define the area of the screen where the mouse have to be to paint the shine
			if (mouseX > 658 && mouseX < 658 + 227
					&& mouseY > 430 && mouseY < 430+225 ) {
				//method to paint the shine
				compo.drawShineOld();
			} 
			//bamboo's shine paint
			else if (mouseX > 849 && mouseX < 849 + 321
					&& mouseY > 0 && mouseY < 0+283 ) {
				compo.drawShineBamboo();
			}
			//Sparrow's shine paint
			//disable variable to erase the shine and the sparrow when the interaction is in use
			else if (mouseX > 0 && mouseX < 0 + 323
					&& mouseY > 291 && mouseY < 291 +120 && disable == false) {
				compo.drawShineSparrow();
			}
			//oni's shine paint
			else if (mouseX > 1000 && mouseX < 1000 + 120
					&& mouseY > 308 && mouseY < 308 +64) {
				compo.drawShineOni();
			}
			//box cover's shine paint
			else if (mouseX > 896 && mouseX < 896 + 275
					&& mouseY > 312 && mouseY < 312 +235 ) {
				compo.drawShineBoxCover();
			}
			//paint of the objects if the words in the condition exists in the text
			// for to travel the words arraylist
			//sparrow paint
			for (int i = 0; i < words.size(); i++) {
				// if to compare the words
				//in this case, the boolen have the same function that in the shine painting
				if (words.get(i).equals("GORRIÓN(1)") && disable == false) {
					//method to paint of the object
					compo.drawSparrow();
				}
				//Oni paint
				else if (words.get(i).equals("reían(1)")) {
					compo.drawOni();
				}
				//bamboo paint
				else if (words.get(i).equals("iré(1)")) {
					compo.drawBamboo();
				}
				//old woman paint
				else if (words.get(i).equals("ella(1),")) {
					compo.drawOldWoman();
				}
				//box paint
				else if (words.get(i).equals("cesta(1)")) {
					compo.drawBox();
				}
				//box cover paint
				else if (words.get(i).equals("tapa")) {
					compo.drawBoxCover();
				}

			}
			// switch to paint the interactions of clicked
			switch (interaction) {
			//case 1 to paint the leaf image of the bamboo interaction
			case 1:
				compo.drawLeaf();
				break;
			//case 2 to paint the laugh image of the sparrow interaction
			case 2:
				compo.drawLaugh();
				//boolean to erase the shine and the original sparrow image
				disable = true;
				// frameCount condition to finish the interaction and paint the sparrow again
				if (frameCount %30 == 0) {
					disable = false;
					interaction = 0;
				}
				break;
			}
			//condition to change composition screen to final screen
			//interactionCounter count the times that you use the interactions
			if (interactionCounter==5) {
				state=2;
			}
			break;
		//case 2 to paint final screen
		case 2 :
			end.paintFinalScreen();
		}	

	}
	public void mouseClicked() {
		//switch to define the areas where the mouse clicked to activate interactions
		switch (state) {
		//case 1 to refer of the composition screen
		case 1:
			//area where the mouse clicked to paint the bamboo interaction
			if (mouseX > 849 && mouseX < 849 + 321
					&& mouseY > 0 && mouseY < 0+283) {
				//boolean to define if the interaction was used or not
				if (bamboo==false) {
					interactionCounter+=1;
					bamboo=true;
				}
				//switch (interaction) change to 1
				interaction = 1;
			}
			//area where the mouse clicked to paint the sparrow interaction
			else if (mouseX > 0 && mouseX < 0 + 323
					&& mouseY > 291 && mouseY < 291 +120){
				//boolean to define if the interaction was used or not
				if (spar==false) {
					interactionCounter+=1;
					spar=true;
				}
				//switch (interaction) change to 2
				interaction = 2;
			}
			break;
		//case 2 to refer of the final screen
		case 2: 
			//area where the mouse clicked to exit of the program
			if (mouseX > 367 && mouseX < 367 + 437
					&& mouseY > 360 && mouseY < 360 +86) {
				exit();
			}
		}
	}

	public void mouseDragged() {
		//interact boolean to avoid that the interaction of dragged of one case not affect the rest 
		interact =false;
		//old woman's drag interaction
		if (interact==false) {
			//zone of the screen where the mouse id going to dragged the object
			if (mouseX > 550 && mouseX < 550 + 335
					&& mouseY > 556 && mouseY < 556+101) {
				interact = true;
				//when the user do 4 interactions can used this interaction
				if (interactionCounter==4) {
					//boolean old to identify if the interaction was used or not
					if (old==false) {
						if  (mouseX > 542 && mouseX < 542 + 20
								&& mouseY > 588 && mouseY < 588+71){
							interactionCounter+=1;
							old=true;
						}
					}
					compo.dragOld();
				}
			}
			//oni's drag interaction
			if (mouseX > 1000 && mouseX < 1000 + 120
					&& mouseY > 20 && mouseY < 20 +392) {
				interact=true;
				//where the counter was 3 or 4 can be used
				if (interactionCounter>2 && interactionCounter<5) {
					if (oni==false) {
						interactionCounter+=1;
						oni=true;
					}
					compo.dragOni();
				}	
			}
			//box cover's drag interaction			
			if (mouseX > 250 && mouseX < 250 + 846
					&& mouseY > 390 && mouseY < 390 +61) {
				interact=true;
				if (interactionCounter>1 && interactionCounter<4) {
					if (boxCover==false) {
						interactionCounter+=1;
						boxCover=true;
					}
					compo.dragBoxCover();
				}
			}
		}

	}
}


