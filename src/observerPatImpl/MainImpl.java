package observerPatImpl;

public class MainImpl {
	public static void main(String args[]) {
		System.out.println("this is main function for mainimpl");
		CurrentScore cs = new CurrentScore();
		AverageScore as = new AverageScore();
		CricketData cricketData =  new CricketData();
		
		cricketData.addObservers(cs);
		cricketData.addObservers(as);
		cricketData.notifyObservers();
		
		cricketData.removerObserver(cs);
		cricketData.notifyObservers();
		
		
	}

}
