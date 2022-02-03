package com.coderscampus.assignment10.spoonacular;

import java.net.URI;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
@Service
public class SpoonacularInteegration {

	@Test
	public void generateMealPlan() {
		RestTemplate rt = new RestTemplate();
		URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
				.queryParam("timeFrame", "day").queryParam("targetCalories", "2000").queryParam("diet", "vegetarian")
				.queryParam("exclude", "shellfish, olives").queryParam("apiKey", "b50f44eea7594272b307fa06916b553d")
				.build().toUri();
		ResponseEntity<String> response = rt.getForEntity(uri, String.class);
		System.out.println(response);
	}
	
	@Test
	public void generateWeekPlan() {
		
	}
}
