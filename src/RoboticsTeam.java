
public class RoboticsTeam implements IContestant {
	
	String school;
	String specialFeature;
	int lastScore = 0;
	
	RoboticsTeam(String school, String specialFeature, int lastScore){
		this.school = school;
		this.specialFeature = specialFeature;
		this.lastScore = lastScore;
	}
	
	public boolean expectToBeat(RoboticsTeam rival){
		if(this.lastScore > rival.lastScore) return true;
		if(this.lastScore < rival.lastScore) return false;
		else return false;
	}
	
}
