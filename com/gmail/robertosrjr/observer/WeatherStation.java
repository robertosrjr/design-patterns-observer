package com.gmail.robertosrjr.observer;

public class WeatherStation {
	
	public static void main(String[] args) {

		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurementsChanged(80, 65, 30.4f);
		weatherData.setMeasurementsChanged(82, 70, 29.4f);
		weatherData.setMeasurementsChanged(78, 95, 28.4f);
	}
}

