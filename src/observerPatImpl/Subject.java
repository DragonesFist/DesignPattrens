package observerPatImpl;

import java.util.ArrayList;

public interface Subject {
	
	public ArrayList<Observer> addObservers(Observer o);
	public ArrayList<Observer> removerObserver(Observer o);
	public void notifyObservers();

	
}
