package C3534582.FootballResultsGenerator;

public class Team {
	public int Wins, Draws, Losses, GoalsFor, GoalsAgainst;
	public String Name;
	
	public Team(String TeamName) {
		Name = TeamName;
		Wins = 0;
		Draws = 0;
		Losses = 0;
		GoalsFor = 0;
		GoalsAgainst = 0;
	}
	
	public String getTeamName() {
		return Name;
	}
	
	public int getWins() {
		return Wins;
	}
	
	public void setWins(int wins) {
		Wins = wins;
	}
	
	public int getDraws() {
		return Draws;
	}
	
	public void setDraws(int draws) {
		Draws = draws;
	}
	
	public int getLosses() {
		return Losses;
	}
	
	public void setLosses(int losses) {
		Losses = losses;
	}
	
	public int getGoalsFor() {
		return GoalsFor;
	}
	
	public void setGoalsFor(int goalsfor) {
		GoalsFor = goalsfor;
	}
	
	public int getGoalsAgainst() {
		return GoalsAgainst;
	}
	
	public void setGoalsAgainst(int goalsagainst) {
		
	}
}
