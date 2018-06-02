package at.neonartworks.jbsaber.core;

/**
 * Represents an obstacle in BeatSaber.
 * 
 * @author Florian Wagner
 *
 */
public class BSObstacle {

	private double _time;
	private int _lineIndex;
	private int _type;
	private int _duration;
	private int _width;

	/**
	 * Creates a new obstacle.
	 * 
	 * @param _time
	 *            Obstacle time position in beats
	 * @param _lineIndex
	 *            Obstacle horizontal position (0 to 3, start from left)
	 * @param _type
	 *            Obstacle type (0 = wall, 1 = ceiling)
	 * @param _duration
	 *            Obstacle length in beats
	 * @param _width
	 *            Obstacle width in lines (extend to the right)
	 */
	public BSObstacle(double _time, int _lineIndex, int _type, int _duration, int _width) {
		super();
		this._time = _time;
		this._lineIndex = _lineIndex;
		this._type = _type;
		this._duration = _duration;
		this._width = _width;
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

	public int getType() {
		return _type;
	}

	public void setType(int _type) {
		this._type = _type;
	}

	public int getDuration() {
		return _duration;
	}

	public void setDuration(int _duration) {
		this._duration = _duration;
	}

	public int getWidth() {
		return _width;
	}

	public void setWidth(int _width) {
		this._width = _width;
	}

}
