package com.company.weatherAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@SpringBootApplication
public class WeatherApiApplication {

	public static void main(String[] args) throws NoSuchFieldException {
		SpringApplication.run(WeatherApiApplication.class, args);

		// making the call to the weatherAPI to get a json object of information in the city london
		WebClient client = WebClient.create("http://api.openweathermap.org/data/2.5/weather?q=London,uk&APPID=fd238fddcae5fb3172123f01221a835d");


		Mono<String> response = client
				.get()
				.retrieve()
				.bodyToMono(String.class);

		String json = response.share().block();
		System.out.println(json);


		// custom weather object using a weather model class and a call to the api

		Mono<Weather> response2 = client
				.get()
				.retrieve()
				.bodyToMono(Weather.class);

		Weather weather = response2.share().block();
		System.out.println(weather.getBase());
		System.out.println(weather.getVisibility());
		System.out.println(weather.getCoord());






	}
}
