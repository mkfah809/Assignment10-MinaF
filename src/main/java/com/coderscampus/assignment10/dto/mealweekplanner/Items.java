package com.coderscampus.assignment10.dto.mealweekplanner;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Items {
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("slot")
	private Integer slot;
	@JsonProperty("position")
	private Integer position;
	@JsonProperty("type")
	private String type;
	@JsonProperty("value")
	private List<Value> value;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSlot() {
		return slot;
	}

	public void setSlot(Integer slot) {
		this.slot = slot;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Value> getValue() {
		return value;
	}

	public void setValue(List<Value> value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, position, slot, type, value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Items other = (Items) obj;
		return Objects.equals(id, other.id) && Objects.equals(position, other.position)
				&& Objects.equals(slot, other.slot) && Objects.equals(type, other.type)
				&& Objects.equals(value, other.value);
	}

	@Override
	public String toString() {
		return "Items [id=" + id + ", slot=" + slot + ", position=" + position + ", type=" + type + ", value=" + value
				+ "]";
	}

}
