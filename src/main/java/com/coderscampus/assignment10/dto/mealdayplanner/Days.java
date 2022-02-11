package com.coderscampus.assignment10.dto.mealdayplanner;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Days {
	
	private List<DayResponse> dayResponse;

	public List<DayResponse> getDayResponse() {
		return dayResponse;
	}

	public void setDayResponse(List<DayResponse> dayResponse) {
		this.dayResponse = dayResponse;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dayResponse);
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
		return Objects.equals(dayResponse, other.dayResponse);
	}

	@Override
	public String toString() {
		return "Days [dayResponse=" + dayResponse + "]";
	}

}
