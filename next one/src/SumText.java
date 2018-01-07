import javax.swing.*;

import java.awt.event.*;
import java.awt.*;
/*
 * <applet code="SumText" width=5000 height=1000>
 * </applet>
 */
public class SumText extends JApplet implements ActionListener{

		JTextField jt1,jt2;
		JButton jb;
		JLabel jl;
		public void init()
		{
			try
			{
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
			jt1=new JTextField(15);
			jt2=new JTextField(15);
			jl=new JLabel("sum is here");
			jb=new JButton("press to get sum");
			add(jt1);
			add(jt2);
			add(jb);
			add(jl);
			jb.addActionListener(this);
		}
		public void actionPerformed(ActionEvent ae){
			//int i=Integer.parseInt(jt1.getText());
			//int j=Integer.parseInt(jt2.getText());
			//int k=i+j;
			String s=jt1.getText();
			String s1=jt2.getText();
			if(s1.equals("red"))
			{
				getContentPane().setBackground(new Color(255,0,0));
			}
			jl.setText(""+s+s1);
		}
		
}
