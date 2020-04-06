import static org.junit.Assert.*;

import org.junit.Test;

public class Examples {

	RoboticsTeam team1 = new RoboticsTeam("WPI", "Spinner", 0);
	RoboticsTeam team2 = new RoboticsTeam("RPI", "Spinner", 5); 
	RoboticsTeam team3 = new RoboticsTeam("QCC", "Spinner", 5); 
	RoboticsTeam team4 = new RoboticsTeam("QCC", "Spinner", 12); 
	
	RoboticsResult result1 = new RoboticsResult(team3, team4, 16, 8, false, 16, 8, true);
	RoboticsResult result2 = new RoboticsResult(team1, team2, 12.2, 7, false, 16, 7, false);
	RoboticsResult result3 = new RoboticsResult(team1, team2, 8.1, 3, true, 10, 2, false);
	RoboticsResult result4 = new RoboticsResult(team2, team3, 10, 3, false, 10, 3, false);
	
	Match match1 = new Match(team3, team4, result1);
	Match match2 = new Match(team1, team2, result2);
	Match match3 = new Match(team2, team3, result4);
	
	RugbyTeam team10 = new RugbyTeam("ENG", "White", false, 14, 2);  	
	RugbyTeam team20 = new RugbyTeam("CDA", "Black", true, 13, 2); 
	RugbyTeam team30 = new RugbyTeam("SWE", "Green", false, 14, 2); 
	RugbyTeam team40 = new RugbyTeam("USA", "Red", true, 30, 0); 
	RugbyTeam team50 = new RugbyTeam("SWE", "Green", false, 20, 2);
	
	RugbyResult result10 = new RugbyResult(team30, team40, 150, 20);
	RugbyResult result20 = new RugbyResult(team10, team20, 25, 20);
	RugbyResult result30 = new RugbyResult(team10, team20, 149, 148);
	RugbyResult result40 = new RugbyResult(team20, team30, 30, 30);
	
	Match match10 = new Match(team30, team40, result10);
	Match match20 = new Match(team10, team20, result20);
	Match match30 = new Match(team20, team30, result40);
	
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
	
	// result3 team1 inputed into getScore not taking into account if score is valid
	@Test
	public void result3GetScoreTeam1() {
		assertEquals(6.1, result3.getScore(8.1, 3, true),0.01);
	}
	
	// result2 team2 inputed into get score
	@Test
	public void result2GetScoreTeam2() {
		assertEquals(23 , result2.getScore(16, 7, false), 1);
	}
	
	//  Result of the match is not valid so returns null
	@Test
	public void nullWinner() {
		assertEquals(null, match1.winner());
	}
	
	//  Result of the match is valid
	@Test
	public void team2Wins() {
		assertEquals(team2, match2.winner());
	}
	
	
	
	
	
	
	
	// Both have ritual team40 has more wins
	@Test
	public void team20ExpectToBeatTeam40() {
		assertFalse(team20.expectToBeat(team40));
	}
	
	// Both have no ritual and same record
	@Test
	public void team10ExpectToBeatTeam30() {
		assertFalse(team10.expectToBeat(team30));
	}
	
	// Neither have no ritual but team50 has more wins
	@Test
	public void team10ExpectToBeatTeam50() {
		assertFalse(team10.expectToBeat(team50));
	}
	
	
	// 150 points is not possible 
	@Test
	public void result10IsValid() {
		assertFalse(result10.isValid());
	}
	
	//149 points are vaild
	@Test
	public void result30IsValid() {
		assertTrue(result30.isValid());
	}
	
	
	//  Result of the match is not valid so returns null
	@Test
	public void nullWinnerRugby() {
		assertEquals(null, match10.winner());
	}
	
	//  Result of the match is valid
	@Test
	public void team10Wins() {
		assertEquals(team10, match20.winner());
	}
	
	
	
}
