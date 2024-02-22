package classwork;
import java.util.Scanner;

class employeeClass {
	int empId;
	String empname;
	double salary;
	
	public employeeClass(int a, String b, double d) {
		empId=a;
		empname=b;
		salary=d;
	}
	
	void print_data() {
		System.out.println("\nemployee id" + empId + "\nemployee name" + empname + "\nemployee salary" + salary);
		
	}
}



public class parameterconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("enter your values");
		
		Scanner myObj = new Scanner(System.in);
		
		int eid = myObj.nextInt();
		String ename = myObj.next();
		double esalary = myObj.nextDouble();
		
		employeeClass e1 = new employeeClass(eid,ename,esalary);
		e1.print_data();
	
	}

}
