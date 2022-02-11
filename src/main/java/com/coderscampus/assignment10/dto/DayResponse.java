package com.coderscampus.assignment10.dto;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DayResponse {
	
	@JsonProperty("meals")
	private List<Meal> meals;
	@JsonProperty("nutrients")
	private Nutrients nutrients;
	

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
		DayResponse other = (DayResponse) obj;
		return Objects.equals(meals, other.meals) && Objects.equals(nutrients, other.nutrients);
	}


	public List<Meal> getMeals() {
		return meals;
	}


	public void setMeals(List<Meal> meals) {
		this.meals = meals;
	}

	public Nutrients getNutrients() {
		return nutrients;
	}

	public void setNutrients(Nutrients nutrients) {
		this.nutrients = nutrients;
	}
}
