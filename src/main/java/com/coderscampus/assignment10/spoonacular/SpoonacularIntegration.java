package com.coderscampus.assignment10.spoonacular;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.assignment10.dto.DayResponse;
import com.coderscampus.assignment10.dto.WeekResponse;

@Service
public class SpoonacularIntegration {

	public ResponseEntity<DayResponse> generateDayMealPlan(String numCalories, Optional<String> diet, Optional<String> exclusions) {
		RestTemplate rt = new RestTemplate();
		ResponseEntity<DayResponse> dayResponse = 
				rt.getForEntity(
						UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
								.queryParam("timeFrame", "day")
								.queryParam("targetCalories", numCalories != null ? Integer.parseInt(numCalories):2000)
								.queryParam("diet", diet)
								.queryParam("exclude", exclusions)
								.queryParam("apiKey", "b50f44eea7594272b307fa06916b553d")
								.build().toUri(),DayResponse.class); //deserializing
		System.out.println(dayResponse.getBody());
		return dayResponse;
	}

	public ResponseEntity<WeekResponse> generateWeekMealPlan(String numCalories, Optional<String> diet, Optional<String> exclusions) {
		RestTemplate rt = new RestTemplate();
		ResponseEntity<WeekResponse> weekResponse = 
				rt.getForEntity(
						UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
						.queryParam("timeFrame", "week")
						.queryParam("targetCalories", numCalories != null ? Integer.parseInt(numCalories):2000)
						.queryParam("diet", diet)
						.queryParam("exclude", exclusions)
						.queryParam("apiKey", "b50f44eea7594272b307fa06916b553d")
							.build().toUri(), WeekResponse.class);
		System.out.println(weekResponse.getBody());
		return weekResponse;
	}
}
