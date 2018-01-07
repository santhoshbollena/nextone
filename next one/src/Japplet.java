import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
 * <applet code="Japplet" width=5000 height=1000>
 * </applet>
 */
public class Japplet extends JApplet
{
	int red,green,blue;
	JScrollBar j1,j2,j3;
	public void init()
	{
		
		try{
		SwingUtilities.invokeAndWait(new Runnable()
		{
			public void run()
			{
				makeGUI();
			}
		});
		}
		catch(Exception e)
		{}
	}
	public void makeGUI()
	{
		setLayout(new FlowLayout());
		j1=new JScrollBar(JScrollBar.HORIZONTAL,0,1,0,255);
		 j2=new JScrollBar(JScrollBar.HORIZONTAL,0,1,0,255);
		 j3=new JScrollBar(JScrollBar.VERTICAL,0,1,0,255);
		j1.setPreferredSize(new Dimension(120,20));
		j2.setPreferredSize(new Dimension(120,20));
		j3.setPreferredSize(new Dimension(20,120));
		add(j1);add(j2);add(j3);
		j1.addAdjustmentListener(new AdjustmentListener()
		{
			public void adjustmentValueChanged(AdjustmentEvent ae)
			{
				red=ae.getValue();
				repaint();
			}
			
		});
		j2.addAdjustmentListener(new AdjustmentListener()
		{
			public void adjustmentValueChanged(AdjustmentEvent ae)
			{
				green=ae.getValue();
				repaint();
			}
		});
		j3.addAdjustmentListener(new AdjustmentListener()
		{
			public void adjustmentValueChanged(AdjustmentEvent ae)
			{
				blue=ae.getValue();
				repaint();
			}
		});
		
	}
	public void paint(Graphics g)
	{
		getContentPane().setBackground(new Color(red,green,blue));
	}
	

}
