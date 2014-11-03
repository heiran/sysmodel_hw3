package sysmodel_homework3;

import java.util.ArrayList;
import java.util.List;

import sysmodel_homework3.owner;
import sysmodel_homework3.restaurant;
import sysmodel_homework3.budget;
import sysmodel_homework3.barman;
import sysmodel_homework3.beverage;
import sysmodel_homework3.chef;
import sysmodel_homework3.client;
import sysmodel_homework3.dish;
import sysmodel_homework3.employees;
import sysmodel_homework3.menu;
import sysmodel_homework3.supplier;
import sysmodel_homework3.table;
import sysmodel_homework3.training;
import sysmodel_homework3.waiter;

public class resturant_game {

	static owner owner = new owner();
	static restaurant restaurant = new restaurant();
	static budget budget = new budget();
	static waiter waiter1 = new waiter();
	static waiter waiter2 = new waiter();
	static waiter waiter3 = new waiter();
	static barman barman = new barman();
	static chef chef = new chef();
	static table table1 = new table();
	static table table2 = new table();
	static table table3 = new table();
	static table table4 = new table();
	static table table5 = new table();
	static table table6 = new table();
	static table table7 = new table();
	static table table8 = new table();
	static table table9 = new table();
	static beverage beverage1 = new beverage();
	static beverage beverage2 = new beverage();
	static beverage beverage3 = new beverage();
	static beverage beverage4 = new beverage();
	static beverage beverage5 = new beverage();
	static dish dish1 = new dish();
	static dish dish2 = new dish();
	static dish dish3 = new dish();
	static dish dish4 = new dish();
	static dish dish5 = new dish();

