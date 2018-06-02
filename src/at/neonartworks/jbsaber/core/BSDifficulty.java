package at.neonartworks.jbsaber.core;
/**
 * 
 * @author Florian Wagner
 *
 */
public enum BSDifficulty {

	EASY("Easy"), NORMAL("Normal"), HARD("Hard"), EXPERT("Expert");

	private String name;

	BSDifficulty(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

}
