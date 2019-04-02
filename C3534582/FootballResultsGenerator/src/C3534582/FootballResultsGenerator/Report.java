package C3534582.FootballResultsGenerator;


public class Report {
	String games;
	public Report() {
		FileManager fm = new FileManager();
		
		games = fm.readFromFile();
	}
	
	public int totalMatchesPlayed() {
		
			String[] SuM = games.split("\n");
			return SuM.length;	
		
	}
	
	public int totalhomeScores() {
		String[] ListOfMatches = games.split("\n");
		int homeScoresCount = 0;
		for(int i=0; i < ListOfMatches.length; i++) {
			String[] Match = ListOfMatches[i].split(":");
			homeScoresCount += Integer.parseInt(Match[2].trim());
		}
		return homeScoresCount;
	}
	
	public int totalawayScores() {
		String[] ListOfMatches = games.split("\n");
		int homeScoresCount = 0;
		for(int i=0; i < ListOfMatches.length; i++) {
			String[] Match = ListOfMatches[i].split(":");
			homeScoresCount += Integer.parseInt(Match[3].trim());
		}
		return homeScoresCount;
	}
	
	public int totalDrawScores() {
		String[] ListOfMatches = games.split("\n");
		int totalDraws = 0;
		for(int i=0; i < ListOfMatches.length; i++) {
			String[] Match = ListOfMatches[i].split(":");
			if (Integer.parseInt(Match[2].trim()) == Integer.parseInt(Match[3].trim())) {
				totalDraws += 1;
			}
		}
		return totalDraws;
	}
	
	public int highestHomeScore() {
		String[] ListOfMatches = games.split("\n");
		int HighestHomeScore = 0;
		for(int i=0; i < ListOfMatches.length; i++) {
			String[] Match = ListOfMatches[i].split(":");
			if (Integer.parseInt(Match[2].trim()) > HighestHomeScore) {
				HighestHomeScore = Integer.parseInt(Match[2].trim());
			}
		}
		return HighestHomeScore;
	}
	
	public int HighestAwayScore() {
		String[] ListOfMatches = games.split("\n");
		int HighestAwayScore = 0;
		for(int i=0; i < ListOfMatches.length; i++) {
			String[] Match = ListOfMatches[i].split(":");
			if (Integer.parseInt(Match[3].trim()) > HighestAwayScore) {
				HighestAwayScore = Integer.parseInt(Match[3].trim());
			}
		}
		return HighestAwayScore;
	}
	
	public int noOfErrors() {
		int totalInvalidEntries = 0;
		String[] ListOfGames = games.split("\n");
		for (int i =0; i < ListOfGames.length; i++) {	
			String[] Match = ListOfGames[i].split(":");
			if (Match[0] == "") {
				totalInvalidEntries += 1;
				System.out.println("ERROR: Home Team Name Missing");
			}
			if (Match[1] == "") {
				totalInvalidEntries += 1;
				System.out.println("ERROR: Away Team Name Missing");
			}
			if (Match[2] == "") {
				totalInvalidEntries += 1;
				System.out.println("ERROR: Home Team Score Missing");
			}
			if (Match[3] == "") {
				totalInvalidEntries += 1;
				System.out.println("ERROR: Home Team Score Missing");
			}
		}
		return totalInvalidEntries;
	}
}
