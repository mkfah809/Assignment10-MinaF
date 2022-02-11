package com.coderscampus.assignment10.dto;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeekResponse {
	@JsonProperty("week")
	private Week week;

	@Override
	public String toString() {
		return "WeekResponse [week=" + week + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(week);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WeekResponse other = (WeekResponse) obj;
		return Objects.equals(week, other.week);
	}

	public Week getWeek() {
		return week;
	}

	public void setWeek(Week week) {
		this.week = week;
	}
}
