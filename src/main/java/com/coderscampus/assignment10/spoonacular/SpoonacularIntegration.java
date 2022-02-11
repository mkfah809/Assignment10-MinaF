package com.coderscampus.assignment10.spoonacular;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.assignment10.dto.mealdayplanner.DayResponse;
import com.coderscampus.assignment10.dto.mealdayplanner.WeekResponse;

@Service
public class SpoonacularIntegration {

	public ResponseEntity<DayResponse> generateDayMealPlan(String numCalories, String diet, String exclusions) {
		RestTemplate rt = new RestTemplate();
		ResponseEntity<DayResponse> dayResponse = 
				rt.getForEntity(
						UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
								.queryParam("timeFrame", "day")
								.queryParam("targetCalories", numCalories)
								.queryParam("diet", diet)
								.queryParam("exclude", exclusions)
								.queryParam("apiKey", "b50f44eea7594272b307fa06916b553d")
								.build().toUri(),DayResponse.class); //deserializing
		System.out.println(dayResponse.getBody());
		return dayResponse;
	}

	public ResponseEntity<WeekResponse> generateWeekMealPlan(String numCalories, String diet, String exclusions) {
		RestTemplate rt = new RestTemplate();
		ResponseEntity<WeekResponse> weekResponse = 
				rt.getForEntity(
						UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
						.queryParam("timeFrame", "week")
						.queryParam("targetCalories", numCalories)
						.queryParam("diet", diet)
						.queryParam("exclude", exclusions)
						.queryParam("apiKey", "b50f44eea7594272b307fa06916b553d")
							.build().toUri(), WeekResponse.class);
		
		System.out.println("numCalories is "+ numCalories);
		System.out.println("diet is "+ diet);
		System.out.println("exclusions is "+ exclusions);

		System.out.println(weekResponse.getBody());
		return weekResponse;
	}
}
