package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Car;
import com.model.CarList;

public class Service {
	public static List<Car> getCarList(int count) {
		List<Car> list = new ArrayList<>();
		int itertions = count <= 5 ? count : 5;
		for (int i = 0; i < itertions; i++) {
			list.add(CarList.getCar(i));
		}
		return list;
	}
}
