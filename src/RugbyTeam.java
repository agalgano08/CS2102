
public class RugbyTeam implements IContestant {
	
	String country;
	String jerseyColor;
	boolean hasRitual;
	int wins;
	int losses;
	
	RugbyTeam(String country, String jerseyColor, boolean hasRitual, int wins, int losses){
		this.country = country;
		this.hasRitual = hasRitual;
		this.jerseyColor = jerseyColor;
		this.wins = wins;
		this.losses = losses;
	}
	
	// this method is redundant but I wanted to make sure I covered all the scenarios and could visualize it
	public boolean expectToBeat(RugbyTeam rival){
		if(this.hasRitual == rival.hasRitual) {
			if(this.wins-this.losses > rival.wins-rival.losses ) {
				return true;
			}
			
			if(this.wins-this.losses < rival.wins-rival.losses ) {
				return false;
			}
		}
		if(this.hasRitual && rival.hasRitual == false) {
			return true;
		}
		if(this.hasRitual == false && rival.hasRitual) {
			return false;
		}
		else {
			return false;
		}
	}
}
