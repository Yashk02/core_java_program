package classwork;

class value{
	int a,b;
	void get_value(int x, int y) {
		a=x;
		b=y;
	}
	int add() {
		return a+b;
	}
	
	int mul() {
		return a*b;
	}
	
	int sub() {
		return a-b;
	}
	
	int div() {
		return a/b;
	}
}

class calc {

	public static void main(String[] args) {
		
		value v1 = new value();
		v1.get_value(12, 4);
		// TODO Auto-generated method stub
		System.out.println("sum is " + v1.add());
		System.out.println("sum is " + v1.sub());
		System.out.println("sum is " + v1.mul());
		System.out.println("sum is " + v1.div());
	}

}
