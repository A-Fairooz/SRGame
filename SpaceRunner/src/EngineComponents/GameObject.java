package EngineComponents;

import EngineComponents.Transform;
import processing.core.PApplet;

public abstract class GameObject extends ProcessingEntity{

	public GameObject(PApplet p) {
		super(p);
		// TODO Auto-generated constructor stub
	}
	public Transform transform = new Transform();
	
	public String name;
	public String ID;
	public String tag;
	public void render() {
		
	}
	public void start() {
		
		
	}
	public void update() {
		
	}
	
	
	
}
