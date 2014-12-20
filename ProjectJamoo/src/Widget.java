
/**
* Widget Object.
* 
* <P>Abstract class used to represent things within the game. (e.g. items, actors, buildings, etc.)
*  
* <P>Bugs:
* 
* <P>TODO:
* 
* <P>Recent Changes: removed unnecessary main()
*  
* @author Richard Holgate
* @lastEditor Richard Holgate
* @version 0.1
* @date 12/19/2014
*/

public abstract class Widget {

	//Various info about the widget
	String name; //the name of the widget
	Room roomLocation; //the room it is located in
	int rows; //the length of the widget (1 by default)
	int columns; //the width of the widget (1 by default)
	int x; //the x location of the widget within the room
	int y; //the y location of the widget within the room
	String description; //the description of the widget

}
