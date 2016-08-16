package reverse;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder(sc.nextLine());
		sb.reverse();
		System.out.println(sb);
		String s1=sb.toString();
		String s2=new String();
		int l=s1.length();
		s2=s1.replaceAll("[aeiouAEIOU]","");
		System.out.println(s2);
	}

}
