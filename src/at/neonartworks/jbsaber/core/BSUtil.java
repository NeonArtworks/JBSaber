package at.neonartworks.jbsaber.core;

import java.util.Random;

/**
 * Simple utility class
 * 
 * @author Florian Wagner
 *
 */
public class BSUtil {

	/**
	 * Converts time (in milliseconds) into the time in beats
	 * 
	 * @param time
	 *            time in milliseconds
	 * @param bpm
	 *            the bpm of the track
	 * @return the position in beats
	 */
	public static double ms2beats(double time, double bpm) {
		return (time * bpm) / (1000d * 60d);
	}

	/**
	 * Generates a random int value in between (including) min/max.
	 * 
	 * @param min
	 *            minimum value
	 * @param max
	 *            maximum value
	 * @return a random int
	 */
	public static int randInt(int min, int max) {

		Random rand = new Random();

		int randomNum = rand.nextInt((max - min) + 1) + min;

		return randomNum;
	}

	/**
	 * Checks if the song name has .ogg or not
	 * 
	 * @param song
	 *            the song name as String
	 * @return
	 */
	public static String checkSong(String song) {
		if (song.contains(".ogg"))
			return song;
		else
			song = song + ".ogg";
		return song;
	}

	/**
	 * Checks if the cover name has .jpg or not
	 * 
	 * @param cover
	 *            the cover file name as String
	 * @return
	 */
	public static String checkCover(String cover) {
		if (cover.contains(".jpg"))
			return cover;
		else
			cover = cover + ".jpg";
		return cover;
	}

	/**
	 * Rounds a value to a some decimal placesF
	 * 
	 * @param value
	 *            the value to round
	 * @param places
	 *            the decimalplaces of the new double
	 * @return
	 */
	public static double round(double value, int places) {
		if (places < 0)
			throw new IllegalArgumentException();

		long factor = (long) Math.pow(10, places);
		value = value * factor;
		long tmp = Math.round(value);
		return (double) tmp / factor;
	}
}
