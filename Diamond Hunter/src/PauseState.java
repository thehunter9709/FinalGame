

import java.awt.Graphics2D;

//Pause screen + instructions tab
public class PauseState extends GameState {
	
	public PauseState(GameStateManager gsm) {
		super(gsm);
	}
	
	public void init() {}
	
	public void update() {
		handleInput();
	}
	
	
	//Instructions here
	public void draw(Graphics2D g) {
		
		Content.drawString(g, "paused", 40, 30);
		
		Content.drawString(g, "arrow", 12, 76);
		Content.drawString(g, "keys", 16, 84);
		Content.drawString(g, ": move", 52, 80);
		
		Content.drawString(g, "space", 12, 96);
		Content.drawString(g, ": action", 52, 96);
		
		Content.drawString(g, "F1:", 36, 112);
		
		Content.drawString(g, "return", 68, 108);
		Content.drawString(g, "to menu", 68, 116);
		
	}
	
	//Handles input from the pause screen
	public void handleInput() {
		if(Keys.isPressed(Keys.ESCAPE)) {
			gamestatemanager.setPaused(false);
		}
		if(Keys.isPressed(Keys.F1)) {
			gamestatemanager.setPaused(false);
			gamestatemanager.setState(GameStateManager.MENU);
		}
	}
	
}
