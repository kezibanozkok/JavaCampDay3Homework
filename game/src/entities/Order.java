package entities;

import abstractt.Entity;

public class Order implements Entity{
	private int id;
	private int gameId;
	private int playerId;
	int campaignId;
	
	public Order() {
		
	}

	public Order(int id, int gameId, int playerId) {
		super();
		this.id = id;
		this.gameId = gameId;
		this.playerId = playerId;
	}

	public Order(int id, int gameId, int playerId, int campaignId) {
		super();
		this.id = id;
		this.gameId = gameId;
		this.playerId = playerId;
		this.campaignId = campaignId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}
	
}
