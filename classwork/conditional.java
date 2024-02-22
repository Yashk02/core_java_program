package classwork;
import java.util.Scanner;

public class conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter your number");
		Scanner myObj = new Scanner(System.in);
		int a = myObj.nextInt();
		int b = myObj.nextInt();
		
		if (a>b) {
			System.out.print(a + "is greater");
			
		}else {
			System.out.print(b + "is greater");
		}
		System.out.print("Exit");
	}

}
