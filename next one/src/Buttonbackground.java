import java.awt.event.*;

import java.applet.*;
import java.awt.*;
/*
 * <applet code="Buttonbackground"
 * width=100 height=100
 * </applet>
 * 
 */
public class Buttonbackground extends Applet implements ActionListener
{
	Color c1,c2,c3;
	Button b1,b2,b3;
	public void init()
	{
		 b1=new Button("RED");
		 b2=new Button("GREEN");
		 b3=new Button("BLUE");
		  c1=new Color(255,0,0);
			 c2=new Color(0,255,0);
			 c3=new Color(0,0,255);
			if(b1.getActionCommand().equals("RED"))
			{
				b1.setBackground(c1);
			}
			 if(b2.getActionCommand().equals("GREEN"))
			{
				b2.setBackground(c2);
			}
			 if(b3.getActionCommand().equals("BLUE"))
			{
				b3.setBackground(c3);
			}
		add(b1);
		add(b2);
		add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand().equals("RED"))
		{
			setBackground(c1);
			showStatus("red is clicked"+ae.getActionCommand());
		}
		else if(ae.getActionCommand().equals("GREEN"))
		{
			 setBackground(c2);
			 showStatus("green is clicked");
		}
		else if(ae.getActionCommand().equals("BLUE"))
		{
			setBackground(c3);
			showStatus("blue is clicked");
		}
	}
	public void paint(Graphics g)
	{
		
		
	}
	
	

}
