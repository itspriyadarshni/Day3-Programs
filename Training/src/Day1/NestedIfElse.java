package Day1;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to check");
		int num = s.nextInt();
		if(num%5==0 || num%3==0)
		{
			if(num%5==0 && num%3==0)
			{
				System.out.println("Hi Bye");
			}
			if(num%5==0) {
				System.out.println("Hi");
			}
			
			
		}

	}

}
