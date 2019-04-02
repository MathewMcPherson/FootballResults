package C3534582.FootballResultsGenerator;

public class Match {
	public String match;
	public Match(String fixture) {
		match = fixture;
		FileManager fm = new FileManager();
		if (fixture.split(":").length == 4) {
			fm.WritetoFile(fixture);
		}
	}
}
