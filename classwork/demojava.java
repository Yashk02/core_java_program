package classwork;
class B {
	B(){
		System.out.print("constructor called...");
	}
}
class employee{
	int empId;
	String empname;
	float salary;
	
	public employee() {
		
		empId = 1001;
		empname = "Yash";
		salary = 10000;
	}
	void print_data() {
		System.out.println("\nemployee id" + empId + "\nemployee name" + empname + "\nemployee salary" + salary);
	}
}

public class demojava {


	public static void main(String[] args) {
		B obj = new B();
		// TODO Auto-generated method stub
		
		employee e1 = new employee();
		e1.print_data();

	}

}
