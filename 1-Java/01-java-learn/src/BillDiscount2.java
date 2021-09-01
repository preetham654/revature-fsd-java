import java.util.Scanner
public class BillDiscount2 {

	public static void main(String[] args) {
		float billAmount;
		float percentageDiscount;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the bill amount");
	    billAmount = scanner.nextInt();
		System.out.println("enter the percentage discount");
		percentageDiscount = scanner.nextInt();
		
		float discount =(billAmount*percentageDiscount/100);
		System.out.println("Discount ="+discount);
		


	}

}
