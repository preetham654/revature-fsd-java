import java.util.Scanner;

public class ValidateShortName {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the short name");
		string shortName = scanner.next();
		
		if (shortName >2&&<6) {
			System.out.println("this is valid short name");
		}else
			System.out.println("this is not valid short name");

	}

}
