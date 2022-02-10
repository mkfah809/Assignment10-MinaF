package com.coderscampus.assignment10.dto.mealweekplanner;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class nutritionSummaryDinner {
	@JsonProperty("nutritionSummaryDinner")
	private List<nutritionSummaryLunch> nutritionSummaryDinner;

	public List<nutritionSummaryLunch> getNutritionSummaryDinner() {
		return nutritionSummaryDinner;
	}

	public void setNutritionSummaryDinner(List<nutritionSummaryLunch> nutritionSummaryDinner) {
		this.nutritionSummaryDinner = nutritionSummaryDinner;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nutritionSummaryDinner);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		nutritionSummaryDinner other = (nutritionSummaryDinner) obj;
		return Objects.equals(nutritionSummaryDinner, other.nutritionSummaryDinner);
	}

	@Override
	public String toString() {
		return "nutritionSummaryDinner [nutritionSummaryDinner=" + nutritionSummaryDinner + "]";
	}
	
}
