package com.coderscampus.assignment10.dto.mealweekplanner;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NutritionSummary extends WeekNutrients {
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
		return Objects.hash(nutrients);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NutritionSummary other = (NutritionSummary) obj;
		return Objects.equals(nutrients, other.nutrients);
	}

	@Override
	public String toString() {
		return "NutritionSummary [nutrients=" + nutrients + "]";
	}

}
