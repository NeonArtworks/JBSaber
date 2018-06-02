package at.neonartworks.jbsaber.core;

/**
 * Describes the difficulty which you can find in the info.json
 * 
 * @author Florian Wagner
 *
 */
public class BSDifficultyLevel {
	private String difficulty;
	private int difficultyRank;
	private String audioPath;
	private String jsonPath;

	/**
	 * Creates a new difficulty level.
	 * 
	 * @param level
	 *            the difficulty
	 * @param difficultyRank
	 *            the diffculty rank
	 * @param audioPath
	 *            the path to the audio file
	 */
	public BSDifficultyLevel(BSDifficulty level, int difficultyRank, String audioPath) {
		super();
		this.difficulty = level.toString();
		this.difficultyRank = difficultyRank;
		this.audioPath = audioPath;
		this.jsonPath = level.toString() + ".json";
	}

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

	public int getDifficultyRank() {
		return difficultyRank;
	}

	public void setDifficultyRank(int difficultyRank) {
		this.difficultyRank = difficultyRank;
	}

	public String getAudioPath() {
		return audioPath;
	}

	public void setAudioPath(String audioPath) {
		this.audioPath = audioPath;
	}

	public String getJsonPath() {
		return jsonPath;
	}

	public void setJsonPath(String jsonPath) {
		this.jsonPath = jsonPath;
	}

}
