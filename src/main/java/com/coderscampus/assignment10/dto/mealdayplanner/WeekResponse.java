package com.coderscampus.assignment10.dto.mealdayplanner;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeekResponse {

	private List<Days> week;

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

	public List<Days> getWeek() {
		return week;
	}

	public void setWeek(List<Days> week) {
		this.week = week;
	}
}
