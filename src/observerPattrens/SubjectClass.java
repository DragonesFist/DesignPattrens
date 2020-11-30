package observerPattrens;

public class SubjectClass {
	int runs, wickets;
	float overs;
	
	CurrrenScore cs;
	AverageScroe as;
	public SubjectClass(CurrrenScore cs, AverageScroe as) {
		super();
		this.cs = cs;
		this.as = as;
	}
	public int getRuns() {
		return 100;
	}
	public int getWickets() {
		return 10;
	}
	public float getOvers() {
		return 2;
	}
	
	public void pushDataToDisplays() {
		int runs = getRuns();
		int wickets = getWickets();
		float overs = getOvers();
//		CurrrenScore cs = new CurrrenScore();
//		AverageScroe as = new AverageScroe();
		
		cs.updateCurrentScore(runs, wickets, overs);
		as.updateAverageScore(runs, wickets, overs);
		
		
	}
}
	
	
	
	
	
	


