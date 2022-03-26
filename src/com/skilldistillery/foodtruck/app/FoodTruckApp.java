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
	

	public void foodTrucks(Scanner sc, FoodTruckApp ftApp, FoodTruck[] foodTruckArr) {
		int i = 0;
		boolean isRunning = true;
		while (isRunning) {
			String name = foodTruckName(sc, ftApp, foodTruckArr);
			if (name.equalsIgnoreCase("quit")) {
				isRunning = false;
				break;
			}
		}i++;
	}
}
