package com.coderscampus.assignment10.dto.mealdayplanner;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MealPlanDays {
	@JsonProperty("nurtitionSummary")
	private List<DayNutrients> nurtitionSummary;
	@JsonProperty("nutritionSummaryBreakfast")
	private List<DayNutrients> nutritionSummaryBreakfast;
	@JsonProperty("nutritionSummaryLunch")
	private List<DayNutrients> nutritionSummaryLunch;
	@JsonProperty("nutritionSummaryDinner")
	private List<DayNutrients> nutritionSummaryDinner;
	@JsonProperty("date")
	private Integer date;
	@JsonProperty("day")
	private String day;
	@JsonProperty("items")
	private List<Items> items;
	public List<DayNutrients> getNurtitionSummary() {
		return nurtitionSummary;
	}
	public void setNurtitionSummary(List<DayNutrients> nurtitionSummary) {
		this.nurtitionSummary = nurtitionSummary;
	}
	public List<DayNutrients> getNutritionSummaryBreakfast() {
		return nutritionSummaryBreakfast;
	}
	public void setNutritionSummaryBreakfast(List<DayNutrients> nutritionSummaryBreakfast) {
		this.nutritionSummaryBreakfast = nutritionSummaryBreakfast;
	}
	public List<DayNutrients> getNutritionSummaryLunch() {
		return nutritionSummaryLunch;
	}
	public void setNutritionSummaryLunch(List<DayNutrients> nutritionSummaryLunch) {
		this.nutritionSummaryLunch = nutritionSummaryLunch;
	}
	public List<DayNutrients> getNutritionSummaryDinner() {
		return nutritionSummaryDinner;
	}
	public void setNutritionSummaryDinner(List<DayNutrients> nutritionSummaryDinner) {
		this.nutritionSummaryDinner = nutritionSummaryDinner;
	}
	public Integer getDate() {
		return date;
	}
	public void setDate(Integer date) {
		this.date = date;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public List<Items> getItems() {
		return items;
	}
	public void setItems(List<Items> items) {
		this.items = items;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(date, day, items, nurtitionSummary, nutritionSummaryBreakfast,
				nutritionSummaryDinner, nutritionSummaryLunch);
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
		MealPlanDays other = (MealPlanDays) obj;
		return Objects.equals(date, other.date) && Objects.equals(day, other.day) && Objects.equals(items, other.items)
				&& Objects.equals(nurtitionSummary, other.nurtitionSummary)
				&& Objects.equals(nutritionSummaryBreakfast, other.nutritionSummaryBreakfast)
				&& Objects.equals(nutritionSummaryDinner, other.nutritionSummaryDinner)
				&& Objects.equals(nutritionSummaryLunch, other.nutritionSummaryLunch);
	}
	@Override
	public String toString() {
		return "MealPlanDays [nurtitionSummary=" + nurtitionSummary + ", nutritionSummaryBreakfast="
				+ nutritionSummaryBreakfast + ", nutritionSummaryLunch=" + nutritionSummaryLunch
				+ ", nutritionSummaryDinner=" + nutritionSummaryDinner + ", date=" + date + ", day=" + day + ", items="
				+ items + "]";
	}

	
}
