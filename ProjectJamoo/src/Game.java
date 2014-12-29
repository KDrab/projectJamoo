
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
* <P>Recent Changes: removed unnecessary main()
* 					 create first room in setup() method
*  
* @author Richard Holgate
* @lastEditor Richard Holgate
* @version 0.1
* @date 12/19/2014
*/

public class Game {

	//Lists containing the information about the game such as the rooms in it, the objects in it, etc
	List<Room> board; //the "board" or "map" of the game
	List<Widget> widgetList;
	List<Actor> actorList;
	List<Item> itemList;
	//The current state of the mouse, whether nothing is selected, a character is selected, an item is selected, etc.
	int mouseState;
	
	/**
	 * <P> Setup the game to start
	 *
	 * @param None
	 * @return Nothing
	 */
	public void setup() {
		//generate the starting room and add it to the board
		Room startRoom = new Room();
		board.add(startRoom);
		startRoom.generateRoom("start");
		
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