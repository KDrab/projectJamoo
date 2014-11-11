
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
* GameHost Object.
* 
* <P>The host object for the game. Used for meta-interaction (e.g. setup, run, pause, save, quit, etc.)
*  
* <P>Bugs:
* 
* <P>TODO:
* 
* <P>Recent Changes:
*  
* @author Richard Holgate
* @lastEditor Richard Holgate
* @version 0.1
* @date 11/9/2014
*/

public class GameHost {

	//the height and width of the screen
	final static int SCREEN_HEIGHT = 500;
	final static int SCREEN_WIDTH = 500;
		
	//the panel to draw things on
	MyDrawPanel drawPanel;
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameHost host = new GameHost();
		host.setup();
		host.run();
	} //close main method
	
	
	/**
	 * <P> Setup the game host
	 *
	 * @param None
	 * @return Nothing
	 */
	private void setup() {
		
		//create JFrame and set close operation
		JFrame frame = new JFrame();
		//frame.addMouseListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Create draw panel
		drawPanel = new MyDrawPanel();
				
		//add draw panel to frame, set size and visibility
		frame.getContentPane().add(drawPanel);
		frame.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		frame.setVisible(true);
		
		//create the actual game and set it up
		Game game = new Game();
		game.setup();

	} //close setup method
	
	
	/**
	 * <P> Start running the game
	 *
	 * @param None
	 * @return Nothing
	 */
	private void run() {
		
		//draw the new positions of the planets and particles
		drawPanel.repaint();

	} //close run method

	/**
	 * <P> MyDrawPanel class for GUI
	 */
	class MyDrawPanel extends JPanel {
		
		public void paintComponent(Graphics gg) {
			//turns on anti-aliasing
			Graphics2D g = (Graphics2D) gg.create();
			g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			//"erase" previous rendering
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
							
		} // close paintComponent method
	} // close MyDrawPanel class
	
}