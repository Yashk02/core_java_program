package classwork;
import java.util.Scanner;

public class nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter your number");
		Scanner myObj = new Scanner(System.in);
		int a = myObj.nextInt();
		int b = myObj.nextInt();
		int c = myObj.nextInt();
		
		if(a>b) {
			if(a>c) {
				System.out.println(a + " is greatest");
			}
			
		}else if(b>c) {
			System.out.println(b + " is greatest");
			
		}else {
			System.out.println(c + " is greatest");
		}
		
		
				

	}

}
