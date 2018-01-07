import java.util.Scanner;
interface ins
{
	void push(String s);
	String pop();
	void display();
}
class Stack implements ins
{
	int top;
	String st[];
	Stack(int size)
	{
		st=new String[size];
		top=-1;
	}
	public void push(String s)
	{
		if(st.length==top)
		{
			System.out.println("stack overflow");
		}
		else
		{
			top++;
			st[top]=s;
		}
	}
	public String pop()
	{
		
		String s=null;
		if(top<0)
		{
			System.out.println("stack under flow");
			return null;
		}
		else
		{
			s=st[top];
			top--;
		}
		
		return s;
	}
	public void display()
	{
		for(int i=top;i>=0;i--)
		{
			System.out.println(st[i]);
		}
	}
}
public class Stsckimp {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Stack o=new Stack(20);
		int  ch;
		Scanner sc=new Scanner(System.in);
		F:
		while(true)
		{
			System.out.println("1)push 2)pop 3) disp 4)exit");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("enter a String");
				String s;
				s=sc.next();
				o.push(s);
				break;
			case 2:
				s=o.pop();
				break;
			case 3:
				o.display();
				break;
			case 4:
				break F;
			}
			
		}
	}

}
