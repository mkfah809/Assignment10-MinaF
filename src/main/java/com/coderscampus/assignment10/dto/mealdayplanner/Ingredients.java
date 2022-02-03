package com.coderscampus.assignment10.dto.mealdayplanner;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Ingredients {
	@JsonProperty("name")
	private String name;
	@JsonProperty("unit")
	private String unit;
	@JsonProperty("amount")
	private Integer amount;
	@JsonProperty("image")
	private String image;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
