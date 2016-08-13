package number;
import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long l=sc.nextInt();
		if(l>0)
		{
			System.out.println("positive");
		}
		else if(l<0)
		{
			System.out.println("negative");
		
		}
		else
		{
			System.out.println("zero");
		}
	}

}
