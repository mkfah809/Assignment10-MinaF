package com.coderscampus.assignment10.dto.mealweekplanner;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class nutritionSummaryLunch extends WeekNutrients {
	@JsonProperty("nutritionSummaryLunch")
	private List<nutritionSummaryLunch> nutritionSummaryLunch;

	public List<nutritionSummaryLunch> getNutritionSummaryLunch() {
		return nutritionSummaryLunch;
	}

	public void setNutritionSummaryLunch(List<nutritionSummaryLunch> nutritionSummaryLunch) {
		this.nutritionSummaryLunch = nutritionSummaryLunch;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nutritionSummaryLunch);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		nutritionSummaryLunch other = (nutritionSummaryLunch) obj;
		return Objects.equals(nutritionSummaryLunch, other.nutritionSummaryLunch);
	}

	@Override
	public String toString() {
		return "nutritionSummaryLunch [nutritionSummaryLunch=" + nutritionSummaryLunch + "]";
	}

}
