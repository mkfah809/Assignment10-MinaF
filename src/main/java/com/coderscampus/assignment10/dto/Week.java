package com.coderscampus.assignment10.dto;


import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Week {

	@JsonProperty("monday")
	private DayResponse monday;

	@JsonProperty("tuesday")
	private DayResponse tuesday;

	@JsonProperty("wednesday")
	private DayResponse wednesday;

	@JsonProperty("thursday")
	private DayResponse thursday;

	@JsonProperty("friday")
	private DayResponse friday;

	@JsonProperty("saturday")
	private DayResponse saturday;

	@JsonProperty("sunday")
	private DayResponse sunday;

	public DayResponse getMonday() {
		return monday;
	}

	public void setMonday(DayResponse monday) {
		this.monday = monday;
	}

	public DayResponse getTuesday() {
		return tuesday;
	}

	public void setTuesday(DayResponse tuesday) {
		this.tuesday = tuesday;
	}

	public DayResponse getWednesday() {
		return wednesday;
	}

	public void setWednesday(DayResponse wednesday) {
		this.wednesday = wednesday;
	}

	public DayResponse getThursday() {
		return thursday;
	}

	public void setThursday(DayResponse thursday) {
		this.thursday = thursday;
	}

	public DayResponse getFriday() {
		return friday;
	}

	public void setFriday(DayResponse friday) {
		this.friday = friday;
	}

	public DayResponse getSaturday() {
		return saturday;
	}

	public void setSaturday(DayResponse saturday) {
		this.saturday = saturday;
	}

	public DayResponse getSunday() {
		return sunday;
	}

	public void setSunday(DayResponse sunday) {
		this.sunday = sunday;
	}

	@Override
	public int hashCode() {
		return Objects.hash(friday, monday, saturday, sunday, thursday, tuesday, wednesday);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Week other = (Week) obj;
		return Objects.equals(friday, other.friday) && Objects.equals(monday, other.monday)
				&& Objects.equals(saturday, other.saturday) && Objects.equals(sunday, other.sunday)
				&& Objects.equals(thursday, other.thursday) && Objects.equals(tuesday, other.tuesday)
				&& Objects.equals(wednesday, other.wednesday);
	}

	@Override
	public String toString() {
		return "Week [monday=" + monday + ", tuesday=" + tuesday + ", wednesday=" + wednesday + ", thursday=" + thursday
				+ ", friday=" + friday + ", saturday=" + saturday + ", sunday=" + sunday + "]";
	}


}
