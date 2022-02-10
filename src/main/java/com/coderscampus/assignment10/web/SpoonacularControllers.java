package com.coderscampus.assignment10.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.coderscampus.assignment10.dto.mealdayplanner.DayResponse;
import com.coderscampus.assignment10.dto.mealweekplanner.WeekResponse;
import com.coderscampus.assignment10.spoonacular.SpoonacularIntegration;

@RestController
public class SpoonacularControllers {

	@Autowired
	SpoonacularIntegration spoonacularIntegeration;

	@PostMapping("/mealplanner/day")
	public ResponseEntity<DayResponse> postDayMeals(@RequestParam(required = true) String numCalories,
			@RequestParam(required = true) String diet, @RequestParam(required = true) String exclusions) {
		return spoonacularIntegeration.generateDayMealPlan(numCalories, diet, exclusions);
	}

	@GetMapping("/mealplanner/day")
	public ResponseEntity<DayResponse> getDayMeals(@RequestParam(required = true) String numCalories,
			@RequestParam(required = true) String diet, @RequestParam(required = true) String exclusions) {
		return spoonacularIntegeration.generateDayMealPlan(numCalories, diet, exclusions);
	}

	@PostMapping("/mealplanner/week")
	public ResponseEntity<WeekResponse> postWeekMeals(@RequestParam(required = true) String numCalories,
			@RequestParam(required = true) String diet, @RequestParam(required = true) String exclusions) {
		return spoonacularIntegeration.generateWeekMealPlan(numCalories, diet, exclusions);
	}
//	@GetMapping("/mealplanner/week")
//	public ResponseEntity<WeekResponse> getWeekMeals(@RequestParam(required = true) String numCalories,
//			@RequestParam(required = true) String diet, @RequestParam(required = true) String exclusions) {
//		return spoonacularIntegeration.generateWeekMealPlan(numCalories, diet, exclusions);
//	}

}