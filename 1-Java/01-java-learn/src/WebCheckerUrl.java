import java.util.Scanner;

public class WebCheckerUrl{

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the website address");
		String url = scanner.nextLine();
		
		if(url.startsWith("http://") || url.startsWith("https://")){
			System.out.println("This is web url");
		}else {
				System.out.println("This is not web url");
			}
		}

}