	public static void main(String[] args) {
		String input = "";
		input = System.console().readLine("Enter player name: ");
		owner.setName(input);

		input = System.console().readLine("Enter restaurant name: ");
		restaurant.setName(input);

		input = System.console().readLine("Enter restaurant address: ");
		restaurant.setAddress(input);

		input = System.console().readLine("Enter restaurant city: ");
		restaurant.setCity(input);
		
		restaurant.setReputation(15);

		budget.setSize(10000);

		waiter1.setName("Paul");
		waiter1.setSurname("Paulerson");
		waiter1.setLevel_of_experience("low");
		waiter1.setSalary(200);

		waiter2.setName("Mac");
		waiter2.setSurname("Macerson");
		waiter2.setLevel_of_experience("low");
		waiter2.setSalary(200);

		waiter3.setName("Marie");
		waiter3.setSurname("Laurie");
		waiter3.setLevel_of_experience("low");
		waiter3.setSalary(200);

		chef.setName("Anna");
		chef.setSurname("Karenina");
		chef.setTax_code(12345678);
		chef.setLevel_of_experience("low");
		chef.setSalary(300);

		barman.setName("Jill");
		barman.setSurname("Jackeson");
		barman.setLevel_of_experience("low");
		barman.setSalary(300);

		table1.setNumber(1);
		table2.setNumber(2);
		table3.setNumber(3);
		table4.setNumber(4);
		table5.setNumber(5);
		table6.setNumber(6);
		table7.setNumber(7);
		table8.setNumber(8);
		table9.setNumber(9);

		List<table> tables = new ArrayList<>();
		tables.add(table1);
		tables.add(table2);
		tables.add(table3);
		tables.add(table4);
		tables.add(table5);
		tables.add(table6);
		tables.add(table7);
		tables.add(table8);
		tables.add(table9);

		dish1.setName("Potatosalad");
		dish1.setCalorie(600);
		dish1.setQuality("low");

		dish2.setName("Soup");
		dish2.setCalorie(800);
		dish2.setQuality("low");

		dish3.setName("Cake");
		dish3.setCalorie(1200);
		dish3.setQuality("low");

		dish4.setName("Steak");
		dish4.setCalorie(600);
		dish4.setQuality("low");

		dish5.setName("Macaroni and cheese");
		dish5.setCalorie(600);
		dish5.setQuality("low");

		List<dish> dishes = new ArrayList<>();
		dishes.add(dish1);
		dishes.add(dish2);
		dishes.add(dish3);
		dishes.add(dish4);
		dishes.add(dish5);
		int high_dish_cost;
		int low_dish_cost;

		beverage1.setName("Milk");
		beverage1.setVolume(125);
		beverage1.setQuality("low");

		beverage2.setName("Coke");
		beverage2.setVolume(125);
		beverage2.setQuality("low");

		beverage3.setName("Juice");
		beverage3.setVolume(125);
		beverage3.setQuality("low");

		beverage4.setName("Wine");
		beverage4.setVolume(125);
		beverage4.setQuality("low");

		beverage5.setName("Vodka");
		beverage5.setVolume(125);
		beverage5.setQuality("low");

		List<beverage> beverages = new ArrayList<>();
		beverages.add(beverage1);
		beverages.add(beverage2);
		beverages.add(beverage3);
		beverages.add(beverage4);
		beverages.add(beverage5);
		int high_beverage_cost;
		int low_beverage_cost;

		while (!"exit".equals(input)) {
			System.out.println("Your budget is: " + budget.getSize());
			System.out
					.println("You can increase the level of experience of a waiter with a training course that costs in total 800 euros. It is also possible to increase the level of experience of the chef and the barman with a training course that costs in total 1200 euros. ");
			input = System.console().readLine(
					"Would you like to train someone? ");
			while (input.equals("yes")) {
				input = System.console().readLine(
						"Who would you like to train: waiter1 ("
								+ waiter1.getName() + " "
								+ waiter1.getSurname() + "-"
								+ waiter1.getLevel_of_experience()
								+ ", waiter2 (" + waiter2.getName() + " "
								+ waiter2.getSurname() + "-"
								+ waiter2.getLevel_of_experience()
								+ ", waiter3 (" + waiter3.getName() + " "
								+ waiter3.getSurname() + "-"
								+ waiter3.getLevel_of_experience() + ", chef ("
								+ chef.getName() + " " + chef.getSurname()
								+ "-" + chef.getLevel_of_experience()
								+ " or barman(" + barman.getName() + " "
								+ barman.getSurname() + "-"
								+ barman.getLevel_of_experience() + "? ");
				if (input.equals("waiter1")) {
					if (budget.getSize() < 800) {
						System.out
								.println("Not enough cash to train employee.");
					} else {
						String level = waiter1.getLevel_of_experience();
						if (level.equals("low")) {
							budget.setSize(budget.getSize() - 800);
							waiter1.setLevel_of_experience("medium");
							waiter1.setSalary(300);
						} else if (level.equals("medium")) {
							budget.setSize(budget.getSize() - 800);
							waiter1.setLevel_of_experience("high");
							waiter1.setSalary(400);
						} else if (level.equals("high")) {
							System.out
									.println("Can't train this employee anymore.");
						}
					}
				}
				if (input.equals("waiter2")) {
					if (budget.getSize() < 800) {
						System.out
								.println("Not enough cash to train employee.");
					} else {
						String level = waiter2.getLevel_of_experience();
						if (level.equals("low")) {
							budget.setSize(budget.getSize() - 800);
							waiter2.setLevel_of_experience("medium");
							waiter2.setSalary(300);
						} else if (level.equals("medium")) {
							budget.setSize(budget.getSize() - 800);
							waiter2.setLevel_of_experience("high");
							waiter2.setSalary(400);
						} else if (level.equals("high")) {
							System.out
									.println("Can't train this employee anymore.");
						}
					}
				}
				if (input.equals("waiter3")) {
					if (budget.getSize() < 800) {
						System.out
								.println("Not enough cash to train employee.");
					} else {
						String level = waiter3.getLevel_of_experience();
						if (level.equals("low")) {
							budget.setSize(budget.getSize() - 800);
							waiter3.setLevel_of_experience("medium");
							waiter3.setSalary(300);
						} else if (level.equals("medium")) {
							budget.setSize(budget.getSize() - 800);
							waiter3.setLevel_of_experience("high");
							waiter3.setSalary(400);
						} else if (level.equals("high")) {
							System.out
									.println("Can't train this employee anymore.");
						}
					}
				}
				if (input.equals("chef")) {
					if (budget.getSize() < 1200) {
						System.out
								.println("Not enough cash to train employee.");
					} else {
						String level = chef.getLevel_of_experience();
						if (level.equals("low")) {
							budget.setSize(budget.getSize() - 1200);
							chef.setLevel_of_experience("medium");
							chef.setSalary(400);
						} else if (level.equals("medium")) {
							budget.setSize(budget.getSize() - 1200);
							chef.setLevel_of_experience("high");
							chef.setSalary(500);
						} else if (level.equals("high")) {
							System.out
									.println("Can't train this employee anymore.");
						}
					}
				}
				if (input.equals("barman")) {
					if (budget.getSize() < 1200) {
						System.out
								.println("Not enough cash to train employee.");
					} else {
						String level = chef.getLevel_of_experience();
						if (level.equals("low")) {
							budget.setSize(budget.getSize() - 1200);
							barman.setLevel_of_experience("medium");
							barman.setSalary(400);
						} else if (level.equals("medium")) {
							budget.setSize(budget.getSize() - 1200);
							barman.setLevel_of_experience("high");
							barman.setSalary(500);
						} else if (level.equals("high")) {
							System.out
									.println("Can't train this employee anymore.");
						}
					}
				}
				input = System
						.console()
						.readLine(
								"Would you like to train someone else? Enter 'yes' to train some more ");

			}
			input = System
					.console()
					.readLine(
							"Please assign at most 3 tables for waiter1 (enter numbers 1-9, separate by comma): ");
			String[] selected_tables = input.split(",");
			for (String table : selected_tables) {
				for (table tableObject : tables) {
					if (table.equals(tableObject.getNumber().toString())) {
						tableObject.setWaiter(waiter1);
					}
				}
			}
			input = System
					.console()
					.readLine(
							"Please assign at most 3 tables for waiter2 (enter numbers 1-9, separate by comma): ");
			String[] selected_tables2 = input.split(",");
			for (String table : selected_tables2) {
				for (table tableObject : tables) {
					if (table.equals(tableObject.getNumber().toString())) {
						tableObject.setWaiter(waiter2);
					}
				}
			}
			input = System
					.console()
					.readLine(
							"Please assign at most 3 tables for waiter3 (enter numbers 1-9, separate by comma): ");
			String[] selected_tables3 = input.split(",");
			for (String table : selected_tables3) {
				for (table tableObject : tables) {
					if (table.equals(tableObject.getNumber().toString())) {
						tableObject.setWaiter(waiter3);
					}
				}
			}
			input = System.console().readLine(
					"Please select high quality dish price: ");
			high_dish_cost = Integer.parseInt(input);
			input = System.console().readLine(
					"Please select low quality dish price: ");
			low_dish_cost = Integer.parseInt(input);

			input = System.console().readLine(
					"Please select high quality beverage price: ");
			high_beverage_cost = Integer.parseInt(input);
			input = System.console().readLine(
					"Please select low quality beverage price: ");
			low_beverage_cost = Integer.parseInt(input);
			input = System
					.console()
					.readLine(
							"Would you like to change quality of dishes or beverages? ");
			if (input.equals("yes")) {
				for (beverage beverage : beverages) {
					input = System.console().readLine(
							"Enter quality of " + beverage.getName() + " -("
									+ beverage.getQuality()
									+ "). Enter 'high' or 'low'.");
					beverage.setQuality(input);
					beverage.setCost(low_beverage_cost);
					if (input.equals("high")) {
						beverage.setCost(high_beverage_cost);
					}
				}
				for (dish dish : dishes) {
					input = System.console().readLine(
							"Enter quality of " + dish.getName() + " -("
									+ dish.getQuality()
									+ "). Enter 'high' or 'low'.");
					dish.setQuality(input);
					dish.setCost(low_dish_cost);
					if (input.equals("high")) {
						dish.setCost(high_dish_cost);
					}
				}
			}
			
			
		}
	}
}
