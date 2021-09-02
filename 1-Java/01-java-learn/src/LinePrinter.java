
public class LinePrinter {

	public static void main(String[] arrgs){
		printLine();
		printLine(15);
		}
    public static void printLine() {
    	System.out.print("---------------------------");
    }
    public static void printLine(int numberOfCharacters) {
    	for(int i = 0;i < numberOfCharacters;i++) {
    		System.out.print("-");
    	}
    }
}
