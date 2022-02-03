package com.coderscampus.assignment10.dto.day;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Value {
	@JsonProperty("title")
	private String title;
	@JsonProperty("servings")
	private Integer servings;
	@JsonProperty("ingredients")
	private Ingredients ingredients;
}
