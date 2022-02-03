package com.coderscampus.assignment10.dto.mealdayplanner;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DayNutrients {
	@JsonProperty("name")
	private String name;
	@JsonProperty("amount")
	private Double amount;
	@JsonProperty("unit")
	private String unit;
	@JsonProperty("percentOfDailyNeeds")
	private Double percentOfDailyNeeds;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Double getPercentOfDailyNeeds() {
		return percentOfDailyNeeds;
	}

	public void setPercentOfDailyNeeds(Double percentOfDailyNeeds) {
		this.percentOfDailyNeeds = percentOfDailyNeeds;
	}

	@Override
	public String toString() {
		return "DayNutrients [name=" + name + ", amount=" + amount + ", unit=" + unit + ", percentOfDailyNeeds="
				+ percentOfDailyNeeds + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, name, percentOfDailyNeeds, unit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DayNutrients other = (DayNutrients) obj;
		return Objects.equals(amount, other.amount) && Objects.equals(name, other.name)
				&& Objects.equals(percentOfDailyNeeds, other.percentOfDailyNeeds) && Objects.equals(unit, other.unit);
	}
}
