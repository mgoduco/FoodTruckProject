package com.skilldistillery.foodtruck.app;

public class FoodTruck {
	private static int nextTruckID;
	private int truckID;
	private String truckName;
	private String foodType;
	private double rating;
	
	public FoodTruck () { }

	public FoodTruck(int ID, String truckName, String foodType, double rating) {
		this.truckID = ID + 1;
		ID++;
		this.truckName = truckName;
		this.foodType = foodType;
		this.rating = rating;
	}

	public static int getNextTruckID() {
		return nextTruckID;
	}

	public static void setNextTruckID(int nextTruckID) {
		FoodTruck.nextTruckID = nextTruckID;
	}

	public int getTruckID() {
		return truckID;
	}

	public void setTruckID(int ID) {
		this.truckID = ID;
	}

	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String toString() {
		return "FoodTruck [truckID=" + truckID + ", truckName=" + truckName + ", foodType=" + foodType + ", rating="
				+ rating + "]";
	}

}
