import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
 * <applet code="Moingcir" width=500 height=500>
 * </applet>
 */
public class Moingcir extends Applet implements Runnable
{
	int j=0;
	Thread t;
	public void init(){
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		
		while(true)
		{
			j=j%5;
			j++;
			repaint();
			try
			{
				t.sleep(1000);
			}
			catch(Exception r){}
		}
	}
	public void paint(Graphics g)
	{
		Color c1=new Color(255,0,0);
		Color c2=new Color(0,255,0);
		Color c3=new Color(0,0,255);
		Color c4=new Color(255,255,0);
		Color c[]={c1,c2,c3,c4};
		int sa=0;
		int sw=90;
		Dimension d=getSize();
		if(j==1)
		{
		for(int i=1;i<=5;i++){
		 sa=i*sw;
		g.drawArc(10, 10, d.width/2+100, d.height/2+100, sa, 90);
		g.setColor(c[i%(c.length)]);
		g.fillArc(10, 10, d.width/2+100, d.height/2+100, sa, 90);
		}
		}
		else if(j==2)
		{
		for(int i=1;i<5;i++){
		 sa=i*sw;
		g.drawArc(10, 10, d.width/2+100, d.height/2+100, sa, 90);
		g.setColor(c[i%c.length]);
		g.fillArc(10, 10, d.width/2+100, d.height/2+100, sa, 90);
		}
		}
		else if(j==3)
		{
		for(int i=1;i<=c.length;i++){
		 sa=i*sw;
		g.drawArc(10, 10, d.width/2+100, d.height/2+100, sa, 90);
		g.setColor(c[i%c.length]);
		g.fillArc(10, 10, d.width/2+100, d.height/2+100, sa, 90);
		}
		}
		else if(j==4)
		{
		for(int i=1;i<5;i++){
		 sa=i*sw;
		g.drawArc(10, 10, d.width/2+100, d.height/2+100, sa, 90);
		g.setColor(c[i%c.length]);
		g.fillArc(10, 10, d.width/2+100, d.height/2+100, sa, 90);
		}
		}
		
	}
}
