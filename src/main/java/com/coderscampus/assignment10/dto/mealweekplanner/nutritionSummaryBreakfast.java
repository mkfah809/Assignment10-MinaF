package com.coderscampus.assignment10.dto.mealweekplanner;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class nutritionSummaryBreakfast extends WeekNutrients {
	@JsonProperty("nutrients")
	private List<WeekNutrients> nutrients;

	public List<WeekNutrients> getNutrients() {
		return nutrients;
	}

	public void setNutrients(List<WeekNutrients> nutrients) {
		this.nutrients = nutrients;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(nutrients);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		nutritionSummaryBreakfast other = (nutritionSummaryBreakfast) obj;
		return Objects.equals(nutrients, other.nutrients);
	}

	@Override
	public String toString() {
		return "nutritionSummaryBreakfast [nutrients=" + nutrients + "]";
	}

}
