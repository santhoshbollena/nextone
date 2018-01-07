import java.util.Scanner;
public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=1;
		boolean f=true;
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(s);
		int n=s.length();
		String tok[]=new String[n];
		
		for(int i=0;i<n;i++)
		{
			tok[i]=s.substring(i,i+1);
		}
		
		
		for(int i=0;i<n;i++)
		{ c=1;
			f=true;
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					j=j+1;
				}
				if(j>=n)
				{
					break;
				}
				if(tok[i].equals(tok[j]))
				{
					c++;
					
					f=false;
				}
			}
			boolean t=false;
			for(int k=i-1;k>=0;k--)
			{
				if(tok[i].equals(tok[k]))
				{
					t=true;
				}
				
			}
			if(!t)
			{
				System.out.print(tok[i]+"="+c+"  ");
			}
					
			
			
		}
	}

}
