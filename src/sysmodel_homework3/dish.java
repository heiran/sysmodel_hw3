package sysmodel_homework3;

/**
 * @(#) dish.java
 */

public class dish extends menu {
	private String name;
	private int calorie;
	private String quality;
	private Integer cost;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int isCalorie() {
		return calorie;
	}

	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

}
