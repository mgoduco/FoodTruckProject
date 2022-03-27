package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FoodTruck[] foodTruckArr = new FoodTruck[5];
		FoodTruckApp ftApp = new FoodTruckApp();
		ftApp.foodTrucks(sc, ftApp, foodTruckArr);
	}

	public String foodTruckName(Scanner sc, FoodTruckApp ftApp, FoodTruck[] foodTruckArr) {
		System.out.println("Enter the name of the food truck: ");
		String name = sc.nextLine();
		return name;
	}
	public String foodTruckType(Scanner sc, FoodTruckApp ftApp, FoodTruck[] foodTruckArr) {
		System.out.println("What kind of food does this truck sell? ");
		String foodType = sc.nextLine();
		return foodType;
	}
	public double truckRating(Scanner sc, FoodTruckApp ftApp, FoodTruck[] foodTruckArr) {
		boolean isRunning = true;
		double rating = 0;
		while (isRunning) {
			System.out.println("What rating between 1 and 10 do you give them?");
			rating = sc.nextDouble();
			sc.nextLine();
			if (rating < 1 || rating > 10) {
				System.out.println("Rating must be between 1 and 5");
			} else if (rating >=1 && rating <=10) {
				isRunning = false;
				break;
			}
		}
		return rating;
	}

	public void foodTrucks(Scanner sc, FoodTruckApp ftApp, FoodTruck[] foodTruckArr) {
		int i = 0;
		boolean isRunning = true;
		while (isRunning) {
			String name = foodTruckName(sc, ftApp, foodTruckArr);
			if (name.equalsIgnoreCase("quit")) {
				isRunning = false;
				ftApp.menu(sc, ftApp, foodTruckArr);
				break;
			}
			String foodType = ftApp.foodTruckType(sc, ftApp, foodTruckArr);
			double rating = ftApp.truckRating(sc, ftApp, foodTruckArr);
			foodTruckArr[i] = new FoodTruck(i, name, foodType, rating);
			i++;
		}
		
	}
	public void menu(Scanner input, FoodTruckApp ftApp, FoodTruck[] foodTruckArr) {
		boolean menu = true;
		while (menu) {
			System.out.println("------------------------------");
			System.out.println("1. List available food trucks");
			System.out.println("2. See average rating");
			System.out.println("3. See the highest-rated truck");
			System.out.println("4. QUIT");
			System.out.println("------------------------------");
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				ftApp.listFoodTrucks(foodTruckArr);
				break;
			case 2:
//				ftApp.averageRating(foodTruckArr);
				break;
			case 3:
//				ftApp.highestRated(foodTruckArr);
				break;
			case 4:
				System.out.println("Goodbye!");
				menu = false;
				System.exit(0);
				break;
			}
		}
	}

//	User Story #3 List all existing food trucks.
	public void listFoodTrucks(FoodTruck[] foodTruckArr) {
		for (int i = 0; i < foodTruckArr.length; i++) {
			if (foodTruckArr[i] == null) {
				continue;
			}
			System.out.println("------------------------");
			System.out.println(foodTruckArr[i].toString());
			System.out.println("------------------------");
		}
	}
//	User Story #3 See the average rating of food trucks.
	
//	User Story #3 Display the highest-rated food truck.

	

}
