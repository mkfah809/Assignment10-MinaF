package com.coderscampus.assignment10.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.assignment10.dto.mealdayplanner.DayResponse;
import com.coderscampus.assignment10.dto.mealweekplanner.WeekResponse;
import com.coderscampus.assignment10.spoonacular.SpoonacularIntegration;

@RestController
public class SpoonacularControllers {

	@Autowired
	SpoonacularIntegration spoonacularIntegeration;


	@PostMapping("/generate-day-meal-plan")
	public ResponseEntity<DayResponse> getDayMeals() {
		return spoonacularIntegeration.generateDayMealPlan();
	}

//	@PostMapping("/generate-week-meal-plan")
//	public ResponseEntity<WeekResponse> getWeekMeals() {
//		return spoonacularIntegeration.generateWeekMealPlan();
//
//	}
}
