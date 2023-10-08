package model;

import util.FunctionType;

public class Employee {

	private String name;
	private FunctionType function;
	private double wage;

	public Employee(String name, FunctionType function, Double wage) {
		this.name = name;
		this.function = function;
		this.wage = wage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FunctionType getFunction() {
		return function;
	}

	public void setFunction(FunctionType function) {
		this.function = function;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}
}
