package observerPatImpl;

public class AverageScore implements Observer {

	@Override
	public void updateDisplay(int runs, int wickets, float overs) {
		// TODO Auto-generated method stub
		System.out.println("This is in AS dashbaord");
		System.out.println("Runs "+runs/100);
		System.out.println("Runs "+wickets);
		System.out.println("Runs "+overs);
		
	}

}
