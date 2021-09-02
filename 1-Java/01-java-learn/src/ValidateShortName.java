import java.util.Scanner;

public class ValidateShortName {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the short name");
		String shortName = scanner.next();
		
		if ((shortName.length()>=2) && (shortName.length()<=6)){
			System.out.println("this is valid short name");
		}else
			System.out.println("this is not valid short name");

	}

}
