
import java.util.List;

/**
* Room Object.
* 
* <P>Attributes and behaviors of the rooms that make up the board
*  
* <P>Bugs:
* 
* <P>TODO:
* 
* <P>Recent Changes: removed unnecessary main
* 					 expanded on generateRoom() by adding roomType parameter
* 					 added generateRoomSize()
* 					 added generateTiles()
* 					 added generateAccessibleRooms()
* 					 set fields to null in constructor
*  
* @author Richard Holgate
* @lastEditor Richard Holgate
* @version 0.1
* @date 12/19/2014
*/

public class Room {

	
	int one;
	//The width and height of the bounding box for the room. default value of -1 for undefined
	int columns = -1;
	int rows = -1;
	
	//Arrays containing the information about the game such as the rooms in it, the objects in it, etc
	List<Tile> tileArray;
	List<Actor> actorArray;
	List<Item> itemArray;
	List<Room> accessibleRooms; //All rooms connecting to this room
	List<Door> connectingDoors; //All doors connecting to this room
	
	//various traits about the visibility of the room
	boolean visible; //Has the room been found?
	boolean accesible; //Can you enter the room? (e.g. locked doors, blocked passage, etc.)
	boolean explored; //Has the room been fully explored? (i.e. fog of war)
	boolean safe; //Has the room been cleared of enemies/dangers?
	
	/**
	  * Constructor.
	  * 
	  */
	public Room() {
		
		tileArray = null;
		actorArray = null;
		itemArray = null;
		accessibleRooms = null;
		connectingDoors = null;
		
		visible = false;
		accesible = false;
		explored = false;
		safe = false;
		
	}
	
	/**
	 * <P> Generate the interior of the room
	 *
	 * @param roomType - the type of room being generated
	 */
	public void generateRoom(String roomType) {
		
		if (columns == -1) {
			generateRoomSize(roomType);
		} //close if statement
		
		if (tileArray == null) {
			generateTiles(roomType);
			//TODO
		} //close if statement
		
		if (actorArray == null) {
			//generateActors();
			//TODO
		} //close if statement
		
		if (itemArray == null) {
			//generateItems();
			//TODO
		} //close if statement
		
		if (accessibleRooms == null) {
			generateAccesibleRooms();
			//TODO
		} //close if statement
		
		if (connectingDoors == null) {
			//generateConnectingDoors();
			//TODO
		} //close if statement
		//TODO
		
		
	} //close generateRoom method
	
	
	/**
	 * <P> Generate the columns and rows for the room
	 *
	 * @param roomType - the type of room being generated
	 * @return Nothing
	 */
	private void generateRoomSize(String roomType) {
		
		if (roomType.equals("start")) {
			columns = 15;
			rows = 15;
			
			//it's the starting room, so set fields to true
			visible = true;
			accesible = true;
			explored = true;
			safe = true;
			
		} //close if statement
		else {
			//generate a random number of rows and columns between 5 and 30
			columns = (int) (Math.random()*25) + 5;
			rows    = (int) (Math.random()*25) + 5;
		} //close else statement
		
	} //close generateColumns method
	
	
	/**
	 * <P> Generate the columns and rows for the room
	 *
	 * @param roomType - the type of room being generated
	 * @return Nothing
	 */
	private void generateTiles(String roomType) {
		
		for (int i = 0; i < rows; i++) {
			
			for (int j = 0; j < columns; j++) {
				
				//create each tile by iterating through the rows and columns
				Tile tile = new Tile();
				tile.x = j;
				tile.y = i;
				
			} //close for loop			
			
		} //close for loop
	} //close generateTiles method
	
	
	/**
	 * <P> Generate the adjoining rooms
	 *
	 * @param None
	 * @return Nothing
	 */
	private void generateAccesibleRooms() {
		
		//generate between 1 and 4 new rooms
		int roomsToGenerate = (int) Math.random()*4;
		
		for (int i = 0; i < roomsToGenerate; i++) {
			
			Room room = new Room();
			accessibleRooms.add(room);
			
		} //close for loop
		
	} //close generateAccesibleRooms method
	
	
	/**
	 * <P> Generate the adjoining rooms
	 *
	 * @param None
	 * @return Nothing
	 */
	private void generateDoors() {
		
		//for each room in the accessible rooms list generate a door
		for (int i = 0; i < accessibleRooms.size(); i++) {
			
			Door door = new Door();
			door.;
			
			
		} //close for loop
		
	} //close generateDoors method
	
	
	/**
	 * <P> Set the room to be visible to the player
	 *
	 * @param None
	 * @return Nothing
	 */
	public void setVisible() {
		//TODO
		
	} //close setVisible method

	
	/**
	 * <P> Set the room to be accesible to the player
	 *
	 * @param None
	 * @return Nothing
	 */
	public void setAccesible() {
		//TODO
		
	} //close setAccesible method
	
	
	/**
	 * <P> Set the room as explored by the player
	 *
	 * @param None
	 * @return Nothing
	 */
	public void setExplored() {
		//TODO
		
	} //close setExplored method
	
	
	/**
	 * <P> Set the room as safe for the player
	 *
	 * @param None
	 * @return Nothing
	 */
	public void setSafe() {
		//TODO
		
	} //close setSafe method
	
