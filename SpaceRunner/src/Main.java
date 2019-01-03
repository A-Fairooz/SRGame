import processing.core.PApplet;

import SRGame.MainGame;

public class Main extends PApplet{
	
	MainGame launcher;
	
	public int sW = 800;
	public int sH = 800;
	
	public static void main(String[] args) {		
		PApplet.main("Main");
	
	}
	
	
	public void settings() {
		size(sW, sH);
		launcher = new MainGame(this);
	}
	
	public void draw() {
		background(0);
		
	}
	
}
