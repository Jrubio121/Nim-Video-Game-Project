// Worked on this class with Guillermo, Keeton, and John

public class IllegalMoveException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String moveInfoReturn;

	
	public IllegalMoveException (String moveInfo){
		moveInfoReturn = moveInfo;
		new Exception(moveInfo);
	}
	
	public String getMessage() {
		
		return this.moveInfoReturn;
	}
	

}
