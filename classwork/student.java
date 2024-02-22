package classwork;

class yash{
	int rollno;
	String name;
	double per;
	
	void get_value  (int a,String b,double c) {
		rollno = a;
		name = b;
		per = c;
	}
	void print_value() {
		System.out.println("rollno :" + rollno);
		System.out.println("name :" + name);
		System.out.println("per :" + per);
	}
}

public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("hello world....");
//		System.out.println("Welcome from yash");
		yash s1 = new yash();
		s1.get_value(10,"yash",89.9);
		s1.print_value();

	}

}
