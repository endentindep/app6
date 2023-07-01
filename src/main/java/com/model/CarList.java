package com.model;

import java.util.Arrays;
import java.util.List;

public class CarList {
	private static List<Car> carList = Arrays.asList(
			new Car("model1", 1, 1),
			new Car("model2", 2, 2),
			new Car("model3", 3, 3),
			new Car("model4", 4, 4),
			new Car("model5", 5, 5));

	public static void addCar(Car car) {
		carList.add(car);
	}

	public static Car getCar(int index) {
		return carList.get(index);
	}
}
