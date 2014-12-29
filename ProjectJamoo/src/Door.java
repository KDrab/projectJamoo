
/**
* Door Object.
* 
* <P>A door that connects rooms to each other
*  
* <P>Bugs:
* 
* <P>TODO:
* 
* <P>Recent Changes: removed unnecessary main()
* 
* 					 added setConnectedRooms method and override method
*  
* @author Richard Holgate
* @lastEditor Richard Holgate
* @version 0.1
* @date 12/28/2014
*/

public class Door {

	//The rooms the door connects
	Room[] conectedRooms = new Room[2];
	//Whether the door is locked
	Boolean locked;
		
	
	/**
	 * <P> Unlock the door
	 *
	 * @param None
	 * @return Nothing
	 */
	public void unlock() {
		//TODO
		
	} //close unlock method
	
	
	/**
	 * <P> Lock the door
	 *
	 * @param None
	 * @return Nothing
	 */
	public void lock() {
		//TODO
		
	} //close lock method
	
	
	/**
	 * <P> Add specified room as one of  the rooms in connectedRooms array if there is space
	 *
	 * @param None
	 * @return Widget - the widgit contained within the tile
	 */
	public void setConnectedRooms(Room room) {
		
		
	} //close setConnectedRooms method

}