package com.coderscampus.assignment10.dto.day;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Days extends DayNutrients{
	@JsonProperty("nurtitionSummary")
	private DayNutrients nurtitionSummary;
	@JsonProperty("nutritionSummaryBreakfast")
	private DayNutrients nutritionSummaryBreakfast;
	@JsonProperty("nutritionSummaryLunch")
	private DayNutrients nutritionSummaryLunch;
	@JsonProperty("nutritionSummaryDinner")
	private DayNutrients nutritionSummaryDinner;
	@JsonProperty("date")
	private Integer date;
	@JsonProperty("")
	private List<Items> items;
	
}
