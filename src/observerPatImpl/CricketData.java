package observerPatImpl;

import java.util.ArrayList;
import java.util.Iterator;

public class CricketData implements Subject{
	
	int run;
	int wickets;
	float overs;
	ArrayList<Observer> obs= new ArrayList<Observer>();
	private Object runs;
	
	public int getRecentRuns() {
		return 99;
	}
	
	public int getRecentWickets() {
		return 9;
	}
	
	public float getRecentOvers() {
		return 2;
	}

	@Override
	public ArrayList<Observer> addObservers(Observer o) {
		// TODO Auto-generated method stub
		obs.add(o);
		return obs;
	}

	@Override
	public ArrayList<Observer> removerObserver(Observer o) {
		// TODO Auto-generated method stub
		obs.remove(o);
		return obs;
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		int runs = getRecentRuns();
		int wickets = getRecentWickets();
		float overs = getRecentOvers();
		for (Iterator<Observer> it = 
	              obs.iterator(); it.hasNext();) 
	        { 
	            Observer o = it.next(); 
	            o.updateDisplay( runs,wickets,overs); 
	        } 		
	}
		
	}


