package at.neonartworks.jbsaber.core;
/**
 * 
 * @author Florian Wagner
 *
 */
public enum BSCutDirection {

	UP(0), DOWN(1), LEFT(2), RIGHT(3), UP_LEFT(4), UP_RIGHT(5), DOWN_LEFT(6), DOWN_RIGHT(7), NO_DIR(8);

	private int id;

	BSCutDirection(int id) {
		this.id = id;
	}

	public int getID() {
		return this.id;
	}
}
