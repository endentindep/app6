package com.model;

import java.util.ArrayList;
import java.util.List;

public class CarList {
	private static List<Car> carList = new ArrayList<>();

	public static void addCar(Car car) {
		carList.add(car);
	}

	public static Car getCar(int index) {
		return carList.get(index);
	}
}
