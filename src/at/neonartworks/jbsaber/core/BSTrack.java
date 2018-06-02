package at.neonartworks.jbsaber.core;

import java.util.List;

/**
 * Represents a map in BeatSaber
 * 
 * @author Florian Wagner
 *
 */
public class BSTrack {

	private String _version = BSStringTable.formatVersion;
	private double _beatsPerMinute;
	private int _beatsPerBar = 8;
	private double _noteJumpSpeed = 12;
	private double _shuffle = 0;
	private double _shufflePeriod = 0.5;
	private List<BSEvent> _events;
	private List<BSNote> _notes;
	private List<BSObstacle> _obstacles;

	/**
	 * Creates a new Track
	 * 
	 * @param _version
	 *            use {@link BSStringTable#formatVersion}
	 * @param _beatsPerMinute
	 *            the bpm of the map
	 * @param _beatsPerBar
	 *            unknown (does nothing for me, if you find what it does please tell
	 *            me)
	 * @param _noteJumpSpeed
	 *            unknown
	 * @param _shuffle
	 *            unknown
	 * @param _shufflePeriod
	 *            unknown
	 * @param _events
	 *            all events of the map
	 * @param _notes
	 *            all notes of the map
	 * @param _obstacles
	 *            all obstacles of the map
	 */
	public BSTrack(String _version, double _beatsPerMinute, int _beatsPerBar, double _noteJumpSpeed, double _shuffle,
			double _shufflePeriod, List<BSEvent> _events, List<BSNote> _notes, List<BSObstacle> _obstacles) {
		super();
		this._version = _version;
		this._beatsPerMinute = _beatsPerMinute;
		this._beatsPerBar = _beatsPerBar;
		this._noteJumpSpeed = _noteJumpSpeed;
		this._shuffle = _shuffle;
		this._shufflePeriod = _shufflePeriod;
		this._events = _events;
		this._notes = _notes;
		this._obstacles = _obstacles;
	}

	public String getVersion() {
		return _version;
	}

	public void setVersion(String _version) {
		this._version = _version;
	}

	public double getBeatsPerMinute() {
		return _beatsPerMinute;
	}

	public void setBeatsPerMinute(double _beatsPerMinute) {
		this._beatsPerMinute = _beatsPerMinute;
	}

	public int getBeatsPerBar() {
		return _beatsPerBar;
	}

	public void setBeatsPerBar(int _beatsPerBar) {
		this._beatsPerBar = _beatsPerBar;
	}

	public double getNoteJumpSpeed() {
		return _noteJumpSpeed;
	}

	public void setNoteJumpSpeed(double _noteJumpSpeed) {
		this._noteJumpSpeed = _noteJumpSpeed;
	}

	public double getShuffle() {
		return _shuffle;
	}

	public void setSuffle(double _shuffle) {
		this._shuffle = _shuffle;
	}

	public double getShufflePeriod() {
		return _shufflePeriod;
	}

	public void setShufflePeriod(double _shufflePeriod) {
		this._shufflePeriod = _shufflePeriod;
	}

	public List<BSEvent> getEvents() {
		return _events;
	}

	public void setEvents(List<BSEvent> _events) {
		this._events = _events;
	}

	public List<BSNote> getNotes() {
		return _notes;
	}

	public void setNotes(List<BSNote> _notes) {
		this._notes = _notes;
	}

	public List<BSObstacle> getObstacles() {
		return _obstacles;
	}

	public void setObstacles(List<BSObstacle> _obstacles) {
		this._obstacles = _obstacles;
	}

}
