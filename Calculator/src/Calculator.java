import java.util.Scanner;

public class Calculator {
	private double result;

	public void add(double number1, double number2) {
		this.result = number1 + number2;
	}

	public void subtract(double number1, double number2) {
		this.result = number1 - number2;
	}

	public void multiply(double number1, double number2) {
		this.result = number1 * number2;
	}

	public void divide(double number1, double number2) {
		this.result = number1 / number2;
	}

	public double getResult() {
		return this.result;
	}

}
