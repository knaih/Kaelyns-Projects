package programs;

import java.util.Scanner;


public class Convert {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//variables
		int num;
		int base;
		int remainder;
		String value =  "";
		
		System.out.print("Enter base 10 number: ");
		num = scanner.nextInt();
		
		//keep asking until non-negative number
		while(num<0) {
			System.out.print("Enter base 10 number: ");
			num = scanner.nextInt();
		}
		
		System.out.print("Enter new base: ");
		base = scanner.nextInt();
		
		//keep asking until base is between 2 and 9
		while(base<2 || base >9) {
			System.out.print("Enter new base: ");
			base = scanner.nextInt();
		}
		
		//convert base 10 to new base
		while(num>0) {
			remainder = num % base;
			value = remainder + value;
			num = num/base;
		}
		
		//checks if value is empty and returns 0
		if(value.length()==0) {
			value = "0";
		}
		
		System.out.println("Value: " + value);
		
		
		scanner.close();
} 
}
