package com.coderscampus.assignment10.dto.mealweekplanner;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Days {
	@JsonProperty("monday")
	private List<Monday> monday;
	@JsonProperty("tuesday")
	private List<Tuesday> tuesday;
	@JsonProperty("wednesday")
	private List<Wednesday> wednesday;
	@JsonProperty("thursday")
	private List<Thursday> thursday;
	@JsonProperty("friday")
	private List<Friday> friday;
	@JsonProperty("saturday")
	private List<Saturday> saturday;
	@JsonProperty("sunday")
	private List<Sunday> sunday;
	@Override
	public String toString() {
		return "WeekResponse [monday=" + monday + ", tuesday=" + tuesday + ", wednesday=" + wednesday + ", thursday="
				+ thursday + ", friday=" + friday + ", saturday=" + saturday + ", sunday=" + sunday + "]";
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
		Days other = (Days) obj;
		return Objects.equals(friday, other.friday) && Objects.equals(monday, other.monday)
				&& Objects.equals(saturday, other.saturday) && Objects.equals(sunday, other.sunday)
				&& Objects.equals(thursday, other.thursday) && Objects.equals(tuesday, other.tuesday)
				&& Objects.equals(wednesday, other.wednesday);
	}
	public List<Monday> getMonday() {
		return monday;
	}
	public void setMonday(List<Monday> monday) {
		this.monday = monday;
	}
	public List<Tuesday> getTuesday() {
		return tuesday;
	}
	public void setTuesday(List<Tuesday> tuesday) {
		this.tuesday = tuesday;
	}
	public List<Wednesday> getWednesday() {
		return wednesday;
	}
	public void setWednesday(List<Wednesday> wednesday) {
		this.wednesday = wednesday;
	}
	public List<Thursday> getThursday() {
		return thursday;
	}
	public void setThursday(List<Thursday> thursday) {
		this.thursday = thursday;
	}
	public List<Friday> getFriday() {
		return friday;
	}
	public void setFriday(List<Friday> friday) {
		this.friday = friday;
	}
	public List<Saturday> getSaturday() {
		return saturday;
	}
	public void setSaturday(List<Saturday> saturday) {
		this.saturday = saturday;
	}
	public List<Sunday> getSunday() {
		return sunday;
	}
	public void setSunday(List<Sunday> sunday) {
		this.sunday = sunday;
	}
}
