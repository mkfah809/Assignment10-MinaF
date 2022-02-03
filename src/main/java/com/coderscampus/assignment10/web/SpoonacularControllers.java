package com.coderscampus.assignment10.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.assignment10.dto.mealdayplanner.WeekResponse;
import com.coderscampus.assignment10.dto.mealplanner.MealResponse;
import com.coderscampus.assignment10.spoonacular.SpoonacularInteegration;

@RestController
public class SpoonacularControllers {

	@Autowired
	SpoonacularInteegration spoonacularIntegeeration;
	@PostMapping("generate-mealplanner")
	public ResponseEntity<MealResponse> getWeekMeals() {
		ResponseEntity<MealResponse> generateMealPlan = spoonacularIntegeeration.generateMealPlan();
		// is generateMealPlan cashed right now? 
		if(spoonacularIntegeeration != null) {
			return generateMealPlan;
		} else {
			return spoonacularIntegeeration.generateMealPlan();		// first-lunch	
		}
	}
}
