package even;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		if(n%2==0){
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
		

	}

}
