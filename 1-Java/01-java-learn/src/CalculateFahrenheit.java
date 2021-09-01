import java.util.Scanner;

public class CalculateFahrenheit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the celsius");
		int celsius = scanner.nextInt();
		
		int fahrenheit =(celsius*9/5)+32;
		System.out.println("Fahrenheit ="+fahrenheit);

	}

}
