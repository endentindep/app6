package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.model.Car;
import com.model.CarList;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {
	public static void main(String[] args) {
		Car car1 = new Car("model1", 1, 1);
		Car car2 = new Car("model2", 2, 2);
		Car car3 = new Car("model3", 3, 3);
		Car car4 = new Car("model4", 4, 4);
		Car car5 = new Car("model5", 5, 5);
		CarList.addCar(car1);
		CarList.addCar(car2);
		CarList.addCar(car3);
		CarList.addCar(car4);
		CarList.addCar(car5);
		SpringApplication.run(Application.class, args);
	}
}
