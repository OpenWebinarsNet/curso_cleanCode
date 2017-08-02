package io.pello.refactorings.encapsultacollection;

import java.util.ArrayList;
import java.util.Date;

public class Team {
	private String name;
	private Date creation;
	private ArrayList<Player> players = new ArrayList<Player>();

	public Team(String name, Date creation) {
		this.name = name;
		this.creation = creation;
	}

	public String getName() {
		return name;
	}

	public Date getCreation() {
		return creation;
	}
	
	public ArrayList<Player> getPlayers() {
		return players;
	}

	public int totalPlayers() {
		return players.size();
	}
}
