package observerPatImpl;

public class CurrentScore implements Observer {

//	@Override
	@Override
	public void updateDisplay(int runs, int wickets, float overs) {
		// TODO Auto-generated method stub
		System.out.println("This is in CS dashboard");
		System.out.println("Runs "+runs);
		System.out.println("Runs "+wickets);
		System.out.println("Runs "+overs);
		
	}

}
