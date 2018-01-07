
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
 * <applet code="Appletscrollbar" width=5000 height=1000>
 * </applet>
 */
public class Appletscrollbar extends Applet implements AdjustmentListener
{
	Scrollbar j1,j2,j3;
	int red1,green1,blue1;
	public void init()
	{
	
		 j1=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,255);
		 j2=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,255);
		 j3=new Scrollbar(Scrollbar.VERTICAL,0,1,0,255);
		j1.setPreferredSize(new Dimension(120,20));
		j2.setPreferredSize(new Dimension(120,20));
		j3.setPreferredSize(new Dimension(20,120));
		add(j1);add(j2);add(j3);
		j1.addAdjustmentListener(this);
		j2.addAdjustmentListener(this);
		j3.addAdjustmentListener(this);
		
		
	}
		public void adjustmentValueChanged(AdjustmentEvent ae)
		{
			red1=j1.getValue();
			green1=j2.getValue();
			blue1=j3.getValue();
			setBackground(new Color(red1,green1,blue1));
		}		

}
