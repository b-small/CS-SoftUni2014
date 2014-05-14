package game;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author team Cluster
 */

public class StatusLine {
	private String playerName;
	private int level;
	private int moves;
	private double time;
	private static List<StatusLine> saveObjects = new ArrayList<StatusLine>();

	public StatusLine(String playerName) {

		setPlayerName(playerName);
		setLevel(1);
		setMoves(0);
		setTime(0);
		getSaveObjects().add(this);

	}

	public String getPlayerName() {

		return this.playerName;

	}

	public void setPlayerName(String playerName) {
		if (playerName.equals(" ")) {
			this.playerName = "guest";
		} else {
			this.playerName = playerName;
		}
	}

	public int getLevel() {

		return this.level;

	}

	public void setLevel(int level) {
		if (level < 1) {
			this.level = 1;
		} else {
			this.level = level;
		}
	}

	public int getMoves() {

		return this.moves;

	}

	public void setMoves(int moves) {
		if (moves < 0) {
			this.moves = 0;
		} else {
			this.moves = moves;
		}
	}

	public double getTime() {

		return this.time;

	}

	public void setTime(double time) {
		if (time < 0) {
			this.time = 0;
		} else {
			this.time = time;
		}
	}

	public static List<StatusLine> getSaveObjects() {
		return saveObjects;
	}


	public String toString() {

		String playerInfo = String.format("%d %s\t%.2f\t%d", this.getLevel(),
				this.getPlayerName(), this.getTime(), this.getMoves());
		return playerInfo;

	}

}
