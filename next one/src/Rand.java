import java.util.Random;
public class Rand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=500;
		Random re=new Random();
		
		for(int i=0;i<10;i++)
		{
			int r=re.nextInt(b/2);
		System.out.println(r);
	}}

}
