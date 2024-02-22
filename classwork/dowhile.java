package classwork;

public class dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 5, fact = 1;
		do {
			fact=fact*i;
			i--;
			
		}while(i>=1);
		System.out.println("fact." + fact);

	}

}
