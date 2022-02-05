package com.coderscampus.assignment10.dto.mealweekplanner;

import java.util.List;
import java.util.Objects;

public class WeekResponse {
	private List<Days> days;

	@Override
	public String toString() {
		return "WeekResponse [days=" + days + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(days);
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
		return Objects.equals(days, other.days);
	}

	public List<Days> getDays() {
		return days;
	}

	public void setDays(List<Days> days) {
		this.days = days;
	}

}
