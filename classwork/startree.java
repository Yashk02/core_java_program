package classwork;
import java.util.Scanner;

public class startree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number");
		Scanner myObj = new Scanner(System.in);
		
		int n = myObj.nextInt();
		
		for(int i = 1;i<=n;i++) {
			for(int j = 1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
