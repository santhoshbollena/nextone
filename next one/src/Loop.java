
public class Loop {
	public static void main(String args[])
	{
	 int k=2;
	
	 Outer:
		 while(true)
		 {
			 Inner:
				 for(int j=6;j>2;j--)
				 {
					 continue Inner;
					 break Outer;
				 }
		 }
}}
