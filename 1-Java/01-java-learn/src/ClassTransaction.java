
public class ClassTransaction {

	private char type;
	private double amount;
	
	//constructor
	public Transaction(char type,double amount) {
		this.type = type;
		this.amount = amount;
	}
	
	public void displayTransaction(double balance) {
		System.out.printf("%4c %12.2f %8.2f\n",type,amount,balance);
		
	}
	public static void main(String args[]) {
		Transaction transaction1 = new Transaction('W',2000);
		Transaction transcation2 = new Transaction('D',20000);
		Transaction transcation3 = new Transaction('D',500);
		Transaction transcation4 = new Transaction('W',15500);
		Transaction transcation5 = new Transaction('W',10000);
		
		float[] scores = {48,55,78,25,22};
		Transaction transcationArray = (transaction1,transaction2,transaction3,transaction4,transaction5);
		
		for(Transaction transaction : transactionArray) {
			transaction.displayTransaction(5000);
		}
		
		
				
		
	}

}
