package SRGame;
import EngineComponents.ProcessingEntity;
import SRGame.Player;
import processing.core.PApplet;


public class MainGame extends ProcessingEntity{

	
	public Player player;
	public MainGame(PApplet p) {
		super(p);
		StartGame();
		// TODO Auto-generated constructor stub
	}

	
	
	
	//Add Start Screen
	
	//Switch Between Screens
	
	//Load Game
	
	//Game Script Here
	public void StartGame() {

		
		player = new Player(parent, parent.width/2,  parent.height/2, 20, 20);		
		player.start();
		
		
	}


}
