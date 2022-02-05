package com.coderscampus.assignment10.dto.mealweekplanner;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Value {
	@JsonProperty("servings")
	private Integer servings;
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("title")
	private String title;
	@JsonProperty("image")
	private String image;

	public Integer getServings() {
		return servings;
	}

	public void setServings(Integer servings) {
		this.servings = servings;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, image, servings, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Value other = (Value) obj;
		return Objects.equals(id, other.id) && Objects.equals(image, other.image)
				&& Objects.equals(servings, other.servings) && Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Value [servings=" + servings + ", id=" + id + ", title=" + title + ", image=" + image + "]";
	}

}
