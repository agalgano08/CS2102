
public class RoboticsResult implements IResult{
	
	RoboticsTeam team1;
	RoboticsTeam team2;
	
	double team1points;
	int team1tasks;
	boolean team1fell;
	
	double team2points;
	int team2tasks;
	boolean team2fell;

	
	  RoboticsResult(RoboticsTeam team1, RoboticsTeam team2, 
              		 double team1points, int team1tasks, boolean team1fell,
              		 double team2points, int team2tasks, boolean team2fell) {
		  
			this.team1 = team1;
			this.team2 = team2;
			
			this.team1points = team1points;
			this.team2points = team1tasks;
			this.team1fell = team1fell;
			
			this.team2points = team2points;
			this.team2tasks= team2tasks;
			this.team2fell = team2fell;
	  }
	  
	  public boolean isValid(){
		  return (this.team1points <= 16 && this.team2points <=16 
				  && this.team1tasks < 8 && this.team2tasks < 8);
	  }
	  
	  public double getScore(double points, int tasks, boolean robotFell) {
		  if(robotFell) {
			  return points + tasks - 5;
		  }
		  else {
			  return points + tasks;
		  }
		  
	  }
	  
	  public IContestant getWinner() {
		  double team1Score = this.getScore(this.team1points, this.team1tasks, this.team1fell);
		  double team2Score = this.getScore(this.team2points, this.team2tasks, this.team2fell);
		  
			if(team1Score > team2Score) {
				return this.team1;
			}
			else {
				return this.team2;
			}	
		  
		  
	  }
		
}
