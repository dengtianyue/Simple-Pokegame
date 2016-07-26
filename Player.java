package Pokegame;

import java.util.ArrayList;
import java.util.List;
/**
 * 定义类Player及其set，get方法，并规定数组playerCards1,2,为比较时做准备
 * @author tyt
 *
 */
public class Player {
	String playerId;
	String playerName;
	public List<Card> playerCards1;
	public List<Card> playerCards2;
	
	public List<Card> getPlayerCards1() {
		return playerCards1;
	}
	public List<Card> getPlayerCards2() {
		return playerCards2;
	}

	public String getPlayerId() {
		return playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Player(){
		this.playerCards1 = new ArrayList<Card>();
		this.playerCards2 = new ArrayList<Card>();
	}

}
