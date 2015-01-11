

/**
* Tile Object.
* 
* <P>The attributes and behavior of a single tile in a room.
*  
* <P>Bugs:
* 
* <P>TODO:
* 
* <P>Recent Changes: removed unnecessary main()
* 					 add constructor setting most initial fields to null
*  
* @author Richard Holgate
* @lastEditor Richard Holgate
* @version 0.1
* @date 12/19/2014
*/

public class Tile {

	//the x and y location of the tile within the room
	int x;
	int y;
	//the name and description of the tile
	String name;
	String description;
	//traits about the accessibility of the tile
	boolean accesible; //is the tile accesible? (i.e. can widgets be on the ground in the tile?)
	boolean filled; // is the tile completely filled? (i.e. can widgets move through the air in the tile?)
	//is there something located within the tile?
	boolean containsWidget;
	boolean containingWidget;
	Widget widgetContainedInTile;
	
	/**
	  * Constructor.
	  * 
	  */
	public Tile() {
		name = null;
		description = null;
		
		accesible = true;
		boolean filled = false;
		
		containsWidget = false;
		widgetContainedInTile = null;
	}
	
	
	/**
	 * <P> Get the widget that is within the tile
	 *
	 * @param None
	 * @return Widget - the widgit contained within the tile
	 */
	public Widget getContainedWidget() {
		return null;
		//TODO
		
	} //close getContainedWidget method	

}