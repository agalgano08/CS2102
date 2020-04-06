import static org.junit.Assert.*;

import org.junit.Test;

public class Examples {

	RoboticsTeam team1 = new RoboticsTeam("WPI", "Spinner", 0);
	RoboticsTeam team2 = new RoboticsTeam("RPI", "Spinner", 5); 
	RoboticsTeam team3 = new RoboticsTeam("QCC", "Spinner", 5); 
	RoboticsTeam team4 = new RoboticsTeam("QCC", "Spinner", 12); 
	
	RoboticsResult result1 = new RoboticsResult(team1, team2, 16, 8, true, 16, 8, true);
	RoboticsResult result2 = new RoboticsResult(team1, team2, 12, 7, false, 16, 7, false);
	RoboticsResult result3 = new RoboticsResult(team1, team2, 8, 3, true, 10, 2, false);
	
	
	//team 2 has score of 10 team 1 has score of 0
	@Test
	public void team2ExpectToBeatTeam1() {
		assertTrue(team2.expectToBeat(team1));
	}
	
	// both have previous score of 10
	@Test
	public void team2ExpectToBeatTeam3() {
		assertFalse(team2.expectToBeat(team3));
	}
	
	// 8 tasks is not possible 
	@Test
	public void result1IsValid() {
		assertFalse(result1.isValid());
	}
	
	//16 points are possible
	@Test
	public void result2IsValid() {
		assertTrue(result2.isValid());
	}
	
	@Test
	public void 
	

}
