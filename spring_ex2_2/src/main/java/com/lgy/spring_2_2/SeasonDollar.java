package com.lgy.spring_2_2;

public class SeasonDollar {
	public static void main(String[] args) {
		Season s = new Season();
		s.setMonth(9);
		s.calcSeason();
		
		Won2dollar wd = new Won2dollar();
		wd.setWon(3300);
		wd.exchange2Dollar();
	}
}
