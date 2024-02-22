package classwork;
import java.util.Scanner;

public class ifelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter your  percntage");
		Scanner myObj = new Scanner(System.in);
		
		double per = myObj.nextDouble();
		
		if(per>=75) {
			System.out.println("Distiction");
		}else if (per >=70 && per <75) {
			System.out.println("first");
		}else if (per >=60 && per <70) {
			System.out.println("second");
		}else if (per >=35 && per <60) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
	}

}
