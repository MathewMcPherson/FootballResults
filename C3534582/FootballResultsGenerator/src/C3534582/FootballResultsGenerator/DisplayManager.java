package C3534582.FootballResultsGenerator;


public class DisplayManager 
{
	public FileManager fm = new FileManager();
	
	public void DisplayMenuOptions() 
	{
		System.out.println("FOOTBALL RESULTS GENERATOR");
		System.out.println("1. Enter matches");
		System.out.println("2. Display matches");
		System.out.println("3. Display fixtures (table format)");
		System.out.println("4. Display League Table");
		System.out.println("5. exit");
	}
	
	public void DisplayMatches() 
	{
		String filetext = fm.readFromFile();
		String[] ListOfMatches = filetext.split("\n");
		
		for(int i = 0; i < ListOfMatches.length; i++) {
			String Match = ListOfMatches[i];
			String[] SuM = Match.split(":");
			System.out.println(SuM[0].trim() + " [" + SuM[2].trim() + "] | " + SuM[1].trim() + " [" + SuM[3].trim() + "]");
		}
	}
	
	public void DisplayMatchesTable() {
		String filetext = fm.readFromFile();
		String[] ListOfMatches = filetext.split("\n");
		String format = String.format("%20s %20s %20s %20s", "HOME TEAM", "AWAY TEAM", "HOME SCORE", "AWAY SCORE");
		
		System.out.println(format);
		for(int i = 0; i < ListOfMatches.length; i++) {
			String Match = ListOfMatches[i];
			String[] SuM = Match.split(":");
			String stringformat = String.format("%20s %20s %20s %20s", SuM[0].trim(), SuM[1].trim(), SuM[2].trim(), SuM[3].trim());
			System.out.println(stringformat);
		}
	}
	
	public void DisplayLeagueTable() {
		String HeadersFormat = String.format("%20s %7s %7s %7s %7s %7s %7s %7s %7s", "TEAM NAME", "MP", "W", "D", "L", "GF", "GA", "GD", "P");
		System.out.println(HeadersFormat);

		for (int i = 0; i < 1; i++) {
			
			String TeamsFormat = String.format("%20s %7s %7s %7s %7s %7s %7s %7s %7s", "0", "0", "0", "0", "0", "0", "0", "0");
			System.out.println(TeamsFormat);
		}		
	}
	
	public void DisplayReport() {
		Report r = new Report();
		System.out.println("Total number of matches played: " + r.totalMatchesPlayed());
		System.out.println("Total Home Goals Scored: " + r.totalhomeScores());
		System.out.println("Total Away Goals Scored: " + r.totalawayScores());
		System.out.println("Total number of draws: " + r.totalDrawScores());
		System.out.println("Highest home score: " + r.highestHomeScore());
		System.out.println("Highest away score: " + r.HighestAwayScore());
		System.out.println("Total invalid entries: " + r.noOfErrors());
	}
}
