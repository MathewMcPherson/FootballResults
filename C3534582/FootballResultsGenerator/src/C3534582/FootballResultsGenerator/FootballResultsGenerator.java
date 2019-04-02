package C3534582.FootballResultsGenerator;

import java.util.Scanner;

public class FootballResultsGenerator {

	public static void main(String[] args) {
		DisplayManager dm = new DisplayManager();
		Scanner in = new Scanner(System.in);
		
		boolean run = true;
		while(run) {
			dm.DisplayMenuOptions();
			int menuchoice = in.nextInt();
			if (menuchoice > 0 && menuchoice <= 5) {
				if (menuchoice == 1) {
					String fixture;
					System.out.println("Begin entering matches: ");
					do {
						fixture = in.nextLine();
						if (!fixture.equalsIgnoreCase("Stop")) {
							Match match = new Match(fixture);
						}
					} while (!fixture.equalsIgnoreCase("Stop"));
					dm.DisplayReport();
				}
				else if (menuchoice == 2) {
					dm.DisplayMatches();
				}
				
				else if (menuchoice == 3) {
					dm.DisplayMatchesTable();
				}
				
				else if (menuchoice == 4) {
					dm.DisplayLeagueTable();
				}
				
				else if (menuchoice == 5) {
					in.close();
					run = false;
				}	
			}	
		}
	}
}
