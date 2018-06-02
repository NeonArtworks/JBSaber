package at.neonartworks.jbsaber.core;

/**
 * 
 * @author Florian Wagner
 *
 */
public enum BSNoteType {

	RED(0), BLUE(1), BOMB(3);

	private int id;

	BSNoteType(int id) {
		this.id = id;
	}

	public int getID() {
		return this.id;
	}

}
