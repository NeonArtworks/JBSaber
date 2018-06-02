package at.neonartworks.jbsaber.core;

import java.util.List;

/**
 * 
 * This file represents the info.json It can be written using the
 * {@link BSWriter} class.
 * 
 * 
 * @author Florian Wagner
 *
 */
public class BSInfo {

	private String songName;
	private String songSubName;
	private String authorName;
	private double beatsPerMinute;
	private int previewStartTime;
	private int previewDuration;
	private String coverImagePath;
	private String environmentName;
	private List<BSDifficultyLevel> difficultyLevels;

	/**
	 * Creates a new BSInfo object.
	 * 
	 * @param songName
	 *            the song name
	 * @param songSubName
	 *            the song author
	 * @param authorName
	 *            the map author (you)
	 * @param bPM
	 *            the beats per minute value of the used song
	 * @param previewStartTime
	 *            the start time of the preview in BeatSaber
	 * @param previewDuration
	 *            the duration of the preview in BeatSaber
	 * @param coverImagePath
	 *            the path to the image. just the name (since it should be in the
	 *            same folder) can be with or without the file ending (.jpg)
	 * @param environmentName
	 *            the environment name
	 * @param diffLevels
	 *            the difficulty levels the map should have
	 */
	public BSInfo(String songName, String songSubName, String authorName, double bPM, int previewStartTime,
			int previewDuration, String coverImagePath, String environmentName, List<BSDifficultyLevel> diffLevels) {
		super();
		this.songName = songName;
		this.songSubName = songSubName;
		this.authorName = authorName;
		this.beatsPerMinute = bPM;
		this.previewStartTime = previewStartTime;
		this.previewDuration = previewDuration;
		this.coverImagePath = BSUtil.checkCover(coverImagePath);
		this.environmentName = environmentName;
		this.difficultyLevels = diffLevels;
	}

	public BSInfo(String songName, String songSubName, String authorName, double bPM, int previewStartTime,
			int previewDuration, String coverImagePath, String environmentName) {
		super();
		this.songName = songName;
		this.songSubName = songSubName;
		this.authorName = authorName;
		this.beatsPerMinute = bPM;
		this.previewStartTime = previewStartTime;
		this.previewDuration = previewDuration;
		this.coverImagePath = BSUtil.checkCover(coverImagePath);
		this.environmentName = environmentName;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getSongSubName() {
		return songSubName;
	}

	public void setSongSubName(String songSubName) {
		this.songSubName = songSubName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public double getBeatsPerMinute() {
		return beatsPerMinute;
	}

	public void setBeatsPerMinute(double beatsPerMinute) {
		this.beatsPerMinute = beatsPerMinute;
	}

	public int getPreviewStartTime() {
		return previewStartTime;
	}

	public void setPreviewStartTime(int previewStartTime) {
		this.previewStartTime = previewStartTime;
	}

	public int getPreviewDuration() {
		return previewDuration;
	}

	public void setPreviewDuration(int previewDuration) {
		this.previewDuration = previewDuration;
	}

	public String getCoverImagePath() {
		return coverImagePath;
	}

	public void setCoverImagePath(String coverImagePath) {
		this.coverImagePath = coverImagePath;
	}

	public String getEnvironmentName() {
		return environmentName;
	}

	public void setEnvironmentName(String environmentName) {
		this.environmentName = environmentName;
	}

	public List<BSDifficultyLevel> getDifficultyLevels() {
		return difficultyLevels;
	}

	public void setDifficultyLevels(List<BSDifficultyLevel> difficultyLevels) {
		this.difficultyLevels = difficultyLevels;
	}

}
