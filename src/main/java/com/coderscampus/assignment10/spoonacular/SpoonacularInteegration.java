package com.coderscampus.assignment10.spoonacular;

import java.net.URI;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.assignment10.dto.mealdayplanner.MealPlanDays;
import com.coderscampus.assignment10.dto.mealplanner.MealResponse;

@Service
public class SpoonacularInteegration {

	@Test
	public ResponseEntity<MealResponse> generateMealPlan() {
		RestTemplate rt = new RestTemplate();
		ResponseEntity<MealResponse> mealResponse = rt
				.getForEntity(
						UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
								.queryParam("timeFrame", "day")
								.queryParam("targetCalories", "2000")
								.queryParam("diet", "vegetarian")
								.queryParam("exclude", "shellfish, olives")
								.queryParam("apiKey", "b50f44eea7594272b307fa06916b553d").build().toUri(),
						MealResponse.class);
		System.out.println(mealResponse.getBody());
		return mealResponse;
	}

	@Test
	public void getMealPlanDay() {
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> dayResponse = rt.getForEntity(UriComponentsBuilder
				.fromHttpUrl("https://api.spoonacular.com/mealplanner/dsky/day/2020-06-01")
				.queryParam("username", "dsky").queryParam("date", "2020-06-01").queryParam("hash", "4b5v4398573406")
				.queryParam("apiKey", "b50f44eea7594272b307fa06916b553d").build().toUri(), String.class);
		System.out.println(dayResponse.getBody());
	}
}
