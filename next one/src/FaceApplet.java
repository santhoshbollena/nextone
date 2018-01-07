import java.awt.*;
import java.applet.*;
/*
 * <applet code="FaceApplet" width=500 height=500>
 * </applet>
 */
public class FaceApplet extends Applet
{
	public void paint(Graphics g)
	{
		int sa=0,sw=90;
		Dimension d=getSize();
		for(int i=0;i<4;i++)
		{
			sa=i*sw;
			g.drawArc(d.width/2, d.width/2, d.width/2-10,  d.width/2-10, sa,sw);
		}
		for(int i=0;i<4;i++)
		{
			sa=i*sw;
			g.drawArc(d.width/2+25, d.width/2+30, d.width/2-90,  d.width/2-90, sa,sw);
		}
		for(int i=0;i<4;i++)
		{
			sa=i*sw;
			g.drawArc(d.width/2+55, d.width/2+30, d.width/2-90,  d.width/2-90, sa,sw);
		}
		g.drawLine(d.width/2+45, d.width/2+45, d.width/2+45, d.width/2+65);
		g.drawArc(d.width/2+10, d.width/2+10, d.width/2-30, d.width/2-30, 240, 70);
	}
}
