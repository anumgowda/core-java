package com.xworkz.games.dto;

public class GameDTO {
	private int gameId;
	private String name;
	private int noOfPlayers;
	private String type;
	
	public GameDTO() {
		
	}
	public GameDTO(int gameId, String name, int noOfPlayers, String type) {
		super();
		this.gameId = gameId;
		this.name = name;
		this.noOfPlayers = noOfPlayers;
		this.type = type;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfPlayers() {
		return noOfPlayers;
	}
	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	

}
