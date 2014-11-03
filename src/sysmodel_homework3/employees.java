package sysmodel_homework3;

/**
 * @(#) employees.java
 */

public class employees {
	private int salary;
	private String level_of_experience;
	private String name;
	private String surname;
	private waiter waiter;
	private training training;
	private Integer tax_code;

	public Integer getTax_code() {
		return tax_code;
	}

	public void setTax_code(Integer tax_code) {
		this.tax_code = tax_code;
	}

	public int isSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getLevel_of_experience() {
		return level_of_experience;
	}

	public void setLevel_of_experience(String level_of_experience) {
		this.level_of_experience = level_of_experience;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public waiter getWaiter() {
		return waiter;
	}

	public void setWaiter(waiter waiter) {
		this.waiter = waiter;
	}

	public training getTraining() {
		return training;
	}

	public void setTraining(training training) {
		this.training = training;
	}

	public void train() {

	}

	public void increase_experience() {

	}

	public void increase_salary() {

	}

}
