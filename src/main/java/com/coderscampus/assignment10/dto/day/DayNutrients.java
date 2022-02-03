package com.coderscampus.assignment10.dto.day;

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
}
