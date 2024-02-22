package classwork;

import java.util.Arrays;

public class dataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] values = {12,34,56,67,99};
		String[] tech = {"php", "java", ".net", "pyhton"};
		

		int rollno;
		double percentage;
		char result;
		String name;
		boolean status;
		
		rollno = (int)1.1;
		percentage = 1;
		result = 'p';
		name = "yash";
		status = true;
		
		
//		System.out.println(percentage);
//		System.out.print(rollno);
		
		System.out.println(Arrays.toString(values));
		System.out.println(Arrays.toString(tech));
		
		name = tech[0];
		System.out.println(name);
		
		for (int i=0; i<tech.length-1; i++) {
			System.out.println(tech[i]);
		}
		
	}

}
