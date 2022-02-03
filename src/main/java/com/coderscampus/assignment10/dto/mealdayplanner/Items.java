package com.coderscampus.assignment10.dto.mealdayplanner;

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
	private Value value;

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

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

}
