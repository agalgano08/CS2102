
public class Match {

	IContestant contestant1;
	IContestant contestant2;
	
	IResult result;
	
	Match(IContestant contestant1, IContestant contestant2, IResult result){
		this.contestant1 = contestant1;
		this.contestant2 = contestant2;
		this.result= result;
	}
	
	public IContestant winner(){
		if(this.result.isValid()) {
			return this.result.getWinner();
		}
		else {
			return null;
		}
	}
}
