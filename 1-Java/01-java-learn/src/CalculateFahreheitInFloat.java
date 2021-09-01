import java.util.Scanner;

public class CalculateFahreheitInFloat {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the celsius");
		float celsius = scanner.nextInt();
		
		float fahrenheit =(celsius*9/5)+32;
		System.out.println("Fahrenheit ="+fahrenheit);


	}

}
