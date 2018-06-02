package at.neonartworks.jbsaber.core;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * BSWriter uses GSON to write the map/info to json files
 * 
 * @author Florian Wagner
 *
 */
public class BSWriter {
	private static BSWriter instance;
	private final static GsonBuilder gsonB = new GsonBuilder();
	private static final Gson gson;
	static {
		// System.out.println(configFile); DEBUG

		gsonB.setPrettyPrinting();
		gson = gsonB.create();
	}

	public static BSWriter getInstance() {
		if (instance == null) {
			instance = new BSWriter();
		}
		return instance;
	}

	/**
	 * Writes the info.json using the {@link BSInfo} object.
	 * 
	 * @param q
	 *            the {@link BSInfo} object.
	 * @param path
	 *            the path where to write to
	 */
	public void writeInfo(BSInfo q, String path) {

		String jsonOut = gson.toJson(q);
		Path p = new File(path + "/" + BSStringTable.infoJSON).toPath();
		try {
			BufferedWriter writer = Files.newBufferedWriter(p, StandardCharsets.UTF_8);
			writer.append(jsonOut);

			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Writes the track to a json file.
	 * 
	 * @param track
	 *            the track
	 * @param expert
	 *            the difficulty of the track
	 * @param path
	 *            the path where to write it to
	 */
	public void writeTrack(BSTrack track, BSDifficulty expert, String path) {
		String jsonOut = gson.toJson(track);
		Path p = new File(path + expert.toString() + ".json").toPath();
		try {
			BufferedWriter writer = Files.newBufferedWriter(p, StandardCharsets.UTF_8);
			writer.append(jsonOut);

			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
