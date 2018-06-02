package at.neonartworks.jbsaber.examples;

import java.util.ArrayList;
import java.util.List;

import at.neonartworks.jbsaber.core.BSCutDirection;
import at.neonartworks.jbsaber.core.BSDifficulty;
import at.neonartworks.jbsaber.core.BSDifficultyRank;
import at.neonartworks.jbsaber.core.BSEvent;
import at.neonartworks.jbsaber.core.BSInfo;
import at.neonartworks.jbsaber.core.BSNote;
import at.neonartworks.jbsaber.core.BSNoteType;
import at.neonartworks.jbsaber.core.BSObstacle;
import at.neonartworks.jbsaber.core.BSStringTable;
import at.neonartworks.jbsaber.core.BSTrack;
import at.neonartworks.jbsaber.core.BSUtil;
import at.neonartworks.jbsaber.core.BSWriter;
import at.neonartworks.jbsaber.core.BSDifficultyLevel;

public class JBSExample {
	private static BSWriter writer = BSWriter.getInstance(); // aquire the writer
	private static List<BSDifficultyLevel> diffLevels = new ArrayList<BSDifficultyLevel>(); // the difficulties of our map
	private static List<BSEvent> events = new ArrayList<BSEvent>(); // stores every event
	private static List<BSNote> notes = new ArrayList<BSNote>(); // sotres every note
	private static List<BSObstacle> obstacles = new ArrayList<BSObstacle>(); // stores every obstacle

	public static void main(String[] args) {

		double BPM = 140.0d; // bpm of the used song

		BSDifficultyLevel expertLevel = new BSDifficultyLevel(BSDifficulty.EXPERT, BSDifficultyRank.EXPERT, "nyanCat.ogg");
		diffLevels.add(expertLevel);

		BSInfo infojs = new BSInfo("SONG NAME", "SONG AUTHOR", "MAP AUTHOR", BPM, 12, 10, "cover.jpg",
				"NiceEnvironment", diffLevels);

		int someTimeInMS = 0;
		double time = BSUtil.ms2beats(someTimeInMS, BPM);

		// example of how to add notes
		notes.add(new BSNote(time, BSUtil.randInt(2, 3), BSUtil.randInt(0, 2), BSNoteType.BLUE, BSUtil.randInt(0, 8)));
		notes.add(new BSNote(time, BSUtil.randInt(0, 1), BSUtil.randInt(0, 2), BSNoteType.RED, BSUtil.randInt(0, 8)));

		BSCutDirection direction = BSCutDirection.DOWN_LEFT;
		notes.add(new BSNote(time, BSUtil.randInt(0, 1), BSUtil.randInt(0, 2), BSNoteType.RED, direction));
		BSTrack track = new BSTrack(BSStringTable.formatVersion, BPM, 8, 12, 0, 0.5, events, notes, obstacles);
		
		writer.writeInfo(infojs, "./");
		writer.writeTrack(track, BSDifficulty.EXPERT, "./");
	}
}