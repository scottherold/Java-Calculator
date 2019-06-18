// Creating class as Java Bean
package com.sherold.calculator;
import java.io.Serializable;

public class Calculator implements Serializable {
	// <----- Attributes ----->
	private double operandOne;
	private double operandTwo;
	private char operation;
	
	// <----- Constructors ----->
	public Calculator() {
		operandOne = 0;
		operandTwo = 0;
		operation = '+';
	}
	
	public Calculator(double operandOne, double operandTwo, char operation) {
		this.operandOne = operandOne;
		this.operandTwo = operandTwo;
		this.operation = operation;			
	}
	
	// <----- Methods ----->
	// Private to only be accessed by getResults()
	private double performOperation() {
		double total = 0;
		// Event handler for operator
		if (operation == '+') {
			total = operandOne + operandTwo;
		} else {
			total = operandOne - operandTwo;
		}
		return total;		
	}
	
	// getResult calls performOperation after checking to make operation is of a valid type
	public void getResult() {
		// Event handler for + or -
		if (operation == '+' || operation == '-') {
			System.out.println(performOperation());
			return;
		} else {
			System.out.println("The operation must either be '+' or '-'. Please try again!");
			return;
		}
	}
	
	// <----- Getters/Setters ----->
	// operandOne
	public double getOperandOne() {
		return operandOne;
	}

	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}

	// operandTwo
	public double getOperandTwo() {
		return operandTwo;
	}

	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}

	// operation
	public char getOperation() {
		return operation;
	}

	public void setOperation(char operation) {
		this.operation = operation;
	}
	

}
