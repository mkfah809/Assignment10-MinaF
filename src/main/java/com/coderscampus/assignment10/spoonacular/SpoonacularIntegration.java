package com.coderscampus.assignment10.spoonacular;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.assignment10.dto.mealdayplanner.DayResponse;
import com.coderscampus.assignment10.dto.mealweekplanner.WeekResponse;

@Service
public class SpoonacularIntegration {

	public ResponseEntity<DayResponse> generateDayMealPlan() {
		RestTemplate rt = new RestTemplate();
		ResponseEntity<DayResponse> dayResponse = rt
				.getForEntity(
						UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
								.queryParam("timeFrame", "day").queryParam("targetCalories", "1600")
								.queryParam("diet", "vegetarian").queryParam("exclude", "shellfish, olives")
								.queryParam("apiKey", "b50f44eea7594272b307fa06916b553d").build().toUri(),
						DayResponse.class);
		System.out.println(dayResponse.getBody());
		return dayResponse;
	}

	
	public ResponseEntity<WeekResponse> generateWeekMealPlan() {
		RestTemplate rt = new RestTemplate();
		ResponseEntity<WeekResponse> weekResponse = rt
				.getForEntity(
						UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
								.queryParam("timeFrame", "week").queryParam("username", "mina")
								.queryParam("start-date", "2020-06-01")
								.queryParam("apiKey", "b50f44eea7594272b307fa06916b553d").build().toUri(),
								WeekResponse.class);
		System.out.println(weekResponse.getBody());
		return weekResponse;
	}
}
