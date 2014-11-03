package sysmodel_homework3;
/**
 * @(#) beverage.java
 */

public class beverage extends menu
{
	private String name;	
	private int volume;
	private String quality;	
	private Integer cost;
	
	public int isVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
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
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
