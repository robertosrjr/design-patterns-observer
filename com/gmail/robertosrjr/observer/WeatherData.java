package com.gmail.robertosrjr.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
	
	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	
	public WeatherData() {

		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer observer) {

		this.observers.add(observer);
	}

	@Override
	public void removeObserver(Observer obsserver) {
		
		int i = this.observers.indexOf(obsserver);
		if (i >= 0) {

			this.observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		
		for (Observer obs : this.observers) {

			obs.update(this.temperature, this.humidity, this.pressure);
		}
	}
	
	/**
	 * 
	 * */
	public void measurementsChanged() {

		notifyObservers();
	}
	
	/**
	 * 
	 * */
	public void setMeasurementsChanged(float temperature, float humidity, float pressure) {
		
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		
	}

}
