import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
 * <applet code="jappletdemo" width=50000 height=10000>
 * </applet>
 */
public class jappletdemo extends JApplet
{
	
		JTextField jt1;
		JPasswordField jp1;
		JLabel jl1,jl2;
		JButton jb;
		public void init()
		{
			try
			{
				SwingUtilities.invokeAndWait(new Runnable()
				{
					public void run()
					{
						makeGUI();
						setBackground(new Color(255,255,255));
					}
				});
			}
			catch(Exception r)
			{}
		}
		public void makeGUI()
		{
			setLayout(new FlowLayout());
			jb=new JButton("login");
			
			jt1=new JTextField(15);
			
			jp1=new JPasswordField(15);
			jp1.setEchoChar('$');
			
			jl1=new JLabel("username   ");
			
			jl2=new JLabel("password   ");
			add(jl1);
			add(jt1);
			add(jl2);
			add(jp1);
			add(jb);
			
			//jt1.addActionListener(arg0);
			jb.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{
					jl1.setText(jt1.getText());
					jl2.setText(jp1.getText());
					showStatus(jt1.getText());
				}
			}
					);
			
		}

}
