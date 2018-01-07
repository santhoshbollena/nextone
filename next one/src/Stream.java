import java.io.*;
public class Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fout=null;
		
		try
		{
			fout=new FileReader(args[0]);
			int i=fout.read();
			while(i!=-1)
			{
				System.out.println(i);
				i=fout.read();
			}
		}
		catch(FileNotFoundException r)
		{
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
		
		}
		try{
			if(fout!=null)
			{
				fout.close();
			}
		}
		catch (IOException r)
		{
			
		}

	}

}
