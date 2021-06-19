package com.TypeCastingPractise;

public class ProtectedAccessModifier {
	
	protected String WeatherForecast() {
		String forecast="Its rainny !";
		System.out.println("Calling from ProtectedAccessModifier class");
		
		return forecast;
	}
	public String WeatherForecasteToday() {
		String todayForecast="Its Sunny today ";
		return todayForecast;
	}
}
