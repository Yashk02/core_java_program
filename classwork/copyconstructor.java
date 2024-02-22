
package classwork;
import java.util.Scanner;

class employeeClass1 {
	int empId;
	String empname;
	double salary;
	employeeClass1() {
		
	}
	
	public employeeClass1(int a, String b, double d) {
		empId=a;
		empname=b;
		salary=d;
	}
	
	employeeClass1(employeeClass1 obj){
		empId=obj.empId;
		empname = obj.empname;
		salary = obj.salary;
	}

	void print_data() {
		System.out.println("\nemployee id" + empId + "\nemployee name" + empname + "\nemployee salary" + salary);
		
	}
}



public class copyconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("enter your values");
		
		Scanner myObj = new Scanner(System.in);
		
		int eid = myObj.nextInt();
		String ename = myObj.next();
		double esalary = myObj.nextDouble();
		
		employeeClass1 e1 = new employeeClass1(eid,ename,esalary);
		e1.print_data();
		employeeClass1 e2 = new employeeClass1 (e1);
		e2.print_data();
	
	}

}

