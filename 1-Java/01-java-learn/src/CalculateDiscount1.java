import java.util.Scanner;
public class CalculateDiscount1 {

	public static void main(String[] args) {
		int billAmount;
		int percentageDiscount;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the bill amount");
	    billAmount = scanner.nextInt();
		System.out.println("enter the percentage discount");
		percentageDiscount = scanner.nextInt();
		
		int discount =(billAmount*percentageDiscount/100);
		System.out.println("Discount ="+discount);
		

	}

}

