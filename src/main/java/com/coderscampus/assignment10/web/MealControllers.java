package com.coderscampus.assignment10.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.assignment10.dto.DayResponse;
import com.coderscampus.assignment10.dto.WeekResponse;
import com.coderscampus.assignment10.spoonacular.SpoonacularIntegration;

@RestController
public class MealControllers {

	@Autowired
	SpoonacularIntegration spoonacularIntegeration;

	@GetMapping("/mealplanner/day")
	public ResponseEntity<DayResponse> getDayMeals(String numCalories, Optional<String> diet, Optional<String> exclusions) {
		return spoonacularIntegeration.generateDayMealPlan(numCalories, diet, exclusions);
	}

	@GetMapping("/mealplanner/week")
	public ResponseEntity<WeekResponse> getWeekMeals(String numCalories, Optional<String> diet,Optional<String> exclusions) {
		return spoonacularIntegeration.generateWeekMealPlan(numCalories, diet, exclusions);
	}

}