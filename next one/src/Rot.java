import java.awt.*;
import java.applet.*;
/*
 * <applet code="Rot" width=500 height=500>
 * </applet>
 */
public class Rot extends Applet implements Runnable
{
	int j=0;
	Thread t;
	public void init()
	{
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		while(true)
		{
		
		    j=j%8;
		    j++;
			repaint();
			try
			{
				t.sleep(500);
			}
			catch(Exception r){}
		}
	}
	public void paint(Graphics g)
	{
		int sa=0,sw=45;
		Color c1=new Color(255,0,0);
		Color c2=new Color(0,255,0);
		Color c3=new Color(0,0,255);
		Color c4=new Color(255,255,0);
		Color c5=new Color(255,0,255);
		Color c6=new Color(255,255,255);
		Color c7=new Color(0,0,0);
		Color c8=new Color(100,100,100);
		Color c[]={c1,c2,c3,c4,c5,c6,c7,c8};
		
		Dimension d=getSize();
		for(int i=0;i<8;i++)
		{
				sa=i*sw;
				g.drawArc(d.width/2, d.width/2,d.width/2+10, d.width/2+10, sa, sw);
				g.setColor(c[j%c.length]);
				g.fillArc(d.width/2, d.width/2,d.width/2+10, d.width/2+10, sa, sw);	
				j++;
		}
		
		
	}

}
