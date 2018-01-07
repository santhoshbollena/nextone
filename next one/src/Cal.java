import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
/*
 * <applet code="Cal"width=1000 height=1000>
 * </applet>
 */
public class Cal extends JApplet implements ActionListener
{
	JTextField j;
	int x,y;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bp,bm,e;
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
		catch(Exception r){}
	}
	public void makeGUI()
	{
		
		setLayout(new FlowLayout());
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		b0=new JButton("0");
		bp=new JButton("+");
		bm=new JButton("-");
		e=new JButton("=");
		j=new JTextField(15);
		add(j);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b0);
		add(bp);
		add(bm);
		add(e);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		bp.addActionListener(this);
		bm.addActionListener(this);
		j.addActionListener(this);
		e.addActionListener(this);
	}
	String s="";
	int i=0;
	int r;
	int k;
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand().equals("="))
		{
			for(i=0;i<3;i++)
			{
			String st=(String)s.substring(i);
			switch(st)
			{
			case "+":
				
				
			}
			int j=Integer.parseInt(st);
			}
			showStatus(""+r);
			s="";
		}
		else
		{		
		s=s+ae.getActionCommand();
		j.setText(s);
		}
		
	}
	
	
}
