package classwork;
import java.util.Scanner;
public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number");
		Scanner myObj = new Scanner(System.in);
		
		int i = myObj.nextInt();
		
		for (int j = 1; j<=10;j++) {
			System.out.println(j  + "*" + i + "=" + j*i);
		}
		

	}

}
