package at.neonartworks.jbsaber.core;

/**
 * Represents a note in BeatSaber
 * 
 * @author Florian Wagner
 *
 */
public class BSNote {

	private double _time;
	private int _lineIndex;
	private int _lineLayer;
	private int _type;
	private int _cutDirection;

	/**
	 * Creates a new note.
	 * 
	 * @param _time
	 *            Note time position in beats
	 * @param _lineIndex
	 *            Note horizontal position (0 to 3, start from left)
	 * @param _lineLayer
	 *            Note vertical position (0 to 2, start from bottom)
	 * @param _type
	 *            Note type (0 = red, 1 = blue, 3 = bomb)
	 * @param _cutDirection
	 *            Note cut direction (0 = up, 1 = down, 2 = left, 3 = right, 4 = up
	 *            left, 5 = up right, 6 = down left, 7 = down right, 8 = no
	 *            direction)
	 */
	public BSNote(double _time, int _lineIndex, int _lineLayer, BSNoteType _type, BSCutDirection _cutDirection) {
		super();
		this._time = _time;
		this._lineIndex = _lineIndex;
		this._lineLayer = _lineLayer;
		this._type = _type.getID();
		this._cutDirection = _cutDirection.getID();
	}

	/**
	 * Creates a new note.
	 * 
	 * @param _time
	 *            Note time position in beats
	 * @param _lineIndex
	 *            Note horizontal position (0 to 3, start from left)
	 * @param _lineLayer
	 *            Note vertical position (0 to 2, start from bottom)
	 * @param _type
	 *            Note type (0 = red, 1 = blue, 3 = bomb)
	 * @param _cutDirection
	 *            Note cut direction (0 = up, 1 = down, 2 = left, 3 = right, 4 = up
	 *            left, 5 = up right, 6 = down left, 7 = down right, 8 = no
	 *            direction)
	 */
	public BSNote(double _time, int _lineIndex, int _lineLayer, BSNoteType _type, int _cutDirection) {
		super();
		this._time = _time;
		this._lineIndex = _lineIndex;
		this._lineLayer = _lineLayer;
		this._type = _type.getID();
		this._cutDirection = _cutDirection;
	}

	public double getTime() {
		return _time;
	}

	public void setTime(double _time) {
		this._time = _time;
	}

	public int getLineIndex() {
		return _lineIndex;
	}

	public void setLineIndex(int _lineIndex) {
		this._lineIndex = _lineIndex;
	}

	public int getLineLayer() {
		return _lineLayer;
	}

	public void setLineLayer(int _lineLayer) {
		this._lineLayer = _lineLayer;
	}

	public int getType() {
		return _type;
	}

	public void setType(int _type) {
		this._type = _type;
	}

	public int getCutDirection() {
		return _cutDirection;
	}

	public void setCutDirection(int _cutDirection) {
		this._cutDirection = _cutDirection;
	}

}