	/**
	 * <P> Unlock a door connected to the room
	 *
	 * @param d - the door to unlock
	 * @return Nothing
	 */
	public void unlockDoor(Door d) {
		//TODO
		
	} //close unlockDoor method
	
	
	/**
	 * <P>Lock a door connected to the room
	 *
	 * @param d - the door to lock
	 * @return Nothing
	 */
	public void lockDoor(Door d) {
		//TODO
		
	} //close lockDoor method
	
	
	/**
	 * <P> Move a widget through a door
	 *
	 * @param w - the widget to be moved
	 * @param d - the door to move the widget through
	 * @return Nothing
	 */
	public void widgetThruDoor(Widget w, Door d) {
		
		//if it's an actor, use actorThruDoor method. If item, use itemThruDoor method
		if (w instanceof Actor) {
			actorThruDoor((Actor) w, d);
		} else
		if (w instanceof Item) {
			itemThruDoor((Item) w, d);
		} //close if/else statement
		
	} //close widgetThruDoor method
	
	/**
	 * <P> Move an actor through a door
	 *
	 * @param a - the actor to be moved
	 * @param d - the door to move the actor through
	 * @return Nothing
	 */
	public void actorThruDoor(Actor a, Door d) {
		//TODO
		
	} //close actorThruDoor method
	
	
	/**
	 * <P> Move an item through a door
	 *
	 * @param None
	 * @return Nothing
	 */
	public void itemThruDoor(Item i, Door d) {
		//TODO
		
	} //close itemThruDoor method
	
	
	/**
	 * <P> get the widget at the specified coordinates
	 *
	 * @param column - the column the item is in
	 * @param row - the row the item is in
	 * @return the widget at the specified coordinates in the room
	 */
	public Widget getWidget(int column, int row) {
		return null;
		//TODO
		
	} //close getWidget method
	
	
	/**
	 * <P> Remove the specified widget from the room
	 *
	 * @param w - the widget to remove
	 * @return Nothing
	 */
	public void removeWidget(Widget w) {
		//TODO
		
	} //close removeWidget method
	
	
	/**
	 * <P> Add the specified widget into the room at the specified location
	 *
	 * @param w - the widget to add
	 * @param row - the row at which to add the widget
	 * @param column - the column at which to add the widget
	 * @return Nothing
	 */
	public void addWidget(Widget w, int row, int column) {
		//TODO
		
	} //close addWidget method
	
	
	/**
	 * <P> discover the room on the other side of the specified door
	 *
	 * @param d - the door from which to get the room to discover (i.e. the room is on the other side of the specified door)
	 * @return Nothing
	 */
	public void discoverAdjacentRoom(Door d) {
		//TODO
		
	} //close discoverAdjacentRoom method
}