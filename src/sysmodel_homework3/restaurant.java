package sysmodel_homework3;

/**
 * @(#) restaurant.java
 */

public class restaurant {
	private String name;
	private String address;
	private String city;
	private int reputation;
	private owner owner;
	private employees employees;
	private budget budget;
	private table table;
	private menu menu;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getReputation() {
		return reputation;
	}

	public void setReputation(int reputation) {
		this.reputation = reputation;
	}

	public owner getOwner() {
		return owner;
	}

	public void setOwner(owner owner) {
		this.owner = owner;
	}

	public employees getEmployees() {
		return employees;
	}

	public void setEmployees(employees employees) {
		this.employees = employees;
	}

	public budget getBudget() {
		return budget;
	}

	public void setBudget(budget budget) {
		this.budget = budget;
	}

	public table getTable() {
		return table;
	}

	public void setTable(table table) {
		this.table = table;
	}

	public menu getMenu() {
		return menu;
	}

	public void setMenu(menu menu) {
		this.menu = menu;
	}

	public void change_reputation() {

	}

}
