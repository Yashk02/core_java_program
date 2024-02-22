package classwork;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 5, fact = 1;
		
		while(i>=1) {
			
			System.out.println(i);
			fact=fact*i;
			i--;
		}
		System.out.println("fact." + fact);
		
	}

}
