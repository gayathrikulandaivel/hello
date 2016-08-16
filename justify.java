package justify;

public class Justify {

	public static void main(String[] args) {
		String s1[]={"this","is","an","example","of","text","justification"};
		int l=s1.length;
		int i=0;
		int count=16;
		for(i=0;i<l;i++)
		{
			int l1=s1[i].length();
			if(l1<count)
			{
				System.out.print(s1[i]+" ");
				count=count-(l1+1);
			}
			else
			{
				System.out.print("\n");
				count=16;
				System.out.print(s1[i]+" ");
				count=count-(l1+1);
			}
		}

	}

}
