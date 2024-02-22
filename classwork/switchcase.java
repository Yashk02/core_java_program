package classwork;
import java.util.Scanner;
public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter your choice");
		Scanner myObj = new Scanner(System.in);
		int choice = myObj.nextInt();
		int b = myObj.nextInt();
		int c = myObj.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println(b+c);
			break;
			
		case 2:
			System.out.println(b-c);
			break;
			
		case 3:
			System.out.println(b*c);
			break;
			
		case 4:
			System.out.println(b/c);
			break;
		}

	}

}
