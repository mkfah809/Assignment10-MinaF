package com.coderscampus.assignment10.dto.mealweekplanner;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Days {
	@JsonProperty("nutritionSummary")
	private List<NutritionSummary> nutritionSummary;
	@JsonProperty("nutritionSummaryBreakfast")
	private List<nutritionSummaryBreakfast> nutritionSummaryBreakfast;
	@JsonProperty("nutritionSummaryLunch")
	private List<nutritionSummaryLunch> nutritionSummaryLunch;
	@JsonProperty("nutritionSummaryDinner")
	private List<nutritionSummaryDinner> nutritionSummaryDinner;
	@JsonProperty("date")
	private Integer date;
	@JsonProperty("day")
	private String day;
	@JsonProperty("items")
	private List<Items> items;
	
	public List<NutritionSummary> getNutritionSummary() {
		return nutritionSummary;
	}

	public void setNutritionSummary(List<NutritionSummary> nutritionSummary) {
		this.nutritionSummary = nutritionSummary;
	}

	public List<nutritionSummaryBreakfast> getNutritionSummaryBreakfast() {
		return nutritionSummaryBreakfast;
	}

	public void setNutritionSummaryBreakfast(List<nutritionSummaryBreakfast> nutritionSummaryBreakfast) {
		this.nutritionSummaryBreakfast = nutritionSummaryBreakfast;
	}

	public List<nutritionSummaryLunch> getNutritionSummaryLunch() {
		return nutritionSummaryLunch;
	}

	public void setNutritionSummaryLunch(List<nutritionSummaryLunch> nutritionSummaryLunch) {
		this.nutritionSummaryLunch = nutritionSummaryLunch;
	}

	public List<nutritionSummaryDinner> getNutritionSummaryDinner() {
		return nutritionSummaryDinner;
	}

	public void setNutritionSummaryDinner(List<nutritionSummaryDinner> nutritionSummaryDinner) {
		this.nutritionSummaryDinner = nutritionSummaryDinner;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, day, items, nutritionSummary, nutritionSummaryBreakfast, nutritionSummaryDinner,
				nutritionSummaryLunch);
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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Days other = (Days) obj;
		return Objects.equals(date, other.date) && Objects.equals(day, other.day) && Objects.equals(items, other.items)
				&& Objects.equals(nutritionSummary, other.nutritionSummary)
				&& Objects.equals(nutritionSummaryBreakfast, other.nutritionSummaryBreakfast)
				&& Objects.equals(nutritionSummaryDinner, other.nutritionSummaryDinner)
				&& Objects.equals(nutritionSummaryLunch, other.nutritionSummaryLunch);
	}

	@Override
	public String toString() {
		return "Days [nutritionSummary=" + nutritionSummary + ", nutritionSummaryBreakfast=" + nutritionSummaryBreakfast
				+ ", nutritionSummaryLunch=" + nutritionSummaryLunch + ", nutritionSummaryDinner="
				+ nutritionSummaryDinner + ", date=" + date + ", day=" + day + ", items=" + items + "]";
	}

	
}
