import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
 * <applet code="Appletex"
 * width=1000 height=1000
 * </applet>
 * 
 */
public class Appletex extends Applet 
{
	String msg="";
	public void init()
	{
		Button b=new Button("RED");
		add(b);
		b.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent r)
			{
				msg="mouse entered";
				repaint();
			}
			public void mouseClicked(MouseEvent r)
			{
				msg="mouse clicked";
				repaint();
			}
			public void mouseExited(MouseEvent r)
			{
				msg="mouse exited";
				repaint();
			}
		});
		repaint();
		
	}
	public void paint(Graphics g)
	{
		
		Dimension d=getSize();
		g.drawLine(20, 20, d.width/2, d.height/2);
		
		g.drawString(msg, 40, 40);
	}
}
