package sysmodel_homework3;

/**
 * @(#) supplier.java
 */

public class supplier {
	private String name;
	private String ingredient;
	private Integer ammount;
	private boolean price;
	private budget budget;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIngredient() {
		return ingredient;
	}

	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}

	public Integer getAmmount() {
		return ammount;
	}

	public void setAmmount(Integer ammount) {
		this.ammount = ammount;
	}

	public boolean isPrice() {
		return price;
	}

	public void setPrice(boolean price) {
		this.price = price;
	}

	public budget getBudget() {
		return budget;
	}

	public void setBudget(budget budget) {
		this.budget = budget;
	}

	public void deliver_supplies() {

	}

}
