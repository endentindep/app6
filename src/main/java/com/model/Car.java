package com.model;

public class Car {
	private String model;
	private int series;
	private int mileage;

	public Car(String m, int s, int mi) {
		model = m;
		series = s;
		mileage = mi;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public void setSeries(int series) {
		this.series = series;
	}

	public int getMileage() {
		return mileage;
	}

	public String getModel() {
		return model;
	}

	public int getSeries() {
		return series;
	}

	@Override
	public String toString() {
		return "Model: " + getModel() + ", series: " + getSeries() + ", mileage: " + getMileage();
	}
}
