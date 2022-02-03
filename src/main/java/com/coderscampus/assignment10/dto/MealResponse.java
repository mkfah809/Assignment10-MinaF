package com.coderscampus.assignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MealResponse {
	
	@JsonProperty("meals")
	private Meals meals;
	@JsonProperty("nutrients")
	private MealNutrients nutrients;

	@Override
	public String toString() {
		return "SpooacularResponse [meals=" + meals + ", nutrients=" + nutrients + "]";
	}

	public Meals getMeals() {
		return meals;
	}

	public void setMeals(Meals meals) {
		this.meals = meals;
	}

	public MealNutrients getNutrients() {
		return nutrients;
	}

	public void setNutrients(MealNutrients nutrients) {
		this.nutrients = nutrients;
	}
}
