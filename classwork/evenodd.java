package classwork;
import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter your number");
		Scanner myObj = new Scanner(System.in);
		int a = myObj.nextInt();
		if(a%2==0) {
			System.out.println("a is even");
	
		}else {
			System.out.println("a is odd");
		}

	}

}
