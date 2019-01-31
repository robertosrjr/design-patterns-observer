package com.gmail.robertosrjr.observer;

public interface Subject {
	
	void registerObserver(Observer observer);
	void removeObserver(Observer obsserver);
	void notifyObservers();

}
