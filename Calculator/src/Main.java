import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Calculator calculator = new Calculator();
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		while (true) {
			System.out.println("Enter the first number");
			double number1 = myObj.nextDouble();

			System.out.println("Enter the second number");
			double number2 = myObj.nextDouble();
			myObj.nextLine();

			System.out.println("""
					Enter the process that you want to do
					press + to add numbers
					press - to subtract numbers
					press * to multiply numbers
					press / to divide numbers
					press 0 for stop program""");
			String process = myObj.nextLine();
			switch (process) {
				case "+" -> {
					calculator.add(number1, number2);
					System.out.println(calculator.getResult());
					System.out.println("--------------------------------------------------");
				}
				case "-" -> {
					calculator.subtract(number1, number2);
					System.out.println(calculator.getResult());
					System.out.println("--------------------------------------------------");
				}
				case "*" -> {
					calculator.multiply(number1, number2);
					System.out.println(calculator.getResult());
					System.out.println("--------------------------------------------------");
				}
				case "/" -> {
					calculator.divide(number1, number2);
					System.out.println(calculator.getResult());
					System.out.println("--------------------------------------------------");
				}
				case "0" -> {
					input.close();
					return;
				}
				default -> System.out.println("There is not a process like that");
			}
		}
	}
}