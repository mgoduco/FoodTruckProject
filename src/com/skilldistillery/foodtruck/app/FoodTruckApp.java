package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FoodTruck[] foodTruckArr = new FoodTruck[5];
		FoodTruckApp ftApp = new FoodTruckApp();
		ftApp.foodTrucks(sc, ftApp, foodTruckArr);
	}
//	User input for food truck name
	public String foodTruckName(Scanner sc, FoodTruckApp ftApp, FoodTruck[] foodTruckArr) {
		System.out.println("Enter the name of the food truck: ");
		String name = sc.nextLine();
		return name;
	}
//	User input for food truck type
	public String foodTruckType(Scanner sc, FoodTruckApp ftApp, FoodTruck[] foodTruckArr) {
		System.out.println("What kind of food does this truck sell? ");
		String foodType = sc.nextLine();
		return foodType;
	}
//	User input for food truck rating
	public double truckRating(Scanner sc, FoodTruckApp ftApp, FoodTruck[] foodTruckArr) {
		boolean isRunning = true;
		double rating = 0;
		while (isRunning) {
			System.out.println("What rating between 1 and 10 do you give them?");
			rating = sc.nextDouble();
			sc.nextLine();
			if (rating < 1 || rating > 10) {
				System.out.println("Rating must be between 1 and 10");
			} else if (rating >=1 && rating <=10) {
				isRunning = false;
				break;
			}
		}
		return rating;
	}
//	Method to assign truck name, type, and rating to each foodtruck if quit is entered ending loop
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
//	Menu for User Story #3 and User Story #4
	public void menu(Scanner input, FoodTruckApp ftApp, FoodTruck[] foodTruckArr) {
		boolean menu = true;
		while (menu) {
			System.out.println("1. List available food trucks");
			System.out.println("2. See average rating");
			System.out.println("3. See the highest-rated truck");
			System.out.println("4. QUIT");
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				ftApp.listFoodTrucks(foodTruckArr);
				break;
			case 2:
				ftApp.averageRating(foodTruckArr);
				break;
			case 3:
				ftApp.highestRated(foodTruckArr);
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
			System.out.println(foodTruckArr[i].toString());
		}
	}
//	User Story #3 See the average rating of food trucks.
	public void averageRating(FoodTruck[] foodTruckArr) {
		double sum = 0;
		double average = 0;
		int j = 0;
		for (int i = 0; i < foodTruckArr.length; i++) {
			if (foodTruckArr[i] == null) {
				continue;
			}
			sum += foodTruckArr[i].getRating();
			j++;
		}
		average = sum / j;
		System.out.println("Average rating is: " + average);
	}
//	User Story #3 Display the highest-rated food truck.
	public void highestRated(FoodTruck[] foodTruckArr) {
		double highestRated = 0;
		int j = 0;
		for(int i = 0; i < foodTruckArr.length; i++) {
			if (foodTruckArr[i] == null) {
				continue;
			} else if (foodTruckArr[i].getRating() > highestRated) {
				highestRated = foodTruckArr[i].getRating();
				j = i;
			}
		}
		System.out.println(foodTruckArr[j].toString());
	}
	

}
