
import java.util.List;

/**
* Game Object.
* 
* <P>The game object. Holds data and operates on things within the game
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

public class Game {

	//Lists containing the information about the game such as the rooms in it, the objects in it, etc
	List<Room> board; //the "board" or "map" of the game
	List<Widget> widgetList;
	List<Actor> actorList;
	List<Item> itemList;
	//The current state of the mouse, whether nothing is selected, a character is selected, an item is selected, etc.
	int mouseState;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	} //close main method
	
	
	/**
	 * <P> Setup the game to start
	 *
	 * @param None
	 * @return Nothing
	 */
	public void setup() {
		//TODO
		
	} //close setup method
	
	/**
	 * <P> Executes one turn of the game
	 *
	 * @param None
	 * @return Nothing
	 */
	public void takeTurn() {
		//TODO 
		
	} //close takeTurn method
}