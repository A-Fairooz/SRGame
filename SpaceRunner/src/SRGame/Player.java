package SRGame;

import EngineComponents.GameObject;
import EngineComponents.KeyInput;
import processing.core.PApplet;
import processing.core.PVector;

public class Player extends GameObject implements KeyInput{
	public PVector size = new PVector(12,12);
	public int fillColour;
	public int strokeColour;
	public Player(PApplet p) {
	super(p);
	}
	
	public Player(PApplet p, int x, int y, int w, int h) {
		super(p);
		this.transform.position.x = x;
		this.transform.position.y = y;
		this.size.x = w;
		this.size.y = h;
		
	}
	
	@Override
	public void render () {
		parent.fill(this.fillColour);
		parent.stroke(this.strokeColour);
		parent.rect(this.transform.position.x,
					this.transform.position.y,
					this.size.x,
					this.size.y);
		
	}

	@Override
	public void keyPressed(char key, int keyCode) {
		
	}

	@Override
	public void keyReleased(char key, int keyCode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(int mouseX, int mouseY, int mouseButton) {
		// TODO Auto-generated method stub
		
	}
}
