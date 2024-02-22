package classwork;
import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter the year");
		try (Scanner myObj = new Scanner(System.in)) {
			int a = myObj.nextInt();
			
			if(a%4==0) {
				System.out.println("Year is leap");
			}else {
				System.out.println("Year is not leap");
			}
		}
		
	}

}
