import java.util.StringTokenizer;
public class StringTokenizerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="a;s;d;f;g;h;h;j;k;";
		String  c=";";
		StringTokenizer o=new StringTokenizer(s,c,true);
		int n=o.countTokens();
		String str[]=new String[n];
		for(int i=0;i<n;i++)
		{
			str[i]=o.nextToken();
		}
		for(int i=n-1;i>=0;i--)
		{
			System.out.println(str[i]);
		}
		

	}

}
