// Congratulations for finishing the game.

import java.awt.Graphics2D;
import java.awt.Color;


public class GameOverState extends GameState {
	
	private Color color;
	
	public GameOverState(GameStateManager gamestatemanager) {
		super(gamestatemanager);
	}
	
	public void init() {
		color = new Color(164, 198, 222);
	}
	
	public void update() {}
	
	public void draw(Graphics2D g) {
		
		g.setColor(color);
		g.fillRect(0, 0, GamePanel.WIDTH, GamePanel.HEIGHT2);
		
		Content.drawString(g, "Congrats, Nolly is full!", 8, 78);
		
		Content.drawString(g, "press any key", 12, 110);
		
	}
	
	public void handleInput() {
		if(Keys.isPressed(Keys.ENTER)) {
			gamestatemanager.setState(GameStateManager.MENU);
		}
	}
	
}