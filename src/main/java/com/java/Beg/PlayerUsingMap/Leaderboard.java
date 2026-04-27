package com.java.Beg.PlayerUsingMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leaderboard {
	
	private Map<String, Integer> scoreMap = new HashMap<String, Integer>();
	
//	Add or Update Score 
	public void addScore(String player , int score) {
		scoreMap.put("SUNIL", 100);
		scoreMap.put("HARISH", 120);
		scoreMap.put("RAKESH", 132);
	}
	
	
//	to find Out the Highest rank from above Data 
//	or to get Top N players 
	public List<Player> getTopPlayer(int n){
		
		List arr = new ArrayList<>();
		
		return arr;
	}

}
