package com.coderscampus.assignment10.dto.mealplanner;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MealResponse {
	
	@JsonProperty("meals")
	private List<Meals> meals;
	@JsonProperty("nutrients")
	private MealNutrients nutrients;
	

	@Override
	public int hashCode() {
		return Objects.hash(meals, nutrients);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MealResponse other = (MealResponse) obj;
		return Objects.equals(meals, other.meals) && Objects.equals(nutrients, other.nutrients);
	}


	public List<Meals> getMeals() {
		return meals;
	}


	public void setMeals(List<Meals> meals) {
		this.meals = meals;
	}

	public MealNutrients getNutrients() {
		return nutrients;
	}

	public void setNutrients(MealNutrients nutrients) {
		this.nutrients = nutrients;
	}
}
