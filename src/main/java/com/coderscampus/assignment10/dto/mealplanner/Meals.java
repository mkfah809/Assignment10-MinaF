package com.coderscampus.assignment10.dto.mealplanner;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meals {
	@JsonProperty("id")
	private Long id;
	@JsonProperty("title")
	private String title;
	@JsonProperty("imageType")
	private String imageType;
	@JsonProperty("readyInMinutes")
	private Integer readyInMinutes;
	@JsonProperty("servings")
	private Integer Servings;
	@JsonProperty("sourceUrl")
	private String sourceUrl;

	@Override
	public String toString() {
		return "Meals [id=" + id + ", title=" + title + ", imageType=" + imageType + ", readyInMinutes="
				+ readyInMinutes + ", Servings=" + Servings + ", sourceUrl=" + sourceUrl + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImageType() {
		return imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public Integer getReadyInMinutes() {
		return readyInMinutes;
	}

	public void setReadyInMinutes(Integer readyInMinutes) {
		this.readyInMinutes = readyInMinutes;
	}

	public Integer getServings() {
		return Servings;
	}

	public void setServings(Integer servings) {
		Servings = servings;
	}

	public String getSourceUrl() {
		return sourceUrl;
	}

	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

}
